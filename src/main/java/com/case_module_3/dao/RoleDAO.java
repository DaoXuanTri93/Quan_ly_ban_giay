package com.case_module_3.dao;

import com.case_module_3.connect_MySQL.ConnectMySQL;
import com.case_module_3.model.Customer;
import com.case_module_3.model.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleDAO implements IRole{
    ConnectMySQL connectionSQL = new ConnectMySQL();
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    @Override
    public List<Role> selectAllRole() throws ClassNotFoundException, SQLException {
        List<Role> roles = new ArrayList<>();
        String query = "SELECT * FROM role ";
        connection = connectionSQL.getConnection();
        ps = connection.prepareStatement(query);
        rs = ps.executeQuery();
        while (rs.next()){
            int id = rs.getInt("idRole");
            String role = rs.getString("role");
            roles.add(new Role(id,role));
        }
        connection.close();
        return roles;
    }

    @Override
    public void insertRole(Role role) throws SQLException, ClassNotFoundException {

    }

    @Override
    public Role selectRole(int id) throws SQLException, ClassNotFoundException {

        return null;
    }

    @Override
    public boolean deleteRole(int id) {
        return false;
    }

    @Override
    public boolean updateRole(Role role) {
        return false;
    }
}
