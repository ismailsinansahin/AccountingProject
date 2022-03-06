package com.cydeo.serviceproduct.controller;


import com.cydeo.serviceproduct.dto.ResultEnvelope;
import com.cydeo.serviceproduct.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/categories")
@Slf4j
public class CategoryContoller {

    @Autowired
    private CategoryService categoryService;

    @GetMapping({"/test",""})
    public ResultEnvelope<ResponseBody> initialResponse(){

        return ResultEnvelope.ok("This is TEST RESPONSE from category service");
    }

    @GetMapping("/list")
    public ResultEnvelope<ResponseBody> getAllCategories(){

        return ResultEnvelope.ok("This is TEST RESPONSE from category service");
    }



}
