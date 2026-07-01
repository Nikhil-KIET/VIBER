package com.example.VIBER.VIBER.service;

import com.example.VIBER.VIBER.dto.auth.LoginResponse;
import com.example.VIBER.VIBER.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface AuthService {
     LoginResponse login();

     UserProfileResponse signup();

     UserProfileResponse getProfile();
}
