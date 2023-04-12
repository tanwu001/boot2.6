package com.example.controllerdemo;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
   
     

    @GetMapping("/health")
    @NotControllerResponseAdvice
    public String health() {
        return "success";
    }

    @PostMapping("/findByVo")
    public ProductInfo findByVo(@Validated ProductInfoVo vo) {
        ProductInfo productInfo = new ProductInfo();
        BeanUtils.copyProperties(vo, productInfo);
        return productInfo;
    }

    @GetMapping("/t1")
    public Integer t1() {
        return 1 / 0;
    }
}