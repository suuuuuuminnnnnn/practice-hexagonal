package practice.architecture.hexagonal.application.useCase;

import practice.architecture.hexagonal.presentation.data.response.GetOrderResponse;

import java.util.List;

public interface FindOrderByCustomerNameUseCase {
    List<GetOrderResponse> execute(String customerName);
}
