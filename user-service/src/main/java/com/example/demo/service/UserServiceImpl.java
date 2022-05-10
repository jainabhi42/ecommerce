package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserRoleRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	    @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private UserRoleRepository userRoleRepository;

	    @Override
	    public List<User> getAllUsers() {
	        return (List<User>) userRepository.findAll();
	    }

	    @Override
	    public Optional<User> getUserById(Long id) {
	        return  userRepository.findById(id);
	    }

	    @Override
	    public User getUserByName(String userName) {
	        return userRepository.findByUserName(userName);
	    }

	    @Override
	    public User saveUser(User user) {
	        user.setActive(1);
	       // UserRole role = userRoleRepository.findUserRoleByRoleName("ROLE_USER");
	        //user.setRole(role);
	        return userRepository.save(user);
	    }

}
