package com.example.VIBER.VIBER.service.impl;

import com.example.VIBER.VIBER.dto.project.ProjectResponse;
import com.example.VIBER.VIBER.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public ProjectResponse createProject() {
        return null;
    }

    @Override
    public ProjectResponse updateProject() {
        return null;
    }

    @Override
    public String deleteProject() {
        return "";
    }

    @Override
    public List<ProjectResponse> getAllProject() {
        return List.of();
    }

    @Override
    public ProjectResponse getProjectById() {
        return null;
    }
}
