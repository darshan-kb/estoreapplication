package com.estore.estoreapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estore.estoreapplication.entities.User;

@Repository
public interface UserInterface extends JpaRepository<User, Integer>{

}
