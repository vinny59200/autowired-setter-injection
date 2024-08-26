package com.vv.autowired_setter_injection.controller;

import com.vv.autowired_setter_injection.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    @Autowired
    public void setMyService( MyService myService ) {

        this.myService = myService;

    }


}
