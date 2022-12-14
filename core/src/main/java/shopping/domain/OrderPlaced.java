package shopping.domain;

import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
    // keep

}
