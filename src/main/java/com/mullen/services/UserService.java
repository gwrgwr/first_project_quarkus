package com.mullen.services;

import com.mullen.domain.user.UserEntity;
import com.mullen.exception.UserNotFoundException;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

    public UserEntity findById(String userId) {
        return (UserEntity) UserEntity.findByIdOptional(userId).orElseThrow(UserNotFoundException::new);
    }

    public UserEntity save(UserEntity userEntity) {
        UserEntity.persist(userEntity);
        return userEntity;
    }
}
