package com.eloaca.dsmovie.controller;

import com.eloaca.dsmovie.dto.MovieDTO;
import com.eloaca.dsmovie.dto.ScoreDTO;
import com.eloaca.dsmovie.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/scores")
@AllArgsConstructor
public class ScoreController {

    final ScoreService service;

    @PutMapping("/save")
    public MovieDTO saveScore(@RequestBody final ScoreDTO dto){
        return service.save(dto);
    }
}
