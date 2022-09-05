package com.kata.pp_311_springboot.repository;

import com.kata.pp_311_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
