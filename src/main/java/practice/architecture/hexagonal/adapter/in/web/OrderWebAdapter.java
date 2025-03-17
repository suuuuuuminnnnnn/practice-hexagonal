package practice.architecture.hexagonal.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practice.architecture.hexagonal.application.data.request.CreateOrderRequest;
import practice.architecture.hexagonal.application.data.response.GetOrderResponse;
import practice.architecture.hexagonal.application.port.OrderApplicationPort;

import java.util.List;

@RequestMapping("/order")
@RestController
@RequiredArgsConstructor
public class OrderWebAdapter {

    private final OrderApplicationPort orderApplicationPort;

    @PostMapping
    public ResponseEntity<Void> createOrder(CreateOrderRequest request) {
        orderApplicationPort.createOrder(request.productName(), request.customerName(), request.orderStatus());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> cancelOrder(@RequestParam Long orderId) {
        orderApplicationPort.cancelOrder(orderId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{customerName}")
    public ResponseEntity<List<GetOrderResponse>> getOrder(
            @PathVariable String customerName) {
        return ResponseEntity.status(HttpStatus.OK).body(orderApplicationPort.findOrderByCustomerName(customerName));
    }
}
