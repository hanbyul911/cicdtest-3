package com.example.cicdtest3.repository;

import com.example.cicdtest3.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
