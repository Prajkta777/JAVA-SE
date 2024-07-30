
package propertiesdemo;
import java.util.*;
import java.io.*;
public class PropertiesDemo {

    public static void main(String[] args)throws Exception {

        Properties p=new Properties();
        p.setProperty("brand","dell");
        p.setProperty("brand","dell");
        p.setProperty("brand","dell");
     //   p.store(new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/properties.txt"),"Laptop");
        p.store(new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/Properties.txt"),"Laptop");
    
    }
    
}
