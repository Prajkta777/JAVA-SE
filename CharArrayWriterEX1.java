
package filetask2;
import java.io.*;
public class CharArrayWriterEX1 {
    public static void main(String args[])throws Exception
         {
             
              char c[]={'s','o','r'};
             CharArrayWriter cw=new CharArrayWriter();
             for(char a:c)
                   cw.write(a);
//             char arr[]= writer.toCharArray();
//             for(char d:arr)
//                 System.out.print(d);
            for(char a:c)
                 System.out.print((char)a);
             
             cw.close();
//             int a;
//             while((a=cw.write())!=-1)
//                 System.out.print((char)a);
//             
//             cw.close();

//       CharArrayWriter bw=new CharArrayWriter();
//        bw.write('a');
//        bw.write('b');
//        bw.write('c');
//        //bw.writeTo(new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/sor.txt"));
//          int x;
//             while((x=bw.read())!=-1)
//                 System.out.print((char)x);     
//    bw.close();
             
             


         }
    
}
