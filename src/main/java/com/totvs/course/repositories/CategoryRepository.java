package com.totvs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.totvs.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
