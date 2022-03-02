package com.cydeo.serviceinvoice.repository;

import com.cydeo.serviceinvoice.entity.InvoiceProductRel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceProductRelRepository extends JpaRepository<InvoiceProductRel, Long> {
}
