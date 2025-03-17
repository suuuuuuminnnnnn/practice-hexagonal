package practice.architecture.hexagonal.application.useCase.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.architecture.hexagonal.adapter.out.persistence.OrderJpaEntity;
import practice.architecture.hexagonal.adapter.out.persistence.OrderRepository;
import practice.architecture.hexagonal.application.useCase.CreateOrderUseCase;
import practice.architecture.hexagonal.domain.Order;
import practice.architecture.hexagonal.domain.type.OrderStatus;

@Service
@RequiredArgsConstructor
public class CreateOrderService implements CreateOrderUseCase {

    private final OrderRepository orderRepository;

    @Override
    public void execute(String productName, String customerName, OrderStatus orderStatus) {
        OrderJpaEntity order = new OrderJpaEntity(productName, customerName, orderStatus);
        orderRepository.save(order);
    }
}
