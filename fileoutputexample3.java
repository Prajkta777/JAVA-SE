//Try-with resources
package fileoutputexample;

/**
 *
 * @author Priyanka
 */
import java.io.*;
//if throws exception writeen main method then no need to write try and catch block in try-with resoces

public class fileoutputexample3 
{
     public static void main(String args[]) //throws Exception
   {
    try
        {
        try (FileOutputStream fo = new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/xyz.txt")) {
            String s="Welcome to JAVA programming world, best of luvk dear JAVA Developer!";
            byte b[]=s.getBytes();
            
            fo.write(b);
        }
        
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
}
    
}
