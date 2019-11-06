package com.example.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerdemo {

@Autowired
ServiceDemo serviceDemo;

    @PostMapping("/vikas")
    public DemoModel demCont(@RequestBody DemoModel demoModel){
      //  serviceDemo.demoModelService(demoModel);
        return demoModel;
    }

//    @PostMapping("/vikas1")
//    public DemoModel1 demCont1(@RequestBody DemoModel1 demoModel){
//        //serviceDemo.demoModelService(demoModel);
//        return demoModel;
//    }





}
