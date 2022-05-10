package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;

public interface UserService {
	List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User getUserByName(String userName);
    User saveUser(User user);

}
