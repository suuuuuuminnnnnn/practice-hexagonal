package practice.architecture.hexagonal.application.useCase.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.architecture.hexagonal.adapter.out.persistence.OrderJpaEntity;
import practice.architecture.hexagonal.adapter.out.persistence.OrderRepository;
import practice.architecture.hexagonal.application.useCase.FindOrderByCustomerNameUseCase;
import practice.architecture.hexagonal.presentation.data.response.GetOrderResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindOrderByCustomerNameService implements FindOrderByCustomerNameUseCase {

    private final OrderRepository orderRepository;

    @Override
    public List<GetOrderResponse> execute(String customerName) {
        List<OrderJpaEntity> orders = orderRepository.findByCustomerName(customerName);
        return orders.stream()
                .map(orderJpaEntity -> new GetOrderResponse(
                        orderJpaEntity.getOrderId(),
                        orderJpaEntity.getProductName(),
                        orderJpaEntity.getOrderStatus()
                ))
                .toList();
    }
}
