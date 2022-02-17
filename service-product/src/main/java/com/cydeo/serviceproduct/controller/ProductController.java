package com.cydeo.serviceproduct.controller;

import com.cydeo.serviceproduct.dto.ProductDto;
import com.cydeo.serviceproduct.dto.ResultEnvelope;
import com.cydeo.serviceproduct.entity.Product;
import com.cydeo.serviceproduct.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping({"/test","/"})
    public ResultEnvelope<ResponseEntity> getProductList() {

        String initialResponse = "This is TEST RESPONSE from Product Service";

        return ResultEnvelope.ok(initialResponse);
    }

    @GetMapping("/list")
    public ResultEnvelope<ResponseEntity> getAllProductList() throws Exception {


            List<Product> productDtos = productService.listOfCompanyProducts(1L);

        return ResultEnvelope.ok(productDtos);

    }

    @GetMapping("/{productid}")
    public  ResultEnvelope<ResponseEntity> getProductbyId(@PathVariable("productid") Long productId){


        Product product = productService.getProductById(productId);

        return ResultEnvelope.ok(product);
    }
}
