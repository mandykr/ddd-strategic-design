package kitchenpos.order.domain.repository;

import kitchenpos.order.domain.model.Order;
import kitchenpos.order.domain.model.OrderStatus;
import kitchenpos.ordertable.domain.model.OrderTable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findById(UUID id);

    List<Order> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, OrderStatus status);
}

