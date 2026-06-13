package com.sourabh.orderservice.service.impl;

import com.sourabh.orderservice.repository.OrderRepository;
import com.sourabh.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
}
