package com.cydeo.servicecommon.client;

import com.cydeo.servicecommon.contract.ProductDto;
import com.cydeo.servicecommon.general.ResponseWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("service-product")
public interface ProductServiceClient {

    @GetMapping("/api/v1/products/list")
    ResponseEntity<List<ProductDto>> getAllCompanyProductList();

    @GetMapping("/api/v1/products/all-product-list")
    ResponseEntity<List<ProductDto>> getAllProductList();

    @GetMapping("/api/v1/products/{productid}")
    ResponseEntity<ResponseWrapper> getProductbyId(@RequestParam("productid") Long productId);




}
