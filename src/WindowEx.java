import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class WindowEx extends JFrame {

	public WindowEx() {
		//super("연습");
		setTitle("연습");
		JLabel lblMsg=new JLabel("홍길동",JLabel.CENTER);
		add(lblMsg,BorderLayout.CENTER);
		
		JButton btnOK=new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼눌림");
				lblMsg.setText("버튼눌림");
			}
		});
		add(btnOK,BorderLayout.SOUTH);
		
		this.setSize(400, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new WindowEx();
	
	}

}
