package Lab00;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel100 extends JPanel
{
 public void paintComponent(Graphics g)
 {
  super.paintComponent(g);

  g.setColor(Color.BLACK);
  g.fillRect(75, 50, 300, 125);
  g.setFont(new Font("Serif", Font.BOLD, 50));

  g.setColor(new Color(255, 200, 100));
  g.drawString("Hello World", 100, 150);
 }
}
