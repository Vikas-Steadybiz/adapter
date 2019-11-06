package com.example.adapter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;

public class JSONToJavaExample {

    public DemoModel dem()
    {
        DemoModel demoModel = null;
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            demoModel =  mapper.readValue(new File("C:\\Users\\admin\\Downloads\\adapter\\adapter\\src\\main\\resources\\RestOutput.json"), DemoModel.class);
        } catch (JsonGenerationException e)
        {
            e.printStackTrace();
        } catch (JsonMappingException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Rest Response in Java Object" +demoModel);
        return demoModel;
    }
}
