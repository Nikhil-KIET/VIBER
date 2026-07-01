package com.example.VIBER.VIBER.service;

import com.example.VIBER.VIBER.dto.project.ProjectResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProjectService {
    ProjectResponse createProject();

    ProjectResponse updateProject();

     String deleteProject();
     List<ProjectResponse> getAllProject();

     ProjectResponse getProjectById();
}
