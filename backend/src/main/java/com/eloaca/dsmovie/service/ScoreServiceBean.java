package com.eloaca.dsmovie.service;

import com.eloaca.dsmovie.domain.Movie;
import com.eloaca.dsmovie.domain.Score;
import com.eloaca.dsmovie.domain.ScorePK;
import com.eloaca.dsmovie.domain.User;
import com.eloaca.dsmovie.dto.MovieDTO;
import com.eloaca.dsmovie.dto.ScoreDTO;
import com.eloaca.dsmovie.repository.MovieRepository;
import com.eloaca.dsmovie.repository.ScoreRepository;
import com.eloaca.dsmovie.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@AllArgsConstructor
public class ScoreServiceBean implements ScoreService {

    final ScoreRepository repository;
    final MovieRepository movieRepository;
    final UserRepository userRepository;

    @Override
    @Transactional(readOnly = false)
    public MovieDTO save(ScoreDTO dto) {
        var user = userRepository.findByEmail(dto.getEmail());
        var usuario = new User();
        if (user.isEmpty()) {
            usuario.setEmail(dto.getEmail());
            usuario = userRepository.saveAndFlush(usuario);
        } else {
            usuario = user.get();
        }
        var movie = this.movieRepository.findById(dto.getMovieId()).get();
        var score = new Score(new ScorePK(movie, usuario), dto.getScore());
        score = repository.saveAndFlush(score);

        var soma = 0.0;

        for (Score s : movie.getScores()){
            soma = soma + s.getValue();
        }

        var avg = soma / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movie = movieRepository.saveAndFlush(movie);

        return new MovieDTO(movie);
    }
}
