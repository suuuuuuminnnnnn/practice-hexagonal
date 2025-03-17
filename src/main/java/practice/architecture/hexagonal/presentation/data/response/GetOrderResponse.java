package practice.architecture.hexagonal.presentation.data.response;

import practice.architecture.hexagonal.domain.type.OrderStatus;

public record GetOrderResponse(
        Long orderId,
        String productName,
        OrderStatus orderStatus
) {
}
