package com.example.VIBER.VIBER.controller;

import com.example.VIBER.VIBER.dto.auth.LoginRequest;
import com.example.VIBER.VIBER.dto.auth.LoginResponse;
import com.example.VIBER.VIBER.dto.auth.SignupRequest;
import com.example.VIBER.VIBER.dto.auth.UserProfileResponse;
import com.example.VIBER.VIBER.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
@RequestMapping("/api/auth/")
@RequiredArgsConstructor
public class AuthController {

    private  final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse>login(@RequestBody LoginRequest request){

        return  ResponseEntity.ok(authService.login());

    }

    @PostMapping("/signup")
    public ResponseEntity<UserProfileResponse>signup(@RequestBody SignupRequest request){
        return  ResponseEntity.ok(authService.signup());
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse>getProfile(){
        return ResponseEntity.ok(authService.getProfile());

    }



}
