package practice.architecture.hexagonal.application.useCase;

import practice.architecture.hexagonal.domain.type.OrderStatus;

public interface CreateOrderUseCase {
    void createOrder(String productName, String customerName, OrderStatus orderStatus);
}
