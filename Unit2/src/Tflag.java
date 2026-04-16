import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tflag {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Taiwan Flag");
		frame.setSize(720, 520);
		frame.setLocation(180, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new FlagPanel());
		frame.setVisible(true);
	}

	private static class FlagPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

			int panelW = getWidth();
			int panelH = getHeight();

			// Keep the official 3:2 flag ratio centered in the panel.
			int flagW = panelW;
			int flagH = panelW * 2 / 3;
			if (flagH > panelH) {
				flagH = panelH;
				flagW = panelH * 3 / 2;
			}

			int x0 = (panelW - flagW) / 2;
			int y0 = (panelH - flagH) / 2;

			drawFlag(g2, x0, y0, flagW, flagH);
		}

		private void drawFlag(Graphics2D g2, int x, int y, int w, int h) {
			Color red = new Color(220, 0, 0);
			Color blue = new Color(0, 56, 168);

			// Red field.
			g2.setColor(red);
			g2.fillRect(x, y, w, h);

			// Blue canton in the upper-left quarter.
			int cantonW = w / 2;
			int cantonH = h / 2;
			g2.setColor(blue);
			g2.fillRect(x, y, cantonW, cantonH);

			drawSun(g2, x, y, cantonW, cantonH);

			// Border for visual clarity on white backgrounds.
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(2f));
			g2.drawRect(x, y, w, h);
		}

		private void drawSun(Graphics2D g2, int x, int y, int cantonW, int cantonH) {
			int cx = x + cantonW / 2;
			int cy = y + cantonH / 2;

			int rayOuter = Math.min(cantonW, cantonH) * 48 / 100;
			int rayInner = rayOuter * 68 / 100;
			int rayBase = rayOuter * 74 / 100;
			double halfWidth = Math.toRadians(4.5);

			g2.setColor(Color.WHITE);
			for (int i = 0; i < 12; i++) {
				double angle = Math.toRadians(i * 30.0);
				Polygon ray = new Polygon();
				ray.addPoint(
					cx + (int) (rayOuter * Math.cos(angle)),
					cy + (int) (rayOuter * Math.sin(angle))
				);
				ray.addPoint(
					cx + (int) (rayBase * Math.cos(angle - halfWidth)),
					cy + (int) (rayBase * Math.sin(angle - halfWidth))
				);
				ray.addPoint(
					cx + (int) (rayBase * Math.cos(angle + halfWidth)),
					cy + (int) (rayBase * Math.sin(angle + halfWidth))
				);
				g2.fillPolygon(ray);
			}

			// White ring and blue inner disk to form the sun symbol.
			int ringR = rayInner;
			g2.setColor(Color.WHITE);
			g2.fillOval(cx - ringR, cy - ringR, ringR * 2, ringR * 2);

			int whiteCoreR = Math.max(1, ringR / 20);
			g2.setColor(Color.WHITE);
			g2.fillOval(cx - whiteCoreR, cy - whiteCoreR, whiteCoreR * 2, whiteCoreR * 2);
		}
	}
}
