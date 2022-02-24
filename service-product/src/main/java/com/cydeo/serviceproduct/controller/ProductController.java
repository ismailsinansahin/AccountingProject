package com.cydeo.serviceproduct.controller;

import com.cydeo.serviceproduct.dto.ProductDto;
import com.cydeo.serviceproduct.dto.ResultEnvelope;
import com.cydeo.serviceproduct.entity.Product;
import com.cydeo.serviceproduct.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@Api(tags = {"User Controller "})
//@SwaggerDefinition(tags = {
//        @Tag(name = "Products", description = "Product Controller")
//})
@RestController
@Slf4j
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping({"/test","/"})
    public ResponseEntity<ResultEnvelope> getProductList() {

        String initialResponse = "This is TEST RESPONSE from Product Service";

        return ResponseEntity.ok(new ResultEnvelope(true).ok(initialResponse));

    }

    @GetMapping("/list")
    public ResponseEntity<ResultEnvelope> getAllProductList() throws Exception {


            List<ProductDto> productDtos = productService.listOfCompanyProducts(1L);

        return ResultEnvelope.ok(ResponseEntity.ok(productDtos));

    }

    @GetMapping("/get/{productid}")
    public  ResponseEntity<ResultEnvelope> getProductbyId(@RequestParam("productid") Long productId){


        Product product = productService.getProductById(productId);

        return ResponseEntity.ok(new ResultEnvelope().ok);
    }

    @PostMapping("/save")
    public ResponseEntity<ResultEnvelope> save(@RequestBody ProductDto productDto){
        ProductDto save = productService.save(productDto);
        return ResultEnvelope.ok(save);

    }
    @DeleteMapping("delete/{productid}")
    public ResponseEntity<ResultEnvelope> deleteProduct(@PathVariable("productid") Long id){

        productService.delete(id);
        return ResultEnvelope.ok("Product Deleted Successfully");
    }

    @PostMapping("/edit")
    public  ResponseEntity<ResultEnvelope> editProductbyId(@RequestBody ProductDto productDto) {


        ProductDto product = productService.update(productDto);

        return ResultEnvelope.ok(product);
    }
}
