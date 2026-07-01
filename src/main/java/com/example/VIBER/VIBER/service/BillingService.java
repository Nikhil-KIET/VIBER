package com.example.VIBER.VIBER.service;

import com.example.VIBER.VIBER.dto.billing.*;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ProblemDetail;

public interface BillingService {
    PlanResponse getPlans();

     SubscriptionResponse getSubscription();

     CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

     PortalResponse openCustomerPortal(Long userId);
}
