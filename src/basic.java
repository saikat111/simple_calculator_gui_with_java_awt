import java.awt.*;
import java.awt.event.*;

public class basic extends Frame  {
    TextField tf;
    basic(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
           }
        });

            Button b1 = new Button("hi");
        add(b1);
        b1.setBounds(100,120,80,30);
        setSize(1000,546);
        setLayout(null);
        setVisible(true);
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        add(tf);

    }
    public static void main(String args[]){
        new basic();

    }

}