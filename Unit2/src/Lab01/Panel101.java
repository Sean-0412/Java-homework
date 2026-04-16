package Lab01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel101 extends JPanel
{
 public void paintComponent(Graphics g)
 {
  super.paintComponent(g);

  g.setColor(Color.BLUE);//背景
  g.fillRect(0, 0, 400, 350);

  g.setColor(new Color(230, 220, 190));//地面
  g.fillRect(0, 350, 400, 50);

  g.setColor(Color.YELLOW);//太陽
  g.fillOval(300, 75, 50, 50);

  g.setColor(new Color(230, 230, 230));
  g.fillRect(100, 200, 150, 150);

    int[] roofX = {75, 175, 275};
    int[] roofY = {200, 150, 200};
    g.fillPolygon(roofX, roofY, 3);

  g.setColor(Color.BLACK);//房子
  g.drawRect(100, 200, 150, 150);

  g.drawLine(75, 200, 175, 150);
  g.drawLine(175, 150, 275, 200);
  
  g.drawLine(75, 200, 275, 200);
  g.setColor(Color.BLACK);//門
  g.fillRect(150, 275, 50, 75);

  g.drawLine(0, 350, 400, 350);

  g.setColor(Color.WHITE);
  g.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
  g.drawString("Welcome Home", 40, 40);
 }
}
