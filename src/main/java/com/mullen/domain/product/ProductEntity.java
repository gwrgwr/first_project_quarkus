package com.mullen.domain.product;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.annotation.PostConstruct;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@RegisterForReflection
public class ProductEntity {
    private ObjectId id;

    private String name;

    private String description;

    private double price;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public ProductEntity(ObjectId id, String name, String description, double price, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ProductEntity() {}
}
