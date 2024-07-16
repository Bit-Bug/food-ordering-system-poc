package com.food.ordering.system.domain.valueObject;

import java.util.UUID;

public class CustomerId<UUID> extends BaseId<UUID> {
    public CustomerId(UUID value) {
        super(value);
    }
}
