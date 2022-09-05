package com.kata.pp_311_springboot.dao;

import com.kata.pp_311_springboot.model.User;

import java.util.List;

public interface UserDao {

    User save(User user);

    void deleteById(Long id);

    User findById(Long id);

    List<User> findAll();
}
