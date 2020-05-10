package com.andrealves.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
