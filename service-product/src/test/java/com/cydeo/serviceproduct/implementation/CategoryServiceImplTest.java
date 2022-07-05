package com.cydeo.serviceproduct.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.cydeo.servicecommon.contract.CategoryDto;
import com.cydeo.serviceproduct.entity.Category;
import com.cydeo.serviceproduct.repository.CategoryRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CategoryServiceImpl.class})
@ExtendWith(SpringExtension.class)
class CategoryServiceImplTest {
    @MockBean
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @MockBean
    private ModelMapper modelMapper;

    @Test
    void testListOfCompanyCategories() throws Exception {
        when(this.categoryRepository.findAllByCompanyId((Long) any())).thenReturn(new ArrayList<>());
        assertTrue(this.categoryServiceImpl.listOfCompanyCategories(123L).isEmpty());
        verify(this.categoryRepository).findAllByCompanyId((Long) any());
    }

    @Test
    void testListOfCompanyCategories2() throws Exception {
        when(this.modelMapper.map((Object) any(), (Class<Object>) any())).thenReturn(new CategoryDto());

        Category category = new Category();
        category.setProduct(new ArrayList<>());
        category.setCompanyId(123L);
        category.setCreated_by(123L);
        category.setIsDeleted(true);
        category.setId(123L);
        category.setUpdated_by(123L);
        category.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setDescription("The characteristics of someone or something");

        ArrayList<Category> categoryList = new ArrayList<>();
        categoryList.add(category);
        when(this.categoryRepository.findAllByCompanyId((Long) any())).thenReturn(categoryList);
        assertEquals(1, this.categoryServiceImpl.listOfCompanyCategories(123L).size());
        verify(this.modelMapper).map((Object) any(), (Class<Object>) any());
        verify(this.categoryRepository).findAllByCompanyId((Long) any());
    }

    @Test
    void testListOfCompanyCategories3() throws Exception {
        when(this.modelMapper.map((Object) any(), (Class<Object>) any())).thenReturn(new CategoryDto());

        Category category = new Category();
        category.setProduct(new ArrayList<>());
        category.setCompanyId(123L);
        category.setCreated_by(123L);
        category.setIsDeleted(true);
        category.setId(123L);
        category.setUpdated_by(123L);
        category.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setDescription("The characteristics of someone or something");

        Category category1 = new Category();
        category1.setProduct(new ArrayList<>());
        category1.setCompanyId(123L);
        category1.setCreated_by(123L);
        category1.setIsDeleted(true);
        category1.setId(123L);
        category1.setUpdated_by(123L);
        category1.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category1.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category1.setDescription("The characteristics of someone or something");

        ArrayList<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        categoryList.add(category);
        when(this.categoryRepository.findAllByCompanyId((Long) any())).thenReturn(categoryList);
        assertEquals(2, this.categoryServiceImpl.listOfCompanyCategories(123L).size());
        verify(this.modelMapper, atLeast(1)).map((Object) any(), (Class<Object>) any());
        verify(this.categoryRepository).findAllByCompanyId((Long) any());
    }

    @Test
    void testGetCategoryById() {
        CategoryDto categoryDto = new CategoryDto();
        when(this.modelMapper.map((Object) any(), (Class<Object>) any())).thenReturn(categoryDto);

        Category category = new Category();
        category.setProduct(new ArrayList<>());
        category.setCompanyId(123L);
        category.setCreated_by(123L);
        category.setIsDeleted(true);
        category.setId(123L);
        category.setUpdated_by(123L);
        category.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setDescription("The characteristics of someone or something");
        Optional<Category> ofResult = Optional.of(category);
        when(this.categoryRepository.findById((Long) any())).thenReturn(ofResult);
        assertSame(categoryDto, this.categoryServiceImpl.getCategoryById(123L));
        verify(this.modelMapper).map((Object) any(), (Class<Object>) any());
        verify(this.categoryRepository).findById((Long) any());
    }

    @Test
    void testDelete() {
        Category category = new Category();
        category.setProduct(new ArrayList<>());
        category.setCompanyId(123L);
        category.setCreated_by(123L);
        category.setIsDeleted(true);
        category.setId(123L);
        category.setUpdated_by(123L);
        category.setCreated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setEnabled(true);
        category.setUpdated_time(LocalDateTime.of(1, 1, 1, 1, 1));
        category.setDescription("The characteristics of someone or something");
        Optional<Category> ofResult = Optional.of(category);
        when(this.categoryRepository.findById((Long) any())).thenReturn(ofResult);
        assertEquals("The characteristics of someone or something Category deleted successfully",
                this.categoryServiceImpl.delete(123L));
        verify(this.categoryRepository).findById((Long) any());
    }
}

