package practice.architecture.hexagonal.application.useCase;

public interface CancelOrderUseCase {
    void execute(Long orderId);
}
