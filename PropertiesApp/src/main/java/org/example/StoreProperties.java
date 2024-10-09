package org.example;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class StoreProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("name","Johan");
        properties.put("surname","Quintero");
        properties.put("age","25");

        try {
            //Exportar propierdades a XML
            OutputStream outputStreamXml = new FileOutputStream("src/main/resources/application.xml");
            properties.storeToXML(outputStreamXml,"Any comment!");

            //Exportar propiedades a .properties
            OutputStream outputStreamProperties = new FileOutputStream("src/main/resources/application.properties");
            properties.store(outputStreamProperties,"Any comment!");
        }catch (Exception e){
            new RuntimeException(e);
        }
    }
}