package com.andrealves.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
