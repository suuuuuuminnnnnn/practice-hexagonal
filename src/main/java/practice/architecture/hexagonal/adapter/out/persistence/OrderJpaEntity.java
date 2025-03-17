package practice.architecture.hexagonal.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import practice.architecture.hexagonal.domain.type.OrderStatus;

@Entity
@Getter
@Table(name = "order")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String productName;

    private String customerName;

    private OrderStatus orderStatus;

    public OrderJpaEntity(String productName, String customerName, OrderStatus orderStatus) {
        this.orderId = 1l;
        this.productName = productName;
        this.customerName = customerName;
        this.orderStatus = orderStatus;
    }
}
