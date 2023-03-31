import javax.swing.*;
import java.awt.event.*;
public class fahcel  implements ActionListener
{
        JTextField tf1,tf2;
        JLabel l1,l2;
        JButton b1;
        fahcel()
        {
                JFrame f=new JFrame("Celsius to Fahrenheit");
                tf1=new JTextField();
                tf2=new JTextField();
                tf1.setBounds(130,80,100,20);
                tf2.setBounds(130,110,100,20);
                l1=new JLabel("Celsius :");
                l2=new JLabel("Fahrenheit is :");
                l1.setBounds(30,80,100,20);
                l2.setBounds(30,110,100,20);
                b1=new JButton("Convert");
                b1.setBounds(40,140,100,20);
                f.add(tf1);
                f.add(tf2);
                f.add(l2);
                f.add(l1);
                f.add(b1);
                b1.addActionListener(this);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
        if(e.getSource()==b1)
        {
                Double num1=Double.parseDouble(tf1.getText());
                Double res=(1.8 * num1)+32;
                String s=Double.toString(res);
                tf2.setText(s);
                     }
}
public static void main(String[] args)
{
new fahcel();
}
}
