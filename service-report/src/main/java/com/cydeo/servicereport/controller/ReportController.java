package com.cydeo.servicereport.controller;

import com.cydeo.servicecommon.contract.ReportDto;
import com.cydeo.servicecommon.general.ResponseWrapper;
import com.cydeo.servicereport.entity.Report;
import com.cydeo.servicereport.service.ReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reports")
public class ReportController {

    private ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/list")
    public ResponseEntity<ResponseWrapper> getReportList(){
        return ResponseEntity
                .ok(new ResponseWrapper("Reports are retrieved", reportService.findAllReports()));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ResponseWrapper> getByProductId(@PathVariable("productId") Long productId) throws Exception {
        List<ReportDto> reportList = reportService.findAllByProduct(productId);
        if (reportList.isEmpty()){
            throw new Exception("There is no report by this product id = " + productId);
        }
        return ResponseEntity.ok(new ResponseWrapper("Report is retrieved by product id = " + productId, reportList));
    }
}
