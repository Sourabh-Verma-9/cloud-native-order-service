package com.sourabh.orderservice.service;

import com.sourabh.orderservice.dto.request.CreateOrderRequest;
import com.sourabh.orderservice.dto.response.OrderResponse;
import com.sourabh.orderservice.entity.OrderStatus;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    OrderResponse createOrder(CreateOrderRequest request);

    OrderResponse getOrderById(UUID id);

    List<OrderResponse> getAllOrders();

    OrderResponse updateOrderStatus(UUID id, OrderStatus status);

    void deleteOrder(UUID id);
}
