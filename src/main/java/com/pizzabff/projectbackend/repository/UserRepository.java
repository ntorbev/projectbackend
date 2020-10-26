package com.pizzabff.projectbackend.repository;


import com.pizzabff.projectbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
