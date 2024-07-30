/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileoutputexample;

/**
 *
 * @author Priyanka
 */
import java.io.*;
public class fileoutputWithTryResources {
     public static void main(String args[])throws Exception
   {
    try (FileOutputStream fo = new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/ABC.txt"))
    {
            String s="Welcome to JAVA programming world, best of luvk dear JAVA Developer!";
            byte b[]=s.getBytes();
            
            fo.write(b);
        }
        
}
    
}
