package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.User;

import java.util.Optional;

public interface UserDao extends ReadWriteDao<User, Long> {
    User findById(Long id);
    User findUserByUsername(String username);
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserByIdProvider(String id);
    User findUserByActivationCode(String activationCode);
}
