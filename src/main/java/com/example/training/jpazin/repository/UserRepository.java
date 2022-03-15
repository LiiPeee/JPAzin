package com.example.training.jpazin.repository;

import com.example.training.jpazin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
