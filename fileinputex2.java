
package fileinputexamples;
import java.io.*;
public class fileinputex2 {
    public static void main(String args[])throws Exception
    {
        try(FileInputStream fis=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/abc.txt"))
        {
            int x;
            do  //box or ? is apper at last of string output
            {
               x=fis.read();
               System.out.print((char)x);
            }  while(x!=-1);     
        }
        
     }
}
