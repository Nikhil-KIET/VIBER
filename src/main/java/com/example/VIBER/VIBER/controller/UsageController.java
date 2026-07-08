package com.example.VIBER.VIBER.controller;

import com.example.VIBER.VIBER.dto.usage.PlanLimitResponse;
import com.example.VIBER.VIBER.dto.usage.UsageResponse;
import com.example.VIBER.VIBER.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage")
@RequiredArgsConstructor
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageResponse>getTodayUsage(){
        long id=1;
        return ResponseEntity.ok(usageService.getTodayUsageOfUser(id));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimits() {
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));
    }
}
