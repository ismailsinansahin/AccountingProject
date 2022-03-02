package com.cydeo.serviceinvoice.repository;

import com.cydeo.serviceinvoice.entity.InvoicedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicedItemRepository extends JpaRepository<InvoicedItem, Long> {
}
