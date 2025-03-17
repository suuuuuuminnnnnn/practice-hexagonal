package practice.architecture.hexagonal.application.data.response;

import practice.architecture.hexagonal.domain.type.OrderStatus;

public record GetOrderResponse(
        String productName,
        OrderStatus orderStatus
) {
}
