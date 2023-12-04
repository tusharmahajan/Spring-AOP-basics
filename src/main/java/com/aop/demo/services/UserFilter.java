package com.aop.demo.services;

import com.aop.demo.customAnnotation.MeasureTime;
import com.aop.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFilter {

    @Autowired
    private UserRepository userRepository;

    @MeasureTime
    public String applyFilter(){
        return userRepository.getUserDetails();
    }
}
