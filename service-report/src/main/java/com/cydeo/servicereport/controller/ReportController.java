package com.cydeo.servicereport.controller;

import com.cydeo.servicecommon.general.ResponseWrapper;
import com.cydeo.servicereport.service.ReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
