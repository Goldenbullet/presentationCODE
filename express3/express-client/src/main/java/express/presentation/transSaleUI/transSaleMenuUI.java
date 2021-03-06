package express.presentation.transSaleUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;
import javafx.scene.text.Font;

public class transSaleMenuUI extends JPanel{

		private CardLayout card=new CardLayout();
	    private MainUIService main;
		
	    private JPanel transsalePanel;
		//组件：
	    private JLabel userinfo;
		private JButton button_arrival = new JButton("生成到达单");
		private JButton button_shipment = new JButton("生成装车单");
		private JButton button_transfer = new JButton("生成中转单");
	    private JButton button_exit = new JButton("退出");
		
		
		
		public transSaleMenuUI(MainUIService m){
			
			int base = 150;
			int width = 50;
			
			this.setLayout(null);
			this.main=m;
			
			transsalePanel=new JPanel();
			transsalePanel.setLayout(card);
			transsalePanel.setBounds(150, 0, 850, 700);
			transsalePanel.setBackground(Color.RED);
			this.add(transsalePanel);
			
			
			JListener listener=new JListener();
			
			userinfo = new JLabel();
			userinfo.setBounds(0, 0, 150, base);
			userinfo.setText("      userinfo");
			userinfo.setForeground(Color.gray);
			//userinfo.setFont(new Font("隶书",Font.PLAIN,14));
			
			
			button_arrival.setBounds(0, base, 150, width);
			button_arrival.addMouseListener(listener);//加监听
			
			
			
			
			button_shipment.setBounds(0, base+width, 150, width);
			button_shipment.addMouseListener(listener);//加监听
			
			
			button_transfer.setBounds(0, base+2*width, 150, width);
			button_transfer.addMouseListener(listener);//加监听
				
			button_exit.setBounds(0, 600, 150, 50); 
			button_exit.addMouseListener(listener);
			
			
			add(button_arrival);
			add(button_shipment);
			add(button_transfer);
			add(button_exit);
			add(userinfo);
			
			this.setBounds(0,0,1000,700);
			this.setBackground(Color.BLUE);
			

		}
		class JListener implements MouseListener{

			public void mouseClicked(MouseEvent arg0) {
				 if (arg0.getSource()==button_arrival){

					 main.jumpTotransSaleArrivalDocUI(card,transsalePanel);
					 repaint();
					 System.out.println("应该跳转到“到达单”界面的");
					
				 }
				 else if (arg0.getSource()==button_shipment){
					 main.jumpTotransSaleShipmentDocUI(card,transsalePanel);
					 repaint();
					 System.out.println("应该跳转到“装车单”界面的");
						 
				 }
				 
				 else if (arg0.getSource()==button_transfer){
					 main.jumpTotransSaleTransterDocUI(card,transsalePanel);
					 repaint();
					 System.out.println("应该跳转到“中转单”界面的");
						
				 }
				 else if (arg0.getSource()==button_exit){

					 main.jumpToSignInUI();
					 repaint();
					 System.out.println("应该回到登陆界面的");
					
				 }
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		}
		
		

}