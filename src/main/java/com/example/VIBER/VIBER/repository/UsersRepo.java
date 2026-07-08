package com.example.VIBER.VIBER.repository;

import com.example.VIBER.VIBER.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users,Long> {
}
