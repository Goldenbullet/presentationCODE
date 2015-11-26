package express.presentation.adminUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import express.presentation.mainUI.MainUIService;

public class AdminStartUI extends JPanel{

//	private JLabel add;
//	private JLabel delete;
	private MainUIService main;
	private JLabel userinfo;
	private JButton button_exit = new JButton("退出");
	//private JTable table;
	
	public AdminStartUI(MainUIService m){
		String[] name={"姓名","职位","工号","密码"};
		String[] user1={"lhl","man","10001","110"};
		String[] user2={"hmt","woman","10086","120"};
		String user[][]={user1,user2};
		
		this.setLayout(null);
		this.main=m;
		
		
		JListener listener=new JListener();
		
		
		userinfo = new JLabel();
		userinfo.setBounds(0, 0, 150, 150);
		userinfo.setText("      userinfo");
		userinfo.setForeground(Color.gray);
		userinfo.setFont(new Font("隶书",Font.PLAIN,14));
		this.add(userinfo);
		
		
		button_exit.setBounds(0, 600, 150, 50); 
		button_exit.addMouseListener(listener);
		this.add(button_exit);
		
		JTable table=new JTable(user,name);
		table.setBounds(200, 0, 400, 200);
	    JScrollPane scrollPane= new JScrollPane(table);
		//this.add(scrollPane);
		this.add(table);
		
		this.setBounds(0,0,1000,700);
		//this.setBackground(Color.BLUE);
		//this.setForeground(Color.green);
		
	}
	class JListener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			if (e.getSource()==button_exit){
				main.jumpToSignInUI();
				repaint();
				System.out.println("应该回到登陆界面的");
				
			}
			else {
				
			}
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}




