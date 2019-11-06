package com.example.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDemo {

    @Autowired
    CombineModel combineModel;


    public CombineModel demoModelService(DemoModel demoModel, DemoModel1 demoModel1){

        combineModel.setDemoModel(demoModel);
        combineModel.setDemoModel1(demoModel1);

    return combineModel;
    }
}
