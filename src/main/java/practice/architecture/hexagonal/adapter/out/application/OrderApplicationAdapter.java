package practice.architecture.hexagonal.adapter.out.application;

import lombok.RequiredArgsConstructor;
import practice.architecture.hexagonal.annotation.adapter.Adapter;
import practice.architecture.hexagonal.annotation.adapter.constant.AdapterType;
import practice.architecture.hexagonal.application.port.OrderApplicationPort;
import practice.architecture.hexagonal.application.useCase.CancelOrderUseCase;
import practice.architecture.hexagonal.application.useCase.CreateOrderUseCase;
import practice.architecture.hexagonal.application.useCase.GetOrderUseCase;

@Adapter(AdapterType.INBOUND)
@RequiredArgsConstructor
public class OrderApplicationAdapter implements OrderApplicationPort {

    private final CreateOrderUseCase createOrderUseCase;
    private final CancelOrderUseCase cancelOrderUseCase;
    private final GetOrderUseCase getOrderUseCase;

}
