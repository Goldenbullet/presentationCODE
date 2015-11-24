package express.presentation.managerUI;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;

public class managerOrgUI extends JPanel{

	private JButton org,exit;
	private MainUIService m;
	
	public managerOrgUI(MainUIService main){
		setLayout(null);
		m = main;
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		org = new JButton("ORG");
		org.setBounds(100, 100, 100, 50);
		this.add(org);
		
		exit = new JButton("exit");
		exit.setBounds(100, 200, 100, 50);
		this.add(exit);
		
		exit.addMouseListener(new Listener());
	}
	
	private class Listener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==exit){
				m.jumpTomanagerMenuUI();			
			}
			repaint();
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
