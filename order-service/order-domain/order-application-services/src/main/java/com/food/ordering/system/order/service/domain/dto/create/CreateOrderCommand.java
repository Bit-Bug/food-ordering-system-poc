package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;
import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
public class CreateOrderCommand {
    @NonNull
    private final UUID customerId;
    @NonNull
    private final UUID restaurantId;
    @NonNull
    private final BigDecimal price;
    @NonNull
    private final List<OrderItem> items;
    @NonNull
    private final OrderAddress address;

    public @NonNull UUID getCustomerId() {
        return customerId;
    }

    public @NonNull UUID getRestaurantId() {
        return restaurantId;
    }

    public @NonNull BigDecimal getPrice() {
        return price;
    }

    public @NonNull List<OrderItem> getItems() {
        return items;
    }

    public @NonNull OrderAddress getAddress() {
        return address;
    }
}
