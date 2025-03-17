package practice.architecture.hexagonal.application.data.request;

import practice.architecture.hexagonal.domain.type.OrderStatus;

public record CreateOrderRequest(
        String productName,
        String customerName,
        OrderStatus orderStatus
) {
}
