package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp{
    static FileInputStream input = null;
    static Properties prop = null;


    public String getProperty(String key){
        prop = new Properties();
        try {
            input = new FileInputStream("src/test/Resources/TestDataConfig.Properties");
            prop.load(input);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}