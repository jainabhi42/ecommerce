package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
	 UserRole findUserRoleByRoleName(String roleName);

}
