package com.example.adapter;


import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class Caller {

    public  OTA_AirLowFareSearchRS main() throws IOException, ClassNotFoundException {
        String string = "";
        InputStream inputStream= new FileInputStream("C:\\Users\\admin\\Downloads\\adapter\\adapter\\src\\main\\resources\\json");
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
            string += line + "\n";
        }

        JSONObject jsonObject = new JSONObject(string);
        System.out.println(jsonObject);

        URL url = new URL("https://api-crt.cert.havail.sabre.com/v4.3.0/shop/flights?mode=live");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Bearer T1RLAQKT6XzQPz2UqJF2vNet0I7xrdw/+xBxP80vYTiD/RTZDYOa0dBcAACwWIoATLnOD3LLClUCSY1izj54oCYEEndMez7hyAoNOGpaA7YsUSaQRfBgx+1nlrxpcI2UldmW26mIKp5croRHpr5qr0W+AQyfIUv5eCpjLq5Z6TKD1FaMNkjs7Q8tK7cxWbEMC0GdIsW9RyTRotvVoLEkheI28/KE+b0y4EPfeZ6UYwUR7WTh38yL4c3SXhteyUtgz0uGULRncxpEaTPpY3P57U0KWh7OmIXs6Kl3dFs*");
        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());

        out.write(jsonObject.toString());
        out.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        System.out.println(connection.getInputStream());
        JSONObject jsonObject1= new JSONObject(new JSONTokener(in));
        System.out.println("????"+jsonObject1);
       Gson gson= new Gson();
//        ObjectInputStream ois = new ObjectInputStream(connection.getInputStream());
//        OTA_AirLowFareSearchRS ota_airLowFareSearchRS = (OTA_AirLowFareSearchRS) ois.readObject();
//        System.out.println("-----"+ota_airLowFareSearchRS.);

        OTA_AirLowFareSearchRS ota_airLowFareSearchRS1 =gson.fromJson(jsonObject1.getJSONObject("OTA_AirLowFareSearchRS").toString(), OTA_AirLowFareSearchRS.class);
        System.out.println("\\\\\\"+ ota_airLowFareSearchRS1);
//        String sd= in.lines().collect(Collectors.joining());
//       // OTA_AirLowFareSearchRS ota_airLowFareSearchRS1=sd;
//        System.out.println("{{{{{{{"+sd);
//        StringBuilder stringBuilder= new StringBuilder();
//        String s1= in.readLine();
        return ota_airLowFareSearchRS1;
    }
}
