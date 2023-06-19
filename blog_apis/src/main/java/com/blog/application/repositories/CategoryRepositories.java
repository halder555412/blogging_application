package com.blog.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.application.entities.Category;

public interface CategoryRepositories extends JpaRepository<Category, Integer>{

}
