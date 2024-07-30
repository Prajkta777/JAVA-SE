
package filetask2;
import java.io.*;
public class byteSTreamExample {
    public static void main(String args[])throws Exception
    {
        byte b[]={'a','b','c','d','e'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        int a;
        //reading byte by byte ,,single char by char
        while((a=bis.read())!=-1)
        {
            System.out.print((char)a);
        }
        bis.close();
    }
}
}
