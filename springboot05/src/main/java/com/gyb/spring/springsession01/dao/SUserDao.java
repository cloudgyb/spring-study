package com.gyb.spring.springsession01.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author gengyuanbo
 * 2019/01/22
 */

@Repository
@Scope("prototype")
public class SUserDao {
    private JdbcTemplate jdbcTemplate;

    public SUserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int delete(int id){
        int i = 0;
        i = jdbcTemplate.update("delete from t_user where id=?", id);
        return i;
    }
}
