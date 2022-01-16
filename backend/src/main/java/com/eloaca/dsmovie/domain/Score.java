package com.eloaca.dsmovie.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Score {

    @EmbeddedId
    private ScorePK id = new ScorePK();

    @Column
    private Double value;
}
