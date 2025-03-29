package com.mullen.services;

import com.mullen.domain.user.UserEntity;
import com.mullen.domain.user.dto.request.CreateUserDTO;
import com.mullen.exception.UserNotFoundException;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@ApplicationScoped
public class UserService {

    public UserEntity findById(String userId) {
        ObjectId objectId = new ObjectId(userId);
        return (UserEntity) UserEntity.findByIdOptional(objectId).orElseThrow(UserNotFoundException::new);
    }

    public UserEntity save(CreateUserDTO createUserDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.name = createUserDTO.name();
        userEntity.email = createUserDTO.email();
        userEntity.password = createUserDTO.password();
        userEntity.active = true;
        userEntity.createdAt = LocalDateTime.now();
        userEntity.updatedAt = null;
        UserEntity.persist(userEntity);
        return userEntity;
    }
}
