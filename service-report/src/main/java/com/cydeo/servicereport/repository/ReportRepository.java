package com.cydeo.servicereport.repository;

import com.cydeo.servicereport.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

    List<Report> findAllByProduct(Long productId);

    List<Report>  findAllByQuantity(int quantity);
}
