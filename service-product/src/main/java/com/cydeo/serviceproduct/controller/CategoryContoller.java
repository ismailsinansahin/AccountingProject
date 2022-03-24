package com.cydeo.serviceproduct.controller;


import com.cydeo.servicecommon.general.ResponseWrapper;
import com.cydeo.servicecommon.contract.CategoryDto;
import com.cydeo.serviceproduct.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
@Slf4j
public class CategoryContoller {

    @Autowired
    private CategoryService categoryService;

    @GetMapping({"/test",""})
    public ResponseEntity<ResponseWrapper> initialResponse(){

        return ResponseEntity.ok(new ResponseWrapper("This is TEST RESPONSE from category service"));
    }

    @GetMapping("/list")
    public ResponseEntity<ResponseWrapper> getAllCategories() throws Exception {

        List<CategoryDto> categoryDtos = categoryService.listOfCompanyCategories(1L);// todo after sec
        return ResponseEntity.ok(new ResponseWrapper("Category List",categoryDtos));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper> getById(@PathVariable("id") Long id){
        CategoryDto categoryById = categoryService.getCategoryById(id);
        return ResponseEntity.ok(new ResponseWrapper("Category retrieved",categoryById));
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseWrapper> save(@RequestBody CategoryDto categoryDto){
        CategoryDto save = categoryService.save(categoryDto);

        return ResponseEntity.ok(new ResponseWrapper("New Category created",save));
    }

    @PutMapping("/edit")
    public ResponseEntity<ResponseWrapper> update(@RequestParam("category-id") Long id, CategoryDto categoryDto)  {
        categoryService.update(categoryDto,id);
        return ResponseEntity.ok(new ResponseWrapper());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam("category-id") Long id){
        categoryService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
