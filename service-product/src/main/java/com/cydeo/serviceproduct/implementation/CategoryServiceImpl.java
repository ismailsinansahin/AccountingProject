package com.cydeo.serviceproduct.implementation;

import com.cydeo.servicecommon.contract.CategoryDto;
import com.cydeo.serviceproduct.entity.Category;
import com.cydeo.serviceproduct.mapper.MapperUtil;
import com.cydeo.serviceproduct.repository.CategoryRepository;
import com.cydeo.serviceproduct.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    MapperUtil mapperUtil;

    @Override
    public List<CategoryDto> listOfCompanyCategories(Long companyId) throws Exception {

//        companyId = 1L; //todo after sec
        List<Category> allByCompanyId = categoryRepository.findAllByCompanyId(companyId);
        return allByCompanyId.stream().map(e->mapperUtil.convert(e, new CategoryDto())).collect(Collectors.toList());
    }

    @Override
    public CategoryDto getCategoryById(Long id) {
        Category category = categoryRepository.findById(id).get();

        return mapperUtil.convert(category,new CategoryDto());
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
         Category category =  mapperUtil.convert(categoryDto,new Category());
        Category save = categoryRepository.save(category);

        return mapperUtil.convert(save,new CategoryDto());
    }

    @Override
    public String delete(Long categoryId) {
        Category category = categoryRepository.findById(categoryId).get();
        category.setIsDeleted(true);
        categoryRepository.save(category);
        return category.getDescription() + " Category deleted successfully";
    }

    @Override
    public CategoryDto update(CategoryDto categoryDto, Long id) {


        Category findById= categoryRepository.findById(id).get();
        Category map = mapperUtil.convert(categoryDto, new Category());
        map.setId(findById.getId());

        for (Field field : map.getClass().getFields()) {
            if(field==null){
                try {
                    field = findById.getClass().getField(field.getName());
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }
        }

        return mapperUtil.convert(map,new CategoryDto());
    }
}
