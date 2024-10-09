package org.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class LoadProperties {
    public static void main(String[] args) {
        Properties propertiesXml = new Properties();
        Properties properties = new Properties();
        try {
            InputStream inputStreamXml = new FileInputStream("src/main/resources/application.xml");
            propertiesXml.loadFromXML(inputStreamXml);
            System.out.println(propertiesXml);

            InputStream inputStreamProperties = new FileInputStream("src/main/resources/application.properties");
            properties.load(inputStreamProperties);
            System.out.println(properties);
        }catch (Exception e){
            new RuntimeException(e);
        }
    }
}
