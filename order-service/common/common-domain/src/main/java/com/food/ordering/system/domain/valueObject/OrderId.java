package com.food.ordering.system.domain.valueObject;

import java.util.UUID;

public class OrderId<UUID> extends BaseId<UUID> {
    public OrderId(UUID value) {
        super(value);
    }
}
