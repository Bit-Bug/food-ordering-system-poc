package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;
import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
public class OrderItem {
    @NotNull
    private final UUID productId;
    @NotNull
    private final Integer quantity;
    @NotNull
    private final BigDecimal price;
    @NotNull
    private final BigDecimal subTotal;

    public @NotNull UUID getProductId() {
        return productId;
    }

    public @NotNull Integer getQuantity() {
        return quantity;
    }

    public @NotNull BigDecimal getPrice() {
        return price;
    }

    public @NotNull BigDecimal getSubTotal() {
        return subTotal;
    }
}