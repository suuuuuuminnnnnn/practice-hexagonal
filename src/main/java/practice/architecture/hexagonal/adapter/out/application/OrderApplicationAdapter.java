package practice.architecture.hexagonal.adapter.out.application;

import lombok.RequiredArgsConstructor;
import practice.architecture.hexagonal.annotation.adapter.Adapter;
import practice.architecture.hexagonal.annotation.adapter.constant.AdapterType;
import practice.architecture.hexagonal.application.port.OrderApplicationPort;
import practice.architecture.hexagonal.application.useCase.CancelOrderUseCase;
import practice.architecture.hexagonal.application.useCase.CreateOrderUseCase;
import practice.architecture.hexagonal.application.useCase.FindOrderByCustomerNameUseCase;
import practice.architecture.hexagonal.domain.type.OrderStatus;
import practice.architecture.hexagonal.presentation.data.response.GetOrderResponse;

import java.util.List;

@Adapter(AdapterType.INBOUND)
@RequiredArgsConstructor
public class OrderApplicationAdapter implements OrderApplicationPort {

    private final CreateOrderUseCase createOrderUseCase;
    private final CancelOrderUseCase cancelOrderUseCase;
    private final FindOrderByCustomerNameUseCase findOrderByCustomerNameUseCase;

    @Override
    public void createOrder(String productName, String customerName, OrderStatus orderStatus) {
        createOrderUseCase.execute(productName, customerName, orderStatus);
    }

    @Override
    public void cancelOrder(Long orderId) {
        cancelOrderUseCase.execute(orderId);
    }

    @Override
    public List<GetOrderResponse> findOrderByCustomerName(String customerName) {
        return findOrderByCustomerNameUseCase.execute(customerName);
    }

}
