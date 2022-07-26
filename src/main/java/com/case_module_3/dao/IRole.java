package com.case_module_3.dao;

import com.case_module_3.model.Customer;
import com.case_module_3.model.Role;

import java.sql.SQLException;
import java.util.List;

public interface IRole {
    List<Role> selectAllRole() throws ClassNotFoundException, SQLException;
    void insertRole(Role role) throws SQLException, ClassNotFoundException;
    Role selectRole(int id) throws SQLException, ClassNotFoundException;
    boolean deleteRole(int id);
    boolean updateRole(Role role);
}
