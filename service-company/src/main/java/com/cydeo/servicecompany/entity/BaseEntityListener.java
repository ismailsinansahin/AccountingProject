package com.cydeo.servicecompany.entity;

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
        baseEntity.insertDateTime = LocalDateTime.now();
        baseEntity.lastUpdateDateTime = LocalDateTime.now();
        baseEntity.insertUserId = 1l;//this will be dynamic when the security part starts
        baseEntity.lastUpdateUserId = 1l;//this will be dynamic when the security part starts

//        if (authentication != null && !authentication.getName().equals("anonymousUser")) {
//            long id = Long.parseLong(authentication.getName());
//            baseEntity.insertUserId = id;
//            baseEntity.lastUpdateUserId = id;
//        }
    }

    @PreUpdate
    private void onPreUpdate(BaseEntity baseEntity) {

        //final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        baseEntity.lastUpdateDateTime = LocalDateTime.now();
        baseEntity.lastUpdateUserId = 1l;//this will be dynamic when the security part starts


//        if (authentication != null && !authentication.getName().equals("anonymousUser")) {
//            long id = Long.parseLong(authentication.getName());
//            baseEntity.lastUpdateUserId = id;
//        }
    }
}
