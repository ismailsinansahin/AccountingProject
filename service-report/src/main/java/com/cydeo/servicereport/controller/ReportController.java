package com.cydeo.servicereport.controller;

import com.cydeo.servicecommon.contract.ReportDto;
import com.cydeo.servicecommon.general.ResponseWrapper;
import com.cydeo.servicereport.entity.Report;
import com.cydeo.servicereport.service.ReportService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    public ResponseEntity<ResponseWrapper> getReportsByProductId(@PathVariable("productId") Long productId) {
        List<ReportDto> reportList = reportService.findAllByProduct(productId);
        if (reportList.isEmpty()){
            return ResponseEntity.ok(new ResponseWrapper(false, "There is no report by this product id = " + productId, 404, reportList));
        }
        return ResponseEntity.ok(new ResponseWrapper("Report is retrieved by product id = " + productId, reportList));
    }

    @GetMapping("/quantity")
    public ResponseEntity<ResponseWrapper> getReportsByQuantity(@RequestParam("quantity") int quantity) {
        List<ReportDto> reportList = reportService.findAllByQuantity(quantity);
        if (reportList.isEmpty()){
            return ResponseEntity.ok(new ResponseWrapper(false, "There is no report by this quantity = " + quantity, 404, reportList));
        }
        return ResponseEntity.ok(new ResponseWrapper("Report is retrieved by quantity = " + quantity, reportList));
    }

    @GetMapping("/price")
    public ResponseEntity<ResponseWrapper> getReportsByPrice(@RequestParam("price") int price) {
        List<ReportDto> reportList = reportService.findAllByPrice(price);
        if (reportList.isEmpty()){
            return ResponseEntity.ok(new ResponseWrapper(false, "There is no report by this price = " + price, 404, reportList));
        }
        return ResponseEntity.ok(new ResponseWrapper("Report is retrieved by price = " + price, reportList));
    }

}
