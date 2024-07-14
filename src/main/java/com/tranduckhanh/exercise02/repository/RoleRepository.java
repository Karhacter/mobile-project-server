package com.tranduckhanh.exercise02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranduckhanh.exercise02.entity.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}