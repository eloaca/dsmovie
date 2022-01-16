package com.eloaca.dsmovie.repository;

import com.eloaca.dsmovie.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
