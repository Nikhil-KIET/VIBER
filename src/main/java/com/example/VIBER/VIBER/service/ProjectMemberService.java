package com.example.VIBER.VIBER.service;

import com.example.VIBER.VIBER.dto.auth.UserProfileResponse;
import com.example.VIBER.VIBER.dto.member.MemberResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
     List<MemberResponse> getAllProjectMembers(Long id);

     UserProfileResponse inviteUser();

   String deleteMember();

   UserProfileResponse updateMember();
}
