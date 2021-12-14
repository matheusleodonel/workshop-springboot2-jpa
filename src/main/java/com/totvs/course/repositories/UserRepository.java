package com.totvs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.totvs.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
