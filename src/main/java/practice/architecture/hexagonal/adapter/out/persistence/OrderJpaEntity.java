package practice.architecture.hexagonal.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.Getter;
import practice.architecture.hexagonal.domain.type.OrderStatus;

@Entity
@Getter
@Table(name = "order")
public class OrderJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private String customerName;

    private OrderStatus orderStatus;

    public OrderJpaEntity(String productName, String customerName, OrderStatus orderStatus) {
        this.productName = productName;
        this.customerName = customerName;
        this.orderStatus = orderStatus;
    }
}
