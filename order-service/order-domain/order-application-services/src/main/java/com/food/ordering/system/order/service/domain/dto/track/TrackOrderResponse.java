package com.food.ordering.system.order.service.domain.dto.track;

import com.food.ordering.system.domain.valueObject.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrderResponse {
    @NotNull
    private  final UUID orderTrackingId;
    @NotNull
    private final OrderStatus orderStatus;
    private final List<String> failureMessages;

    private TrackOrderResponse(Builder builder) {
        orderTrackingId = builder.orderTrackingId;
        orderStatus = builder.orderStatus;
        failureMessages = builder.failureMessages;
    }
    public static Builder builder() {
        return new Builder();
    }
    public static final class Builder {
        private @NotNull UUID orderTrackingId;
        private @NotNull OrderStatus orderStatus;
        private List<String> failureMessages;

        private Builder() {
        }



        public Builder orderTrackingId(@NotNull UUID val) {
            orderTrackingId = val;
            return this;
        }

        public Builder orderStatus(@NotNull OrderStatus val) {
            orderStatus = val;
            return this;
        }

        public Builder failureMessages(List<String> val) {
            failureMessages = val;
            return this;
        }

        public TrackOrderResponse build() {
            return new TrackOrderResponse(this);
        }
    }
}
