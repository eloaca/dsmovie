package com.eloaca.dsmovie.service;

import com.eloaca.dsmovie.domain.Movie;
import com.eloaca.dsmovie.dto.MovieDTO;
import com.eloaca.dsmovie.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MovieServiceBean implements MovieService {

    private final MovieRepository repository;
    
    @Override
    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(final Pageable pageable) {
        Page<MovieDTO> dtos = repository.findAll(pageable).map(m -> new MovieDTO(m));
        return dtos;
    }

    @Override
    public MovieDTO findById(final Long id) {
        return new MovieDTO(repository.findById(id).get());
    }
}
