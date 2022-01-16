package com.eloaca.dsmovie.dto;

import com.eloaca.dsmovie.domain.Score;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double score;

}
