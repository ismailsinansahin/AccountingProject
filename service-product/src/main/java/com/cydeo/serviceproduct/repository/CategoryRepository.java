package com.cydeo.serviceproduct.repository;

import com.cydeo.serviceproduct.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findAllByCompanyId(Long companyId);
}
