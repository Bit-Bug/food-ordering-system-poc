package com.food.ordering.system.order.service.domain.dto.message;

import com.food.ordering.system.domain.valueObject.OrderOpprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class RestaurantApprovalResponse {
    private String id;
    private String sagaId;
    private String orderId;
    private String restaurantId;
    private Instant createdAt;
    private OrderOpprovalStatus orderApprovalStatus;
    private List<String> failureMessages;

}
