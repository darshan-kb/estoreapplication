package com.estore.estoreapplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.estore.estoreapplication.entities.User;

@Repository
public interface LoginInterface extends CrudRepository<User, Integer>{	
List<User> findByNameAndPassword(String username,String Password);

User findByEmailAndPassword(String email, String password);

User findByEmail(String email);
}
