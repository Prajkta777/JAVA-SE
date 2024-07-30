package awtprojects;
//own frame class
import java.awt.*;
class myframe extends Frame
{
        Button b;  //refrences created
        Label l;
        TextField t;
        
    public myframe()  //constcter
    {   
        super("2ND WAY TO BUILT APP");  //super call Frame firstly then myframe class
        setLayout(new FlowLayout());
        b=new Button("OK");
        l=new Label("Name ");
        t=new TextField(20);   //20 is not size but it is visibility of words upto 20 charcters
        add(l);
        add(t);
        add(b);
        
    }
}
public class AWT2ndMethod {
    public static void main(String args[])
    {
        myframe m=new myframe();
        m.setSize(400, 400);
        m.setVisible(true);
        
    }
    
}
