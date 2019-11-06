package com.example.adapter;

import java.io.IOException;
import java.util.ArrayList;

public class Adapter1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Caller c= new Caller();
        OTA_AirLowFareSearchRS ota_airLowFareSearchRS= c.main();
        ArrayList <OTA_AirLowFareSearchRS> al= new ArrayList<>();
        al.add(ota_airLowFareSearchRS);
        Collect_OTA_AirLowFareSearchRS collect_ota_airLowFareSearchRS= new Collect_OTA_AirLowFareSearchRS();
        collect_ota_airLowFareSearchRS.setOta_airLowFareSearchRS_List(al);
        System.out.println(al);

    }
}
