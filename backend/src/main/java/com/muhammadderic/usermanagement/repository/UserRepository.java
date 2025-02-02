package com.muhammadderic.usermanagement.repository;

import com.muhammadderic.usermanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
