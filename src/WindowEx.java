import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class WindowEx extends JFrame {

	public WindowEx() {
		//super("����");
		setTitle("����");
		JLabel lblMsg=new JLabel("ȫ�浿",JLabel.CENTER);
		add(lblMsg,BorderLayout.CENTER);
		
		JButton btnOK=new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư����");
				lblMsg.setText("��ư����");
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
