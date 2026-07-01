package com.example.VIBER.VIBER.controller;

import com.example.VIBER.VIBER.dto.project.ProjectRequest;
import com.example.VIBER.VIBER.dto.project.ProjectResponse;
import com.example.VIBER.VIBER.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects/")
@RequiredArgsConstructor
public class ProjectController {

    private  final ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request){
        return  ResponseEntity.ok(projectService.createProject());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse>updateProject(@PathVariable Long id, @RequestBody ProjectRequest request){

        return  ResponseEntity.ok(projectService.updateProject());

    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<String> deleteProject(@PathVariable Long id){

        return ResponseEntity.ok(projectService.deleteProject());

    }
    @GetMapping
    public ResponseEntity<List<ProjectResponse>>getAllProject(){
        return ResponseEntity.ok(projectService.getAllProject());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse>getProject(@PathVariable Long id){

        return  ResponseEntity.ok(projectService.getProjectById());
    }


}
