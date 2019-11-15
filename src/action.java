import java.awt.*;
import java.awt.event.*;
class AEvent extends Frame implements ActionListener{
    TextField tf;
    TextField tf2;
    AEvent(){

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        tf=new TextField();
        tf2=new TextField();
        tf.setBounds(60,50,170,20);
        tf2.setBounds(60,100,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);add(tf);add(tf2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
         tf2.getText();

    }
    public void actionPerformed(ActionEvent e){
        tf.setText(tf2.getText());
    }
    public static void main(String args[]){
        new AEvent();
    }
} 