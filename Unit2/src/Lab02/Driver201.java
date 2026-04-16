package Lab02;

import javax.swing.JFrame;

public class Driver201
{
 public static void main(String[] args)
 {
  JFrame frame = new JFrame("Our Fearless Leader");
frame.setSize(255, 295);
  frame.setLocation(100, 50);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setContentPane(new Panel201());
  frame.setVisible(true);
 }
}
