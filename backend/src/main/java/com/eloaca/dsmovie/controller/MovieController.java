package com.eloaca.dsmovie.controller;

import com.eloaca.dsmovie.dto.MovieDTO;
import com.eloaca.dsmovie.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "v1/movies")
@AllArgsConstructor
public class MovieController {

    private final MovieService service;

    @GetMapping
    public Page<MovieDTO> findAll(final Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/{id}")
    public MovieDTO findById(@PathVariable final Long id) {
        return service.findById(id);
    }
}
