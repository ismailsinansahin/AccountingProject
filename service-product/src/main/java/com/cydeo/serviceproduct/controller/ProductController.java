package com.cydeo.serviceproduct.controller;

import com.cydeo.serviceproduct.dto.ProductDto;
import com.cydeo.serviceproduct.dto.ResultEnvelope;
import com.cydeo.serviceproduct.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
//@Api(tags = {"User Controller "})
//@SwaggerDefinition(tags = {
//        @Tag(name = "User", description = "User Controller")
//})
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    @GetMapping("/test")
    public ResultEnvelope<ResponseEntity> getProctList() {

        String initialResponse = "This is test response from Product Service";

        return ResultEnvelope.ok(initialResponse);
    }

    @GetMapping
    public ResultEnvelope<ResponseEntity> getAllPrductList(){


            List<ProductDto> productDtos = productService.listOfCompanyProducts(1L);

        return ResultEnvelope.ok(productDtos);

    }
}
