package com.example.VIBER.VIBER.service;

import com.example.VIBER.VIBER.dto.usage.PlanLimitResponse;
import com.example.VIBER.VIBER.dto.usage.UsageResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
   UsageResponse getTodaysUsage();

     PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
