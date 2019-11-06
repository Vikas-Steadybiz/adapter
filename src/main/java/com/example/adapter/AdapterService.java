package com.example.adapter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class AdapterService {

    public static void main(String[] args) {
        AdapterService adapterService = new AdapterService();
        DemoModel1 demoModel1= adapterService.a();
        CombineModel combineModel= new CombineModel();
        combineModel.setDemoModel1(demoModel1);
        JSONToJavaExample jsonToJavaExample= new JSONToJavaExample();
        DemoModel demoModel=jsonToJavaExample.dem();
        combineModel.setDemoModel(demoModel);
        System.out.println(combineModel);
    }

    public DemoModel1 a(){
        DemoModel1 demoModel1=null;

        try {

            File file = new File("C:\\Users\\admin\\Downloads\\adapter\\adapter\\src\\main\\resources\\SoapOutput.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(DemoModel1.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
             demoModel1= (DemoModel1) jaxbUnmarshaller.unmarshal(file);

           System.out.println("Soap response in java object" +demoModel1.toString());
  //          System.out.println(demoModel1.getA());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return demoModel1;
    }
}
