package com.sourabh.orderservice.mapper;

import com.sourabh.orderservice.dto.request.CreateOrderRequest;
import com.sourabh.orderservice.dto.response.OrderResponse;
import com.sourabh.orderservice.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toEntity(CreateOrderRequest request);

    OrderResponse toResponse(Order order);
}
