package com.cydeo.serviceproduct.service;

import com.cydeo.serviceproduct.dto.ProductDto;
import java.util.*;

public interface ProductService {

    List<ProductDto> listOfCompanyProducts(Long CompanyId);
    ProductDto getProductById(Long id);
    ProductDto save(ProductDto productDto);
    String delete(Long productId);
    ProductDto update(ProductDto dto);

}
