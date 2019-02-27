package com.gyb.spring.springsession01.service;

import com.gyb.spring.springsession01.dao.SOtherDao;
import com.gyb.spring.springsession01.dao.SUserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author gengyuanbo
 * 2019/01/22
 */

@Service
@Transactional
public class UserService {
    private SUserDao userDao;
    private SOtherDao otherDao;

    public UserService(SUserDao userDao, SOtherDao otherDao) {
        this.userDao = userDao;
        this.otherDao = otherDao;
    }


    public void deleteUser(int id) {
        otherDao.delete(id);
        if(true)
            throw new RuntimeException("test");
        userDao.delete(id);
    }
}
