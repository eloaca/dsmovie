package com.eloaca.dsmovie.service;

import com.eloaca.dsmovie.dto.MovieDTO;
import com.eloaca.dsmovie.dto.ScoreDTO;

public interface ScoreService {

    MovieDTO save(final ScoreDTO dto);
}
