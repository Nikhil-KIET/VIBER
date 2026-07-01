package com.example.VIBER.VIBER.controller;

import com.example.VIBER.VIBER.dto.billing.PlanResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/billing")
@RequiredArgsConstructor
public class BillingController {

    @GetMapping("/plans")
    public ResponseEntity<PlanResponse>getPlans(){

    }

}
