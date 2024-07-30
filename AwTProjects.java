package awtprojects;
import java.awt.*;

public class AwTProjects {
    public static void main(String[] args)
    {
       Frame f=new Frame("First App");
       f.setLayout(new FlowLayout());  //converting border layout(frame's) to Flowlayout-> ok button
       
       Button b=new Button("OK");
       Label l=new Label("name ");
       System.out.println(" ");
       TextField a=new TextField(20);
       
       
      
       f.add(l);
       f.add(a);
        f.add(b);
       
       f.setSize(300,300);
       f.setVisible(true); 
    }
    
}
