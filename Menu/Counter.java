import javax.swing.*;
import java.awt.event.*;
public class counter  implements ActionListener
{
        JTextField tf1,tf2;
        JLabel l1,l2;
        JButton b1,b2,b3;
        counter()
        {
                JFrame f=new JFrame("Counter");
                tf1=new JTextField();
                tf1.setBounds(130,80,100,20);
                tf2=new JTextField();
                tf2.setBounds(230,80,50,20);
                b1=new JButton("Count up");
                b1.setBounds(40,140,150,20);
                b2=new JButton("Count Down");
                b2.setBounds(290,140,150,20);
                b3=new JButton("Reset");
                b3.setBounds(450,140,150,20);
                f.add(tf1);
                f.add(b1);
                f.add(b2);
                f.add(b3);
                f.add(tf2);
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
f.setSize(800,800);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
        if(e.getSource()==b1)
        {
                Double num1=Double.parseDouble(tf1.getText());
                Double res=num1+1;
                 String s=Double.toString(res);
                tf2.setText(s);
        }
        if(e.getSource()==b2)
        {
                Double num1=Double.parseDouble(tf1.getText());
                Double res=num1-1;
                String s=Double.toString(res);
                tf2.setText(s);
        }
        if(e.getSource()==b3)
        {
                tf2.setText(" ");
        }
}
public static void main(String[] args)
{
new counter();
}
}
