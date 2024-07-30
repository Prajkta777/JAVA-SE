/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileinputexamples;

import java.io.*;

public class inputex4 {
    public static void main(String args[])throws Exception
    {
        try(FileInputStream fis=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/abc.txt"))
        {
            int x;
           //while loop
           while((x=fis.read())!=-1) {
              
                 System.out.print((char)x);

               }    
                
        }
        
     }
}
    

