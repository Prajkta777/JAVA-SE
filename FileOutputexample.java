/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileoutputexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Priyanka
 */
public class FileOutputexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            FileOutputStream fov=new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/abc.txt");
            String s="Welcome to JAVA programming world, best of luvk dear JAVA Developer!";
            byte b[]=s.getBytes();
            for(byte x:b)
            {
                fov.write(x);
            }
            fov.close();
        
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
