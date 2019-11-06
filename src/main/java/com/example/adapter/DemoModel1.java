package com.example.adapter;

import org.springframework.context.annotation.Configuration;

import javax.naming.Name;
import javax.xml.bind.annotation.*;


@XmlRootElement(name="DemoModel1")
public class DemoModel1 {
    private int a;
    private String b;

   @XmlElement
    public int getA() {
        return a;
    }

    public DemoModel1() {
    }

    public DemoModel1(int a, String b) {
        super();
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }
    @XmlElement
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "DemoModel1{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
