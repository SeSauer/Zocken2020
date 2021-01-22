
import javax.swing.*;

public class FirstPanel extends JPanel {

	@Override
	public void paintComponent(java.awt.Graphics g) {
		g.fillArc(200,200,100,100,10,130);
	}

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.add(new FirstPanel());
		f.setVisible(true);
	}

}