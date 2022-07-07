package com.cydeo.servicereport.implementation;

import com.cydeo.servicecommon.contract.ReportDto;
import com.cydeo.servicereport.mapper.MapperUtil;
import com.cydeo.servicereport.repository.ReportRepository;
import com.cydeo.servicereport.service.ReportService;

import java.util.List;
import java.util.stream.Collectors;

public class ReportServiceImplementation implements ReportService {

    private ReportRepository reportRepository;
    private MapperUtil mapperUtil;

    public ReportServiceImplementation(ReportRepository reportRepository, MapperUtil mapperUtil) {
        this.reportRepository = reportRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<ReportDto> findAllReports() {
        return reportRepository
                .findAll()
                .stream()
                .map(entity -> mapperUtil.convert(entity, new ReportDto()))
                .collect(Collectors.toList());
    }
}
