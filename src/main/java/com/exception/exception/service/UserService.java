package com.exception.exception.service;

import com.exception.exception.model.User;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    User getUserById(Long id);
    String deleteUserById(Long id);
}
