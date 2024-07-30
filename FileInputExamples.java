
package fileinputexamples;
import java.io.*;
public class FileInputExamples {
    public static void main(String[] args)throws Exception 
    {
        // Try with resources
        try(FileInputStream fis=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/abc.txt") )
        {
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.print(str);
        }
            
     }
    
}
