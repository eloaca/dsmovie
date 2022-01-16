package com.eloaca.dsmovie.dto;

import com.eloaca.dsmovie.domain.Score;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDTO {

    private ScorePKDTO id = new ScorePKDTO();
    private Double value;

    public ScoreDTO(Score score){
        this.id = new ScorePKDTO(score.getId());
        this.value = score.getValue();
    }
}
