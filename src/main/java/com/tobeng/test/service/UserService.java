package com.tobeng.test.service;

import com.tobeng.test.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> getAll();

}
