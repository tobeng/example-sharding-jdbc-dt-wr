package com.tobeng.test.service.impl;

import com.tobeng.test.dao.UserDao;
import com.tobeng.test.entity.User;
import com.tobeng.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.saveAndFlush(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
