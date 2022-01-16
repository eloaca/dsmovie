package com.eloaca.dsmovie.repository;

import com.eloaca.dsmovie.domain.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
