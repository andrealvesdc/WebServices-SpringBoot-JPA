package com.andrealves.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
