package com.example.VIBER.VIBER.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectMemberId {

    Long projectId;
    Long userId;
}
