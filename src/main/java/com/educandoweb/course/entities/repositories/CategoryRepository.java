package com.educandoweb.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
