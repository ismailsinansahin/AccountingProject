package com.cydeo.serviceuser.repository;

import com.cydeo.serviceuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByCompanyId(Long companyId);

}
