package kitchenpos.ordertable.infra;

import kitchenpos.ordertable.domain.repository.OrderTableRepository;
import kitchenpos.ordertable.domain.model.OrderTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}
