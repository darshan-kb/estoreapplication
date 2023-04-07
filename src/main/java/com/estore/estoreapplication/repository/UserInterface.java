package com.estore.estoreapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.estore.estoreapplication.entities.User;

@Repository
public interface UserInterface extends CrudRepository<User, Integer>{

}
