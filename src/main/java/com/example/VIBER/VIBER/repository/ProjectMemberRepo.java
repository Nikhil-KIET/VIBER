package com.example.VIBER.VIBER.repository;

import com.example.VIBER.VIBER.dto.member.MemberResponse;
import com.example.VIBER.VIBER.entity.ProjectMember;
import com.example.VIBER.VIBER.entity.ProjectMemberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectMemberRepo extends JpaRepository<ProjectMember, ProjectMemberId> {

    List<ProjectMember> findByIdProjectId(Long projectId);

}
