package com.example.VIBER.VIBER.entity;

import com.example.VIBER.VIBER.entity.enums.ChatRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;
    Project project;
    Users user;
    ChatRole role;
    String content;
    String toolCalls;

    Integer tokensUsed;

    Instant createdAt;

}
