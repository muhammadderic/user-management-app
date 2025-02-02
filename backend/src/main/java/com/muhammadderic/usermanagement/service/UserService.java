package com.muhammadderic.usermanagement.service;

import com.muhammadderic.usermanagement.entity.User;
import com.muhammadderic.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // Add a user
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Get a user by username
    public User getUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    // Update a user
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Delete a user
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }
}
