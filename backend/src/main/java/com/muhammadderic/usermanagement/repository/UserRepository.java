package com.muhammadderic.usermanagement.repository;

import com.muhammadderic.usermanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    // a custom query method that retrieves a User entity from the database based on the username field.
    public User findUserByUsername(String name);
}
