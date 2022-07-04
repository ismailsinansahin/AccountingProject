package com.cydeo.serviceproduct.controller;

import com.cydeo.servicecommon.contract.ProductDto;
import com.cydeo.servicecommon.general.ResultEnvelope;
import com.cydeo.serviceproduct.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResultEnvelope<String> getProductList() {

        String initialResponse ="This is TEST RESPONSE from Product Service" ;

        return ResultEnvelope.ok(initialResponse);
    }

    /**
     *
     *company products
     */
    @GetMapping("/list")
    public ResultEnvelope<List<ProductDto>> getAllCompanyProductList() throws Exception {
        //todo
            List<ProductDto> productDtos = productService.listOfCompanyProducts(9L);
            return ResultEnvelope.ok(productDtos);

    }
    @GetMapping("/all-product-list")
    public ResultEnvelope<List<ProductDto>> getAllProducts() throws Exception {

        List<ProductDto> productDtos = productService.getAllProducts();

        return ResultEnvelope.ok(productDtos);

    }

    @GetMapping("/get")
    public  ResultEnvelope<ProductDto> getProductbyId(@RequestParam("productid") Long productId){
        ProductDto productDto = productService.getProductById(productId);

        return ResultEnvelope.ok(productDto);
    }

    @PostMapping("/create")
    public ResultEnvelope<ProductDto> save(@RequestBody ProductDto productDto){
        ProductDto save = productService.save(productDto);
        return ResultEnvelope.ok(save);

    }
    @DeleteMapping("delete/{productid}")
    public ResultEnvelope<String> deleteProduct(@RequestParam("productid") Long id){

        String delete = productService.delete(id);
        return ResultEnvelope.ok(delete);
    }

    @PutMapping("/edit/{productid}")
    public  ResultEnvelope<ProductDto> editProductbyId(@RequestParam ProductDto productDto) {
        ProductDto product = productService.update(productDto);
        return ResultEnvelope.ok(product);
    }
}
