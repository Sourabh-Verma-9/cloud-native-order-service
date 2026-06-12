package com.sourabh.orderservice.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CreateOrderRequest {

    @NotBlank(message = "Customer Name cannot be blank")
    private String customerName;

    @NotBlank(message = "Product Name cannot be blank")
    private String productName;

    @NotNull(message ="Quantity is required")
    @Positive(message = "Quantity must be > 0 ")
    private Integer quantity;

    @NotNull(message ="Price is required")
    @Positive(message = "Price must be > 0 ")
    private BigDecimal price;
}
