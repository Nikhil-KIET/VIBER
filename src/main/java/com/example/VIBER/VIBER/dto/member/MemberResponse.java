package com.example.VIBER.VIBER.dto.member;


import com.example.VIBER.VIBER.entity.enums.UserRole;



public record MemberResponse(

        Long userId,
        UserRole role,
        String name,
        String email









) {
}
