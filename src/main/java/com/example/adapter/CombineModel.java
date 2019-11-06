package com.example.adapter;

import org.springframework.context.annotation.Configuration;

public class CombineModel {

    private DemoModel demoModel;
    private DemoModel1 demoModel1;

    public DemoModel getDemoModel() {
        return demoModel;
    }

    public void setDemoModel(DemoModel demoModel) {
        this.demoModel = demoModel;
    }

    public DemoModel1 getDemoModel1() {
        return demoModel1;
    }

    public void setDemoModel1(DemoModel1 demoModel1) {
        this.demoModel1 = demoModel1;
    }

    @Override
    public String toString() {
        return "CombineModel{" +
                "demoModel=" + demoModel +
                ", demoModel1=" + demoModel1 +
                '}';
    }
}
