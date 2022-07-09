package com.cydeo.servicereport.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Component
public class BaseEntityListener extends AuditingEntityListener {

    @PrePersist
    private void onPrePersist(BaseEntity baseEntity) {

        //final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        baseEntity.created_time = LocalDateTime.now();
        baseEntity.updated_time = LocalDateTime.now();
        baseEntity.created_by = 1l;//this will be dynamic when the security part starts
        baseEntity.updated_by = 1l;//this will be dynamic when the security part starts

//        if (authentication != null && !authentication.getName().equals("anonymousUser")) {
//            long id = Long.parseLong(authentication.getName());
//            baseEntity.insertUserId = id;
//            baseEntity.lastUpdateUserId = id;
//        }
    }

    @PreUpdate
    private void onPreUpdate(BaseEntity baseEntity) {

        //final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        baseEntity.updated_time = LocalDateTime.now();
        baseEntity.updated_by = 1l;//this will be dynamic when the security part starts


//        if (authentication != null && !authentication.getName().equals("anonymousUser")) {
//            long id = Long.parseLong(authentication.getName());
//            baseEntity.lastUpdateUserId = id;
//        }
    }
}