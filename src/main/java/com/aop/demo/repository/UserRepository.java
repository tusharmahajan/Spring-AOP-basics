package com.aop.demo.repository;

import com.aop.demo.customAnnotation.MeasureTime;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String getUserDetails(){
        return "I am Tushar Mahajan";
    }
}
