package jpabook.jpashop.repository.order.query;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderItemQueryDto {
    private Long orderId; //주문번호
    private String itemName; //상품 명
    private int orderPrice; //주문 가격
    private int count; //주문 수량
}
