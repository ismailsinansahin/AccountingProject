package com.cydeo.serviceproduct.controller;


import com.cydeo.servicecommon.general.ResponseWrapper;
import com.cydeo.servicecommon.contract.CategoryDto;
import com.cydeo.servicecommon.general.ResultEnvelope;
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
    public ResultEnvelope<String> initialResponse(){
        String testResult= "This is TEST RESPONSE from category service";

        return ResultEnvelope.ok(testResult);
    }

    @GetMapping("/list")
    public ResultEnvelope<List<CategoryDto>> getAllCategories(@RequestParam("company_id") Long company_id) throws Exception {

        List<CategoryDto> categoryDtos = categoryService.listOfCompanyCategories(company_id);// todo after sec
        return ResultEnvelope.ok(categoryDtos);
    }

    @GetMapping("/{id}")
    public ResultEnvelope<CategoryDto> getById(@PathVariable("id") Long id){
        CategoryDto categoryById = categoryService.getCategoryById(id);
        return ResultEnvelope.ok(categoryById);
    }

    @PostMapping("/create")
    public ResultEnvelope<CategoryDto> save(@RequestBody CategoryDto categoryDto){
        CategoryDto save = categoryService.save(categoryDto);

        return ResultEnvelope.ok(save);
    }

    @PutMapping("/edit/{id}")
    public ResultEnvelope<CategoryDto> update(@PathVariable("id") Long id, @RequestBody CategoryDto categoryDto)  {
        CategoryDto update = categoryService.update(categoryDto, id);
        return ResultEnvelope.ok(update);
    }

    @DeleteMapping("/delete")
    public ResultEnvelope<String> delete(@RequestParam("category_id") Long id){
        String delete = categoryService.delete(id);
        return ResultEnvelope.ok(delete);
    }

}
