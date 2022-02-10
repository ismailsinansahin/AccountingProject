package com.cydeo.serviceproduct.controller;

import com.cydeo.serviceproduct.dto.ResultEnvelope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/test")
    public ResultEnvelope<ResponseEntity> getProctList(){

        String initialResponse = "This is test response from Product Service";

        return ResultEnvelope.ok(initialResponse);
    }

}
