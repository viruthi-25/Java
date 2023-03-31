
package buttonwindow;
import java.awt.Button;
import java.awt.Frame;
public class Buttonwindow {
public static void main(String[] args) {
        Frame f = new Frame("Button Example");
  Button b = new Button("A");
 b.setBounds(10,40,150,30);
    Button b1=new Button("L");
    b1.setBounds(160,40,50,30);
    Button b2=new Button("B");
    b2.setBounds(10,70,50,90);
     Button b3=new Button("C");
    b3.setBounds(60,70,50,90);
     Button b4=new Button("D");
    b4.setBounds(110,70,50,90);
     Button b5=new Button("M");
    b5.setBounds(160,70,50,30);
      Button b6=new Button("N");
    b6.setBounds(160,100,50,30);
     Button b7=new Button("O");
    b7.setBounds(160,130,50,30);
    Button b8=new Button("P");
    b8.setBounds(160,160,50,30);
     Button b9 = new Button("E");
b9.setBounds(10,160,150,30);
      Button b10= new Button("F");
    b10.setBounds(10,190,100,30);
    Button b11 = new Button("G");
    b11.setBounds(110,190,100,30);
    Button b12= new Button("H");
    b12.setBounds(10,220,100,30);
    Button b13= new Button("I");
    b13.setBounds(110,220,100,30);
  Button b14= new Button("J");
    b14.setBounds(10,250,100,30);
    Button b15= new Button("K");
    b15.setBounds(110,250,100,30);
    f.add(b);
    f.add(b1);
    f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);
    f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);f.add(b13);f.add(b14);f.add(b15);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
}
