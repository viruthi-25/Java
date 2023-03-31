import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class menu
{
menu()
{
JFrame f=new JFrame("Menu Example");
JTextArea ta=new JTextArea();
ta.setBounds(5,5,360,320);
JMenuBar mb=new JMenuBar();
JMenu m=new JMenu("File");
JMenu sm=new JMenu("Edit");
JMenu m1=new JMenu("Settings");
JMenu sm1=new JMenu("Language");
JMenuItem mi1=new JMenuItem("New");
JMenuItem mi2=new JMenuItem("Save");
JMenuItem mi3=new JMenuItem("Save as");
JMenuItem mi4=new JMenuItem("Open");
JMenuItem mi5=new JMenuItem("Close all");
m.add(mi1);
m.add(mi2);
m.add(mi3);
m.add(mi4);
m.add(mi5);
mb.add(m);
mb.add(sm);
mb.add(m1);
mb.add(sm1);
f.add(ta);
 f.setJMenuBar(mb);
//f.setMenuBar(mb);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String[] args)
  new menu();
}
}
