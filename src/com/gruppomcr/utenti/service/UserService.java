package com.gruppomcr.utenti.service;

import com.gruppomcr.utenti.dao.User;

import java.util.List;

/**
 * Created by Admin on 19/07/2017.
 */
public interface UserService {
    User findById(long id);

    User findByName(String userName);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    boolean userExist(User user);
}
