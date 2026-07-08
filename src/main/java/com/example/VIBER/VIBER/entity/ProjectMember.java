package com.example.VIBER.VIBER.entity;

import com.example.VIBER.VIBER.entity.enums.UserRole;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class ProjectMember {
    @EmbeddedId
    ProjectMemberId id;
    UserRole role;

    @ManyToOne
    @MapsId("projectId")
    Project project;

    @ManyToOne
    @MapsId("userId")
    Users user;

    Instant invitedAt;
    Instant acceptedAt;


}
