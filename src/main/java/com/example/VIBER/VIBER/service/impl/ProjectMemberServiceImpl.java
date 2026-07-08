package com.example.VIBER.VIBER.service.impl;

import com.example.VIBER.VIBER.dto.auth.UserProfileResponse;
import com.example.VIBER.VIBER.dto.member.MemberResponse;
import com.example.VIBER.VIBER.entity.ProjectMember;
import com.example.VIBER.VIBER.entity.Users;
import com.example.VIBER.VIBER.mapper.ProjectMemberMapper;
import com.example.VIBER.VIBER.repository.ProjectMemberRepo;
import com.example.VIBER.VIBER.repository.UsersRepo;
import com.example.VIBER.VIBER.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectMemberServiceImpl implements ProjectMemberService  {

    private final ProjectMemberRepo projectMemberRepo;
    private final UsersRepo usersRepo;

    private final ProjectMemberMapper projectMemberMapper;


    @Override
    public List<MemberResponse> getAllProjectMembers(Long id) {

        Optional<Users>user=usersRepo.findById(id);
        if(user==null){
            throw new RuntimeException("User not found");
        }
       List<ProjectMember>members= projectMemberRepo.findByIdProjectId(id);

        return  members.stream().map((member)->projectMemberMapper.toMemberResponse(member)).collect(Collectors.toList());



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
