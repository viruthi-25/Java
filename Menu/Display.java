import javax.swing.*;
import java.awt.event.*;
public class display  implements ActionListener
{
        JTextField tf1,tf2,tf3;
        JLabel l1,l2,l3;
        JButton b1,b2,b3,b4;
        display()
        {
                JFrame f=new JFrame("Display");
                l1=new JLabel("Number  is :");
                l1.setBounds(30,80,100,20);
                l2=new JLabel("Name:");
                l2.setBounds(530,80,100,20);
                l3=new JLabel("Password  is :");
                l3.setBounds(630,80,100,20);
                tf1=new JTextField();
                tf1.setBounds(130,80,100,20);
                tf2=new JTextField();
                tf2.setBounds(30,180,50,20);
                tf3=new JTextField();
                tf3.setBounds(230,180,50,20);
                b1=new JButton("Yes");
                b1.setBounds(40,140,150,20);
                b2=new JButton("No");
                b2.setBounds(290,140,150,20);
                b3=new JButton("Undecided");
                b3.setBounds(450,140,150,20);
                b4=new JButton("Details");
                b4.setBounds(600,140,150,20);
                f.add(tf1);
                f.add(b1);
                f.add(b2);
                f.add(b3);
                f.add(b4);
                f.add(l1);
                f.add(tf2);
                f.add(tf3);
                   f.add(l2);
                f.add(l3);
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
f.setSize(800,800);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
        if(e.getSource()==b1)
        {
                JOptionPane.showMessageDialog(null,"Yes");
        }
        if(e.getSource()==b2)
        {
                        JOptionPane.showMessageDialog(null,"No");
        }
        if(e.getSource()==b3)
        {
                        JOptionPane.showMessageDialog(null,"Undecided");
        }
        if(e.getSource()==b4)
        {
                String s1=tf2.getText();
                String s2=tf3.getText();
                        JOptionPane.showMessageDialog(null,"Name:" +s1+ " Password:" +s2);
                        l2.setText(s1);
                        l3.setText(s2);
        }
}
public static void main(String[] args)
{
new display();
}
}
