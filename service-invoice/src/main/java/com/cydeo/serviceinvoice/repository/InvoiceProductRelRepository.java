package com.cydeo.serviceinvoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceProductRelRepository extends JpaRepository<InvoiceProductRelRepository, Long> {
}
