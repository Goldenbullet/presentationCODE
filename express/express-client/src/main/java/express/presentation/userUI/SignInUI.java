package express.presentation.userUI;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUI;
import express.presentation.mainUI.MainUIService;
import express.presentation.managerUI.managerMenuUI;

public class SignInUI extends JPanel{
	
	private MainUIService m;
	private JButton manager_login;
	private JButton repo_login;
	private JButton admin_login;
	public SignInUI(MainUIService main){
		setLayout(null);
		this.setBounds(0, 0, 1000, 700);
		m = main;
		
		JListener listener=new JListener();
		
		
		manager_login = new JButton(" manager log in");
		manager_login.setBounds(100, 100, 150, 50);
		manager_login.addMouseListener(listener);
		this.add(manager_login);
		
		repo_login=new JButton("repo log in");
		repo_login.setBounds(100,200,150,50);
		repo_login.addMouseListener(listener);
		this.add(repo_login);
		
		admin_login=new JButton("admin log in");
		admin_login.setBounds(100,300,150,50);
		admin_login.addMouseListener(listener);
		this.add(admin_login);
		
		
	}
	class JListener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			 if (e.getSource()==manager_login){
				 m.jumpTomanagerMenuUI();
				 repaint();
				 System.out.println("总经理登录");
			 }
			 
			 else if (e.getSource()==repo_login){
				 m.jumpTotranscenterRepoMenuUI();
				 repaint();
				 System.out.println("仓库管理员登录");
			 }
			 else if (e.getSource()==admin_login){
				 m.jumpToadminStartUI();
				 repaint();
				 System.out.println("管理员登录");
				 
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
