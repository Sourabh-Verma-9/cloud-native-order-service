package com.sourabh.orderservice.dto.response;

import com.sourabh.orderservice.entity.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class OrderResponse {

    private UUID id;

    private String customerName;

    private String productName;

    private Integer quantity;

    private BigDecimal price;

    private OrderStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
