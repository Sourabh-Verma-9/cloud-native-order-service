package com.sourabh.orderservice.service.impl;

import com.sourabh.orderservice.dto.request.CreateOrderRequest;
import com.sourabh.orderservice.dto.response.OrderResponse;
import com.sourabh.orderservice.entity.Order;
import com.sourabh.orderservice.entity.OrderStatus;
import com.sourabh.orderservice.mapper.OrderMapper;
import com.sourabh.orderservice.repository.OrderRepository;
import com.sourabh.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public OrderResponse createOrder(CreateOrderRequest request) {
        Order order = orderMapper.toEntity(request);

        order.setStatus(OrderStatus.CREATED);
        order.setCreatedAt(LocalDateTime.now());
        order.setUpdatedAt(LocalDateTime.now());

        Order savedOrder = orderRepository.save(order);

        return orderMapper.toResponse(savedOrder);
    }
}
