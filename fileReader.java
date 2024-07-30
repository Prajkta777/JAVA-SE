/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileinputexamples;
import java.io.*;
public class fileReader {
    public static void main(String args[])throws Exception
    {
        try(FileReader fr=new FileReader("C:/Users/Priyanka/Documents/NetBeansProjects/abc.txt"))
        {
            int x;
            do
            {
               x=fr.read();
               if(x!=-1) //box is removed
               {
                 System.out.print((char)x);

               }    
            }  while(x!=-1);     
        }
        
     }
}
    
}
