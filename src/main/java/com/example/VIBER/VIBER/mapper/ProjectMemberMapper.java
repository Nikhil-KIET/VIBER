package com.example.VIBER.VIBER.mapper;

import com.example.VIBER.VIBER.dto.member.MemberResponse;
import com.example.VIBER.VIBER.entity.ProjectMember;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface  ProjectMemberMapper {

    @Mapping(target = "userId" ,source = "user.id")
    @Mapping(target = "name",source = "user.name")
    MemberResponse toMemberResponse(ProjectMember projectMember);
}
