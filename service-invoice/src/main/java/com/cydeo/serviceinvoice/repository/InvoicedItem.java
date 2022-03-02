package com.cydeo.serviceinvoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicedItem extends JpaRepository<InvoicedItem, Long> {
}
