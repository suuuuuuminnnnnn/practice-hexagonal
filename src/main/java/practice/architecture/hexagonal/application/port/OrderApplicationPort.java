package practice.architecture.hexagonal.application.port;

import practice.architecture.hexagonal.presentation.data.response.GetOrderResponse;
import practice.architecture.hexagonal.domain.type.OrderStatus;

import java.util.List;

public interface OrderApplicationPort {

    void createOrder(String productName, String customerName, OrderStatus orderStatus);

    void cancelOrder(Long orderId);

    List<GetOrderResponse> findOrderByCustomerName(String customerName);
}
