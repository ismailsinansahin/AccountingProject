package com.cydeo.servicecompany.repository;

import com.cydeo.servicecompany.entity.ClientVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientVendorRepository extends JpaRepository<ClientVendor,Long> {
}
