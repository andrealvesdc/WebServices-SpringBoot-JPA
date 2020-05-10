package com.andrealves.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
