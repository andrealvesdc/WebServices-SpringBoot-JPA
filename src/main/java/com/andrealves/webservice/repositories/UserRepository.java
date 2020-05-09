package com.andrealves.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
