package org.example.testfinal.services;

import org.example.testfinal.models.User;

import java.util.Optional;

public interface IUserService {
    public User registerUser(User user);
    public Optional<User> findByEmail(String email);
    public Optional<User> findByUsername(String username);
}
