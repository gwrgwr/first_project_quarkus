package com.mullen.controller;

import com.mullen.domain.user.UserEntity;
import com.mullen.domain.user.dto.request.CreateUserDTO;
import com.mullen.services.UserService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.jboss.logging.Logger;


@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class UserController {

    @Inject
    UserService userService;

    private static final Logger LOG = Logger.getLogger(UserController.class);

    @GET
    @Path("/{userId}")
    public UserEntity getUser(String userId) {
        LOG.info("Fetching user with ID: " + userId);
        return userService.findById(userId);
    }

    @POST
    public UserEntity createUser(CreateUserDTO createUserDTO) {
        LOG.info("Creating user with name: " + createUserDTO.name());
        return userService.save(createUserDTO);
    }
}
