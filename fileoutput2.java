/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileoutputexample;

import java.io.*;

/**
 *
 * @author Priyanka
 */
public class fileoutput2 {
   public static void main(String args[])
   {
    try
        {
            FileOutputStream fo=new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/ZXC.txt");
            String s="Welcome to JAVA programming world, best of luvk dear JAVA Developer!";
            byte b[]=s.getBytes();
           
             fo.write(b,15,s.length()-15);
            
            fo.close();
        
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
