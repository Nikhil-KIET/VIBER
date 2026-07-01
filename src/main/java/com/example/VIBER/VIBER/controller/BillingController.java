package com.example.VIBER.VIBER.controller;

import com.example.VIBER.VIBER.dto.billing.*;
import com.example.VIBER.VIBER.service.BillingService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/billing")
@RequiredArgsConstructor
public class BillingController {

    private final BillingService billingService;
    @GetMapping("/plans")
    public ResponseEntity<PlanResponse>getPlans(){

        return  ResponseEntity.ok(billingService.getPlans());

    }

    @GetMapping("/subscription")
    public ResponseEntity<SubscriptionResponse>getSubscription(){
        return  ResponseEntity.ok(billingService.getSubscription());
    }
    @PostMapping("/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(
            @RequestBody CheckoutRequest request
    ) {
        Long userId = 1L;
        return ResponseEntity.ok(billingService.createCheckoutSessionUrl(request, userId));
    }

    @PostMapping("/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal() {
        Long userId = 1L;
        return ResponseEntity.ok(billingService.openCustomerPortal(userId));
    }

}
