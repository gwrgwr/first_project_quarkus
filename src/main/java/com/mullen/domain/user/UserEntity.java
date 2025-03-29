package com.mullen.domain.user;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonId;

import java.time.LocalDateTime;


@MongoEntity(collection = "users", database = "test")
public class UserEntity extends PanacheMongoEntity {

    public String name;

    public String email;

    public String password;

    public boolean active;

    public LocalDateTime createdAt;

    public LocalDateTime updatedAt;
}
