
package filetask2;
import java.io.*;
public class FileTask2 {
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis1=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/CopyFileDataTOanotherFile.txt");
         FileInputStream fis2=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/Source.txt");
         
         FileOutputStream fos=new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/Task1.txt");
         
         SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
         int b;
         while((b=sis.read())!=-1)
         {
             fos.write(b);
         }
         sis.close();
         fis1.close();
         fis2.close();
         fos.close();
    }
    
}
