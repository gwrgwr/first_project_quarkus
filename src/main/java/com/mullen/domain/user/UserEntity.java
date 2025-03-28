package com.mullen.domain.user;

import com.mullen.domain.products.ProductsEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;
import jakarta.persistence.*;
import org.bson.codecs.pojo.annotations.BsonId;

import java.util.List;

@MongoEntity
public class UserEntity extends PanacheMongoEntityBase {

    @BsonId
    public String id;

    public String name;

    public String email;

    public String password;

    @OneToMany(mappedBy = "user")
    public List<ProductsEntity> products;
}
