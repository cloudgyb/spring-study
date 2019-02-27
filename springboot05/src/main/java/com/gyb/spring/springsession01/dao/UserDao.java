package com.gyb.spring.springsession01.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author gengyuanbo
 * 2019/01/22
 */

@Repository
@Scope("prototype")
public class UserDao {
    private Connection conn;

    @Autowired
    public UserDao(Connection conn) {
        this.conn = conn;
    }

    public int delete(int id){
        PreparedStatement ps = null;
        int i = 0;
        try {
            ps = conn.prepareStatement("delete from t_user where id=?");
            ps.setInt(1,id);
            i = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if(ps != null)
                    ps.close();
                if(conn != null)
                    conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return i;
    }
}
