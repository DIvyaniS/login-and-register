package com.hellokoding.auth.service;

import com.hellokoding.auth.model.User;

public interface UserService {
    void save(User user);
    void updatemoney(User user);

    User findByUsername(String username);
}
