package express.presentation.deliverUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;

public class deliverMenuUI extends JPanel{
	private CardLayout card=new CardLayout();
	   
	private MainUIService main;
	private JPanel actionPanel;
	
	private JLabel userinfo;
	 
	private JButton button_order = new JButton("输入订单");
	private JButton button_info = new JButton("输入收件信息");
    private JButton button_exit = new JButton("退出");
	
	
	
	public deliverMenuUI(MainUIService m){
		

		int base = 150;
		int width = 50;
		
		
		this.main=m;
		this.setLayout(null);
		
		
		actionPanel=new JPanel();
		actionPanel.setLayout(card);
		actionPanel.setBounds(150, 0, 850, 700);
		actionPanel.setBackground(Color.RED);
		this.add(actionPanel);
		
		
		userinfo = new JLabel();
		userinfo.setBounds(0, 0, 150, base);
		userinfo.setText("      userinfo");
		userinfo.setForeground(Color.gray);
		userinfo.setFont(new Font("隶书",Font.PLAIN,14));
		
		
		JListener listener=new JListener();
		
		
		 button_order.setBounds(0, base, 150, width);
		 button_order.addMouseListener(listener);//加监听
			
		 button_info.setBounds(0, base+width, 150, width);
		 button_info.addMouseListener(listener);//加监听
		
		 button_exit.setBounds(0, 600, 150, 50); 
		 button_exit.addMouseListener(listener);
			
			
			
		 this.add(button_order);
		 this.add(button_info);
		 this.add(button_exit);
		 this.add(userinfo);
		
		 this.setBounds(0,0,1000,700);
		 this.setBackground(Color.BLUE);
		
	}
	class JListener implements MouseListener{

		public void mouseClicked(MouseEvent arg0) {
			 if (arg0.getSource()==button_order){

				 main.jumpTodeliverOrderUI(card,actionPanel);
				 repaint();
				 System.out.println("应该跳转到“输入订单”界面的");
				
			 }
			 else if (arg0.getSource()==button_info){
				 main.jumpTodeliverReceiveUI(card,actionPanel); 
				 repaint();
				 System.out.println("应该跳转到“输入收件信息”界面的");
					 
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
