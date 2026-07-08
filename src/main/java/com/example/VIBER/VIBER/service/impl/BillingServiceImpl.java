package com.example.VIBER.VIBER.service.impl;

import com.example.VIBER.VIBER.dto.billing.*;
import com.example.VIBER.VIBER.service.BillingService;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceImpl implements BillingService {
    @Override
    public PlanResponse getPlans() {
        return null;
    }

    @Override
    public SubscriptionResponse getSubscription() {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
