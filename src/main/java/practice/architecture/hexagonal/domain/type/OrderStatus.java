package practice.architecture.hexagonal.domain.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrderStatus {
    COMPLETED("주문 완료"),
    CANCELED("주문 취소");

    private final String description;

    @JsonValue
    public String getDescription() {
        return description;
    }

    @JsonCreator
    public static OrderStatus fromDescription(String description) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.description.equals(description)) {
                return orderStatus;
            }

        }
        throw new IllegalArgumentException("Unknown category: " + description);
    }
}
