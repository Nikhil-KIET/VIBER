package com.example.VIBER.VIBER.repository;

import com.example.VIBER.VIBER.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Long> {
}
