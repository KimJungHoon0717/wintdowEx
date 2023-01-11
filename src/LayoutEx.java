import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutEx extends JFrame {
   CenterPane cPanel;
   public LayoutEx() throws HeadlessException {
   super();
   setTitle("Event ����");
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
            JButton btnRed=new JButton("RED");
            btnRed.setForeground(Color.RED);
            btnRed.addActionListener(new ActionListener() {
               
               @Override
               public void actionPerformed(ActionEvent e) {
               cPanel.setBackground(Color.RED);
               System.out.println(e.getActionCommand());
                  
               }
            });
            JButton btnGreen=new JButton("GREEN");
            btnGreen.setForeground(Color.green);
            
            btnGreen.addActionListener(new ActionListener() {
               
               @Override
               public void actionPerformed(ActionEvent e) {
                  cPanel.setBackground(Color.green);
                  System.out.println(e.getActionCommand());
                  
               }
            });
            JButton btnBule=new JButton("BLUE");
            btnBule.setForeground(Color.blue);
            btnBule.addActionListener(new ActionListener() {
               
               @Override
               public void actionPerformed(ActionEvent e) {
                  cPanel.setBackground(Color.BLUE);
                  System.out.println(e.getActionCommand());
                  
                  
               }
            });
            add(btnRed);
            add(btnGreen);
            add(btnBule);
            
         }
         
      }
   class CenterPane extends JPanel{

      public CenterPane() {
         super();
         setLayout(null);
         setBackground(new Color(235,235,235));
         setLayout(null);
         String title[]= {"�����Ի���մϴ�"};
         
         int xs[] = {100,200,20};
         int ys[] = {20,140,170};
         
         for(int i=0; i<1; i++) {      
         JLabel lblLabel=new JLabel(title[i]);
         lblLabel.setBounds(xs[i],ys[i], 100, 20);
         add(lblLabel);
         }
      }
   }

   class BottomPane extends JPanel{   
      public BottomPane() {
         super();
         setBackground(Color.YELLOW);
         JButton btnInput=new JButton("Click");
         add(btnInput);
         add(new TextField(16));
         
         
         
   
      }
   }
      
   
      
      
   

   public static void main(String[] args) {
      new LayoutEx();

   }

   
}