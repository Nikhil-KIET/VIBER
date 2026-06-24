package com.example.VIBER.VIBER.entity;

import com.example.VIBER.VIBER.entity.enums.UserRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class ProjectMember {
    ProjectMemberId id;
    UserRole role;
    Project project;
    Users user;
    Instant invitedAt;
    Instant acceptedAt;


}
