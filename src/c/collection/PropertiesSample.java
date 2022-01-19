package c.collection;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample=new PropertiesSample();
        sample.saveAndLoadProperties();
        sample.saveAndLoadPropertiesXML();
    }
    public void checkProperties(){
        Properties prop=System.getProperties();
        Set<Object> keySet=prop.keySet();
        for(Object key:keySet){
            System.out.println(key+"="+prop.get(key));
        }
    }
    public void saveAndLoadProperties(){
        try{
            String fileName="test.properties";
            File propertiesFile=new File(fileName);
            FileOutputStream fos=new FileOutputStream(propertiesFile);
            Properties prop=new Properties();
            prop.setProperty("Writer","Hojoon, Lim");
            prop.setProperty("WriterHome","http://www.hojoon.com");
            prop.store(fos, "Basic Properties file");
            fos.close();

            FileInputStream fis=new FileInputStream(propertiesFile);
            Properties propLoaded=new Properties();
            propLoaded.load(fis);
            fis.close();
            System.out.println(propLoaded);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void saveAndLoadPropertiesXML(){
        try{
            String fileName="test.xml";
            File propertiesFile=new File(fileName);
            FileOutputStream fos=new FileOutputStream(propertiesFile);
            Properties prop=new Properties();
            prop.setProperty("Writer","Hojoon, Lim");
            prop.setProperty("WriterHome","http://www.hojoon.com");
            prop.storeToXML(fos, "Basic XML Properties file");
            fos.close();

            FileInputStream fis=new FileInputStream(propertiesFile);
            Properties propLoaded=new Properties();
            propLoaded.load(fis);
            fis.close();
            System.out.println(propLoaded);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
