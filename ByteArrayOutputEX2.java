/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filetask2;

import java.io.*;
public class ByteArrayOutputEX2 {
     public static void main(String args[])throws Exception
    {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(15);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.writeTo(new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/Task2.txt"));
               
    bos.close();
    
}
}

    
}
