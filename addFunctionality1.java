package awtprojects;

import java.awt.*;
import java.awt.event.*;

class myframe1 extends Frame implements ActionListener
{
    int count=0;
    Button b;
    Label l;
    
    public myframe1()
    {
        super("adding functionalities");
        b=new Button("Click");
        l=new Label("    "+count);
        b.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(l);
        add(b);
    }
    public void actionPerformed(ActionEvent e)
    {
        count++;
        l.setText("    "+count);
    }
}

public class addFunctionality1 
{
 public static void main(String args[])
 {
     myframe1 m=new myframe1();
     m.setSize(300, 300);
     m.setVisible(true);
 }
}
