package com.example.VIBER.VIBER.entity;

import com.example.VIBER.VIBER.entity.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Subscription {
    Long id;
    Users user;
    Plan plan;
    String stripeSubscriptionId;
    SubscriptionStatus subscriptionStatus;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd;
    Instant createdAt;
    Instant updatedAt;



}
