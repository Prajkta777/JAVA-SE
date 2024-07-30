/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filetask2;
import java.io.*;
public class byteArrayEX3 {
    public static void main(String args[])throws Exception
    {
        //reading all bytes at at single time
            byte b[]={'a','b','c','d','v'};
       ByteArrayInputStream bis=new ByteArrayInputStream(b);
       String str=new String(bis.readAllBytes());  //boolean value returns
      System.out.print(bis.markSupported());
       bis.close();
    }
    
}
