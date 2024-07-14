package com.tranduckhanh.exercise02.service;

import java.util.List;

import com.tranduckhanh.exercise02.entity.Role;

public interface RoleService {
    Role createRole(Role role);

    Role getRoleById(String roleId);

    List<Role> getAllRoles();

    Role updateRole(Role role);

    void deleteRole(String roleId);
}