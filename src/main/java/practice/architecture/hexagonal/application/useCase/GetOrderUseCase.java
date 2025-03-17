package practice.architecture.hexagonal.application.useCase;

import practice.architecture.hexagonal.presentation.data.response.GetOrderResponse;

import java.util.List;

public interface GetOrderUseCase {
    List<GetOrderResponse> getOrders(String customerName);
}
