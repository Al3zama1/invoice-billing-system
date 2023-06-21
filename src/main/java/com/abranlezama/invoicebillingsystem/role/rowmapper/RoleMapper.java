package com.abranlezama.invoicebillingsystem.role.rowmapper;

import com.abranlezama.invoicebillingsystem.role.Role;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleMapper implements RowMapper<Role> {
    @Override
    public Role mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return  Role.builder()
                .roleId(resultSet.getLong("role_id"))
                .name(resultSet.getString("name"))
                .permission(resultSet.getString("permission"))
                .build();
    }
}
