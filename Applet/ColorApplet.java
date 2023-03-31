import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class ColorApplet extends Applet
{
        public static void main(String[] args)
       {
        Frame ForegroundBackgroundColor = new Frame("Change Background and Foreground Color of Applet");
        ForegroundBackgroundColor.setSize(420, 180);
        Applet ColorApplet = new ColorApplet();
        ForegroundBackgroundColor.add(ColorApplet);
        ForegroundBackgroundColor.setVisible(true);
ForegroundBackgroundColor.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {System.exit(0); }
     });
     }
  public void paint(Graphics g)
{
    Color c = getForeground();
    setBackground(Color.yellow);
    setForeground(Color.red);
    g.drawString("Foreground color set to red", 100, 50);
    g.drawString(c.toString(), 100, 80);
   g.drawString("Change Background and Foreground Color of Applet", 50, 100);
  }
}
