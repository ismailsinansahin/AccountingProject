package com.cydeo.serviceproduct.service;

import com.cydeo.servicecommon.contract.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> listOfCompanyCategories(Long CompanyId) throws Exception;
    CategoryDto getCategoryById(Long id);
    CategoryDto save(CategoryDto productDto);
    String delete(Long productId);
    CategoryDto update(CategoryDto dto, Long id);

}
