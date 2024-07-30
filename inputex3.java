
package fileinputexamples;

import java.io.*;
public class inputex3 {
    public static void main(String args[])throws Exception
    {
        try(FileInputStream fis=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/abc.txt"))
        {
            int x;
            do
            {
               x=fis.read();
               if(x!=-1) //box is removed
               {
                 System.out.print((char)x);

               }    
            }  while(x!=-1);     
        }
        
     }
}
