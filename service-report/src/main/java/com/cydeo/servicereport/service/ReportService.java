package com.cydeo.servicereport.service;

import com.cydeo.servicecommon.contract.ReportDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface ReportService {

    List<ReportDto> findAllReports();

    List<ReportDto> findAllByProduct(Long productId);

    List<ReportDto> findAllByQuantity(int quantity);

    List<ReportDto> findAllByPrice(int price);
}
