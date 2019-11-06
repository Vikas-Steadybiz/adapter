package com.example.adapter;

import org.springframework.stereotype.Service;

@Service
public class DemoService1 {


    public static void main(String[] args) {
        DemoService1 service1= new DemoService1();
        service1.combineModelService();
    }
public CombineModel combineModelService(){
    DemoModel demoModel= new DemoModel();
    JSONToJavaExample jsonToJavaExample= new JSONToJavaExample();
    demoModel= jsonToJavaExample.dem();
    DemoModel1 demoModel1= new DemoModel1();
    AdapterService adapterService = new AdapterService();
    demoModel1= adapterService.a();
    CombineModel combineModel= new CombineModel();
    combineModel.setDemoModel(demoModel);
    combineModel.setDemoModel1(demoModel1);
    System.out.println(combineModel);
    return combineModel;



}
}
