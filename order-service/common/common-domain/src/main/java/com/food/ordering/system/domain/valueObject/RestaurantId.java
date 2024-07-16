package com.food.ordering.system.domain.valueObject;

import java.util.UUID;

public class RestaurantId<UUID> extends BaseId<UUID> {
    public RestaurantId(UUID value) {
        super(value);
    }
}
