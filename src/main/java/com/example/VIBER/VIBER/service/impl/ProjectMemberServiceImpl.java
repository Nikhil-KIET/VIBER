package com.example.VIBER.VIBER.service.impl;

import com.example.VIBER.VIBER.dto.auth.UserProfileResponse;
import com.example.VIBER.VIBER.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<UserProfileResponse> getAllProjectMembers(Long id) {
        return List.of();
    }

    @Override
    public UserProfileResponse inviteUser() {
        return null;
    }

    @Override
    public String deleteMember() {
        return "";
    }

    @Override
    public UserProfileResponse updateMember() {
        return null;
    }
}
