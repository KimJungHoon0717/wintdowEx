import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoutEx3 extends JFrame {
   CenterPane cPanel;
   public LayoutEx3() throws HeadlessException {
   super();
   setTitle("Layout ¿¬½À");
   Container cp=getContentPane();
   
   cPanel=new CenterPane();
   NorthPane nPanel=new NorthPane();
   BottomPane bPanel=new BottomPane();
   
   cp.add(nPanel,BorderLayout.NORTH);
   cp.add(cPanel,BorderLayout.CENTER);
   cp.add(bPanel,BorderLayout.SOUTH);
   setSize(300, 300);
   setVisible(true);
   }


   class NorthPane extends JPanel{
         public NorthPane() {
            setBackground(Color.LIGHT_GRAY);
            MyListener listener=new MyListener();
            JButton btnRed=new JButton("RED");
            btnRed.setForeground(Color.red);
            btnRed.addActionListener(new MyListener());
         
            JButton btnGreen=new JButton("GREEN");
            btnGreen.setForeground(Color.green);
            
            btnGreen.addActionListener(new MyListener());
            JButton btnBule=new JButton("BLUE");
            btnBule.setForeground(Color.blue);
            btnBule.addActionListener(new MyListener()); 
            add(btnRed);
            add(btnGreen);
            add(btnBule);
            
         }
         
      }
   class MyListener implements ActionListener{

      @Override
      public void actionPerformed(ActionEvent e) {
         String comm=e.getActionCommand();
         switch(comm) {
         case "RED":
            cPanel.setBackground(Color.RED); break;
         case "GREEN":
            cPanel.setBackground(Color.GREEN); break;
         case "BLUE":
            cPanel.setBackground(Color.BLUE); break;
         }
         
      }
         
         
      }
   class CenterPane extends JPanel{

      public CenterPane() {
         super();
         setLayout(null);
         setBackground(new Color(235,235,235));
         setLayout(null);
         String title[]= {"HI","BYE","SO"};
         
         int xs[] = {100,200,20};
         int ys[] = {20,140,170};
         
         for(int i=0; i<3; i++) {      
         JLabel lblLabel=new JLabel(title[i]);
         lblLabel.setBounds(xs[i],ys[i], 100, 20);
         add(lblLabel);
         }
      }
   }

   class BottomPane extends JPanel{   
      public BottomPane() {
         super();
         setOpaque(true);
         setBackground(Color.YELLOW);
         JButton btnInput=new JButton("Word input");
         JTextField txtInput=new JTextField(15);
         add(btnInput);
         btnInput.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				//System.out.println("mouseExited");
				txtInput.setText("±³¼ö´Ô");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				txtInput.setText("»ç¶û");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				txtInput.setText("ÇÕ´Ï´Ù");
				
			}
		});
         
     
         add(btnInput);
         add(txtInput);	
         
      }
   }
      
   
      
      
   

   public static void main(String[] args) {
      new LayoutEx3();

   }

   
}