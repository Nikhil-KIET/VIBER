package com.example.VIBER.VIBER.service.impl;

import com.example.VIBER.VIBER.dto.usage.PlanLimitResponse;
import com.example.VIBER.VIBER.dto.usage.UsageResponse;
import com.example.VIBER.VIBER.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }

    @Override
    public UsageResponse getTodayUsageOfUser(Long userId) {
        return null;
    }
}
