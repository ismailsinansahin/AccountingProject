package com.cydeo.servicereport.service;

import com.cydeo.servicecommon.contract.ReportDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    List<ReportDto> findAllReports();
}
