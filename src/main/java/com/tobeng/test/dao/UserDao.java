package com.tobeng.test.dao;

import com.tobeng.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>, Serializable {
}
