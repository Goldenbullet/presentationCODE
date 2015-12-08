package express.presentation.deliverUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;

public class deliverMenuUI extends JPanel{
	private CardLayout card;
	   
	private MainUIService main;
	private JPanel actionPanel;	
	private JLabel userinfo;	 
	private JButton button_order;
	private JButton button_info;
    private JButton button_exit;

	public deliverMenuUI(MainUIService m){
		
		this.setLayout(null);
		this.main=m;
		card=new CardLayout();

		int base = 150;
		int width = 50;		
		Font font = new Font("隶书",Font.PLAIN,20);
		
		actionPanel=new JPanel();
		actionPanel.setLayout(card);
		actionPanel.setBounds(150, 0, 850, 700);
		actionPanel.setOpaque(false);
		this.add(actionPanel);
		
		main.setcard1(card);
		main.setpane1(actionPanel);
		
		userinfo = new JLabel();
		userinfo.setBounds(0, 0, 150, base);
		userinfo.setText("      userinfo");
		userinfo.setForeground(Color.gray);
		userinfo.setFont(new Font("隶书",Font.PLAIN,14));
		
		
		JListener listener=new JListener();
		
		button_order = new JButton("输入订单");
		button_order.setFont(font);
		 button_order.setBounds(0, base, 150, width);
		 button_order.addMouseListener(listener);//加监听
		
		 button_info = new JButton("输入收件信息");
		 button_info.setFont(new Font("隶书",Font.PLAIN,18));
		 button_info.setBounds(0, base+width, 150, width);
		 button_info.addMouseListener(listener);//加监听
		
		 button_exit = new JButton("退出");
		 button_exit.setFont(font);
		 button_exit.setBounds(0, 600, 150, 50); 
		 button_exit.addMouseListener(listener);
		
		 this.add(button_order);
		 this.add(button_info);
		 this.add(button_exit);
		 this.add(userinfo);
		
		 this.setBounds(0,0,1000,700);	
	}
	class JListener implements MouseListener{

		public void mouseClicked(MouseEvent arg0) {
			 if (arg0.getSource()==button_order){
				 main.jumpTodeliverOrderUI();		
				 System.out.println("应该跳转到“输入订单”界面的");	
				 
			 }
			 else if (arg0.getSource()==button_info){
				 main.jumpTodeliverReceiveUI(); 
				 System.out.println("应该跳转到“输入收件信息”界面的");
				 
			 }
			 else if (arg0.getSource()==button_exit){
				 main.jumpToSignInUI();
				 System.out.println("应该回到登陆界面的");	
				 
			 }
			 repaint();
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
	
	public void paintComponent(Graphics g) {
		ImageIcon background = new ImageIcon("picture/background.png");
		g.drawImage(background.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
