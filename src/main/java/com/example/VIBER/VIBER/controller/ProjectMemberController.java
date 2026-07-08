package com.example.VIBER.VIBER.controller;

import com.example.VIBER.VIBER.dto.auth.UserProfileResponse;
import com.example.VIBER.VIBER.dto.member.MemberResponse;
import com.example.VIBER.VIBER.service.ProjectMemberService;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/manage/project")
@RequiredArgsConstructor
public class ProjectMemberController {

    private  final ProjectMemberService projectMemberService;

    @GetMapping("/{id}/members")
    public ResponseEntity<List<MemberResponse>>getAllProjectMembers(@PathVariable Long id){

        return ResponseEntity.ok(projectMemberService.getAllProjectMembers(id));

    }
    @PostMapping("/invite/{id}")
    public ResponseEntity<UserProfileResponse>inviteMember(@PathVariable Long id){

        return  ResponseEntity.ok(projectMemberService.inviteUser());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteMember(@PathVariable Long id){

        return  ResponseEntity.ok(projectMemberService.deleteMember());

    }

    @PatchMapping("/{id}")
    public ResponseEntity<UserProfileResponse>updateMember(@PathVariable Long id){

        return  ResponseEntity.ok(projectMemberService.updateMember());

    }


}
