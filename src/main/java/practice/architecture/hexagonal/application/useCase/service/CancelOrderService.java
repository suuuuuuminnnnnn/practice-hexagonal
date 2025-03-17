package practice.architecture.hexagonal.application.useCase.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.architecture.hexagonal.adapter.out.persistence.OrderJpaEntity;
import practice.architecture.hexagonal.adapter.out.persistence.OrderRepository;
import practice.architecture.hexagonal.application.useCase.CancelOrderUseCase;
import practice.architecture.hexagonal.domain.Order;

@Service
@RequiredArgsConstructor
public class CancelOrderService implements CancelOrderUseCase {

    private final OrderRepository orderRepository;

    @Override
    public void execute(Long orderId) {
        OrderJpaEntity order = orderRepository.findById(orderId);
        orderRepository.delete(order);
    }
}
