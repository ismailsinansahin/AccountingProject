package com.cydeo.serviceproduct.service;

import com.cydeo.serviceproduct.dto.CategoryDto;
import com.cydeo.serviceproduct.dto.ProductDto;
import com.cydeo.serviceproduct.entity.Product;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> listOfCompanyCategories(Long CompanyId) throws Exception;
    CategoryDto getProductById(Long id);
    CategoryDto save(CategoryDto productDto);
    String delete(Long productId);
    CategoryDto update(CategoryDto dto);

}
