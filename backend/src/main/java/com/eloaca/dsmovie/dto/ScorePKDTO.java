package com.eloaca.dsmovie.dto;

import com.eloaca.dsmovie.domain.Movie;
import com.eloaca.dsmovie.domain.ScorePK;
import com.eloaca.dsmovie.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ScorePKDTO {

    private Movie movie;
    private User user;

    public ScorePKDTO(ScorePK scorePK){
        this.movie = scorePK.getMovie();
        this.user = scorePK.getUser();
    }
}
