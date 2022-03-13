package com.cydeo.serviceproduct.implementation;

import com.cydeo.servicecommon.contract.CompanyDto;
import com.cydeo.serviceproduct.dto.CategoryDto;
import com.cydeo.serviceproduct.entity.Category;
import com.cydeo.serviceproduct.repository.CategoryRepository;
import com.cydeo.serviceproduct.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<CategoryDto> listOfCompanyCategories(Long companyId) throws Exception {

        companyId = 1L; //todo after sec
        List<Category> allByCompanyId = categoryRepository.findAllByCompanyId(companyId);
        return allByCompanyId.stream().map(e->modelMapper.map(e, CategoryDto.class)).collect(Collectors.toList());
    }

    @Override
    public CategoryDto getCategoryById(Long id) {
        Category category = categoryRepository.findById(id).get();

        return modelMapper.map(category,CategoryDto.class);
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
         Category category =  modelMapper.map(categoryDto,Category.class);
        Category save = categoryRepository.save(category);

        return modelMapper.map(save,CategoryDto.class);
    }

    @Override
    public String delete(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).get();
        category.setIsDeleted(true);
        return category.getDescription() + " Category deleted successfully";
    }

    @Override
    public CategoryDto update(CategoryDto categoryDto, Long id) {
//        Category category = categoryRepository.findById(id).get();
        Category map = modelMapper.map(categoryDto, Category.class);
        map.setId(id);
        return modelMapper.map(map,CategoryDto.class);
    }
}
