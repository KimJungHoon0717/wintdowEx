import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SecondFrame extends JFrame {

	public SecondFrame(String title) {
		super(title);
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(400,400);
		setLocation(res.width/2-200, res.height/2-200);
		setVisible(true);
	}
	public static void main(String[] args) {
			new SecondFrame("두번째 프래임");
			
	}		
}
