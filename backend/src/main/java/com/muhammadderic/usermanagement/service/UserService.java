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
}
