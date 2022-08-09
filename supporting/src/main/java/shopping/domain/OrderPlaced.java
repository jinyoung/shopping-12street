package shopping.domain;

import java.util.*;
import lombok.*;
import shopping.domain.*;
import shopping.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String address;
    // keep

}
