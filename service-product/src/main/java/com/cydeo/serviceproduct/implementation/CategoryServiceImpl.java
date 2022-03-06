package com.cydeo.serviceproduct.implementation;

import com.cydeo.serviceproduct.dto.CategoryDto;
import com.cydeo.serviceproduct.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<CategoryDto> listOfCompanyCategories(Long CompanyId) throws Exception {
        return null;
    }

    @Override
    public CategoryDto getProductById(Long id) {
        return null;
    }

    @Override
    public CategoryDto save(CategoryDto productDto) {
        return null;
    }

    @Override
    public String delete(Long productId) {
        return null;
    }

    @Override
    public CategoryDto update(CategoryDto dto) {
        return null;
    }
}
