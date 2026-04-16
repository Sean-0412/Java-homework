package Lab02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel201 extends JPanel
{
 private ImageIcon thomas;

 public Panel201()
 {
  thomas = loadThomas();
 }

 private ImageIcon loadThomas()
 {
  URL imageUrl = getClass().getResource("/Lab02/tj.jpg");
  if (imageUrl != null)
  {
   return new ImageIcon(imageUrl);
  }

  String[] paths = {"Unit2/src/Lab02/tj.jpg", "src/Lab02/tj.jpg", "Lab02/tj.jpg", "tj.jpg"};
  for (String path : paths)
  {
   ImageIcon icon = new ImageIcon(path);
   if (icon.getIconWidth() > 0)
   {
    return icon;
   }
  }

  return new ImageIcon();
 }

 public void paintComponent(Graphics g)
 {
  super.paintComponent(g);

  g.setColor(new Color(35, 36, 39));
  g.fillRect(0, 0, getWidth(), getHeight());

  int x = 78;
  int y = 34;
  int w = 95;
  int h = 132;

  g.setColor(new Color(190, 190, 190));
  g.fillRect(x, y, w, h);

  g.setColor(new Color(190, 190, 190));
  for (int c = x - 3; c <= x + w - 12; c += 12)
  {
   g.fillOval(c, y - 7, 16, 16);
   g.fillOval(c, y + h - 9, 16, 16);
  }
  for (int r = y + 4; r <= y + h - 20; r += 12)
  {
   g.fillOval(x - 8, r, 16, 16);
   g.fillOval(x + w - 8, r, 16, 16);
  }

  g.setColor(new Color(55, 55, 55));
  g.fillRect(x + 12, y + 12, 71, 108);
  if (thomas.getIconWidth() > 0)
  {
   g.drawImage(thomas.getImage(), x + 14, y + 14, 67, 104, null);
  }
  else
  {
   g.setColor(Color.WHITE);
   g.setFont(new Font("Serif", Font.BOLD, 11));
   g.drawString("tj.jpg not found", x + 8, y + 70);
  }

  g.setColor(Color.WHITE);
  g.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
  g.drawString("Our Fearless Leader", 44, 232);
 }
}
