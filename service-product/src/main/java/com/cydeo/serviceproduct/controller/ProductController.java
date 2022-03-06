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
    public ResponseEntity<String> getProductList() {

        String initialResponse ="This is TEST RESPONSE from Product Service" ;

        return ResponseEntity.ok(initialResponse);
    }

    /**
     *
     *company products
     */
    @GetMapping("/list")
    public ResultEnvelope<ProductDto> getAllCompanyProductList() throws Exception {


        //todo
            List<ProductDto> productDtos = productService.listOfCompanyProducts(1L);

            return ResultEnvelope.ok(productDtos);

    }
    @GetMapping("/all-product-list")
    public ResultEnvelope<ProductDto> getAllProducts() throws Exception {


        List<ProductDto> productDtos = productService.getAllProducts();

        return ResultEnvelope.ok(productDtos);

    }

    @GetMapping("/get/{productid}")
    public  ResultEnvelope<ProductDto> getProductbyId(@RequestParam("productid") Long productId){


        ProductDto productDto = productService.getProductById(productId);

        return ResultEnvelope.ok(productDto);
    }

    @PostMapping("/save")
    public ResultEnvelope<ProductDto> save(@RequestBody ProductDto productDto){
        ProductDto save = productService.save(productDto);
        return ResultEnvelope.ok(save);

    }
    @DeleteMapping("delete/{productid}")
    public ResultEnvelope<String> deleteProduct(@RequestParam("productid") Long id){

        String delete = productService.delete(id);
        return ResultEnvelope.ok(delete);
    }

    @PostMapping("/edit/{productid}")
    public  ResultEnvelope<ProductDto> editProductbyId(@RequestParam ProductDto productDto) {


        ProductDto product = productService.update(productDto);

        return ResultEnvelope.ok(product);
    }
}
