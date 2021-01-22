import javax.swing.*;
import java.awt.Dimension;
import util.ShowInFrame;

public class SimpleSizedPanel extends SizedPanel{
	static int[] xPoints1 = {150,160,200,170,190,150,120,130,100,140};
	static int[] yPoints1 = {0,40,40,60,100,80,100,60,40,40};
	static int[] xPoints2 = {50,100,100,50,0,0};
	static int[] yPoints2 = {0,30,80,110,80,30};
	
	public void paintComponent(java.awt.Graphics g) {
		g.fillRect(30,200,45,80);
		g.fillOval(100,200,50,50);
		g.fillPolygon(xPoints1, yPoints1, 10);
		g.drawPolygon(xPoints2,yPoints2,6);
		g.drawString("Hallo :)",200,200 );
	}
	public static void main(String[] args) {
		ShowInFrame.show(new SimpleSizedPanel());

	}

}
