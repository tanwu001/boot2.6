package com.example.controllerdemo;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class ProductInfo {
    private String productName;

    private BigDecimal productPrice;

    private Integer productStatus;
}
