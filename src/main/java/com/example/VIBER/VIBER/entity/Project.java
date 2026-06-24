package com.example.VIBER.VIBER.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.apache.catalina.User;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Project {
    Long id;
    String name;
    Users owner;
    Boolean isPublic;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;

}
