package com.gyb.spring.springboot05.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author gengyuanbo
 * 2019/01/22
 */

@Repository
@Scope("prototype")
public class SOtherDao {
    private JdbcTemplate jdbcTemplate;

    public SOtherDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int delete(int id) {
        PreparedStatement ps = null;
        Connection conn = null;
        int i = 0;
        i = jdbcTemplate.update("delete from t_other where id=?", id);

        return i;
    }
}
