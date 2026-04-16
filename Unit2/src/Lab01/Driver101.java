package Lab01;

import javax.swing.JFrame;

public class Driver101
{
 public static void main(String[] args)
 {
  JFrame frame = new JFrame("Unit2, Lab01: Welcome Home");
  frame.setSize(420, 440);
  frame.setLocation(100, 50);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setContentPane(new Panel101());
  frame.setVisible(true);
 }
}
