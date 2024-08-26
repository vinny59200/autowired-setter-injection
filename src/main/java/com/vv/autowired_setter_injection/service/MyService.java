package com.vv.autowired_setter_injection.service;

import com.vv.autowired_setter_injection.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyRepository myRepository;

    @Autowired
    public void setMyRepository( MyRepository myRepository ) {

        this.myRepository = myRepository;

    }

    //necessary for the test
    public MyRepository getMyRepository() {
        return myRepository;
    }

}
