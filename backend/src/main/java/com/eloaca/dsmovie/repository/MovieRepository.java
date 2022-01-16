package com.eloaca.dsmovie.repository;

import com.eloaca.dsmovie.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
