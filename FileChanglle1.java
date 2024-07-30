
package filechanglle.pkg1;
import java.io.*;
public class FileChanglle1 {
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/CopyFileDataTOanotherFile.txt");
        FileOutputStream fos=new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/Source.txt");
//       FileInputStream fis=new FileInputStream("CopyFileDataTOanotherFile.txt");
//        FileOutputStream fos=new FileOutputStream("Source.txt");
       
        int a;
        while((a=fis.read())!=-1)
        {
            if(a>=65 && a<=90)
                fos.write(a+32);
            else
                fos.write(a);
        }
        fis.close();
        fos.close();
    
}
}
