package practice.architecture.hexagonal.adapter.out.persistence;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import practice.architecture.hexagonal.domain.type.OrderStatus;

import java.util.List;

@Slf4j
@Component
public class OrderRepository {
    public void save(OrderJpaEntity order) { }
    public void delete(OrderJpaEntity order) {
        System.out.println("주문이 삭제되었습니다.");
    }

    public OrderJpaEntity findById(Long id) {
        return OrderJpaEntity.builder()
                .orderId(Long.valueOf("1"))
                .productName("코카 콜라")
                .customerName("나현욱")
                .orderStatus(OrderStatus.COMPLETED)
                .build();
    }

    public List<OrderJpaEntity> findByCustomerName(String customerName) {
        return List.of(
                OrderJpaEntity.builder()
                        .orderId(1L)
                        .productName("코카 콜라")
                        .customerName("나현욱")
                        .orderStatus(OrderStatus.COMPLETED)
                        .build()
        );
    }
}
