package com.mullen.controller;

import com.mullen.domain.user.UserEntity;
import com.mullen.services.UserService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class UserController {

    @Inject
    UserService userService;

    @GET
    @Path("/{userId}")
    public UserEntity getUser(String userId) {
        return userService.findById(userId);
    }

    @POST
    public UserEntity createUser(UserEntity userEntity) {
        return userService.save(userEntity);
    }
}
