package com.eloaca.dsmovie.service;

import com.eloaca.dsmovie.dto.MovieDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface MovieService {

    Page<MovieDTO> findAll(final Pageable pageable);

    MovieDTO findById(final Long id);
}
