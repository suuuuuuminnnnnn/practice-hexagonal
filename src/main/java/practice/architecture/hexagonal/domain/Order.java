package practice.architecture.hexagonal.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import practice.architecture.hexagonal.domain.type.OrderStatus;

@Getter
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String productName;

    private String customerName;

    private OrderStatus orderStatus;
}
