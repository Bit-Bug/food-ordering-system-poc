package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valueObject.Money;
import com.food.ordering.system.domain.valueObject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private Money price;
    private String name;

    public Product(ProductId productId, Money price, String name) {
        super.setId(productId);
        this.price = price;
        this.name = name;
    }

    public Product(ProductId productId) {
        super.setId(productId);
    }

    public Money getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void updateWithConfirmedNameAndPrice(String name, Money price) {
        this.name = name;
        this.price = price;
    }
}
