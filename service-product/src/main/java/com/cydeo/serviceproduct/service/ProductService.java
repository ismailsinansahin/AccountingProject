package com.cydeo.serviceproduct.service;

import com.cydeo.serviceproduct.dto.ProductDto;
import com.cydeo.serviceproduct.entity.Product;

import java.util.*;

public interface ProductService {

    List<Product> listOfCompanyProducts(Long CompanyId) throws Exception;
    Product getProductById(Long id);
    ProductDto save(ProductDto productDto);
    String delete(Long productId);
    ProductDto update(ProductDto dto);

}
