package express.presentation.managerUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;

public class managerMenuUI extends JPanel{

	private MainUIService m;
	private CardLayout card;
//	private JFrame frame;
	private JPanel mainPanel;
	private JLabel userinfo;
	private JButton log;
	private JButton statistic;
	private JButton staff;
	private JButton org;
	private JButton examdoc;
	private JButton exit;

	public managerMenuUI(MainUIService main){
//		this.frame = f;
		int base = 150;
		int width = 50;
		
		setLayout(null);
		this.m = main;
		card = new CardLayout();
		mainPanel = new JPanel();
		mainPanel.setLayout(card);
		mainPanel.setBounds(150, 0, 850, 700);
		mainPanel.setBackground(Color.RED);
		this.add(mainPanel);

		userinfo = new JLabel();
		userinfo.setBounds(0, 0, 150, base);
		userinfo.setText("      userinfo");
		userinfo.setForeground(Color.gray);
		userinfo.setFont(new Font("隶书",Font.PLAIN,14));
		this.add(userinfo);
		
		log = new JButton("查询日志");
		log.setBounds(0, base, 150, width);
		log.setFont(new Font("隶书",Font.PLAIN,20));
		this.add(log);
		
		staff = new JButton("人员管理");
		staff.setBounds(0, base+width, 150, width);
		staff.setFont(new Font("隶书",Font.PLAIN,20));
		this.add(staff);
		
		org = new JButton("机构管理");
		org.setBounds(0, base+2*width, 150, width);
		org.setFont(new Font("隶书",Font.PLAIN,20));
		this.add(org);
		
		examdoc = new JButton("审批单据");
		examdoc.setBounds(0, base+3*width, 150, width);
		examdoc.setFont(new Font("隶书",Font.PLAIN,20));
		this.add(examdoc);
		
		statistic = new JButton("查看统计分析");
		statistic.setBounds(0, base+4*width, 150, width);
		statistic.setFont(new Font("隶书",Font.PLAIN,18));
		this.add(statistic);
		
		exit = new JButton("退出");
		exit.setBounds(0, 600, 150, width);
		exit.setFont(new Font("隶书",Font.PLAIN,20));
		this.add(exit);
		
		this.setBounds(0, 0, 1200, 900);
		this.setBackground(Color.BLUE);	
		
		log.addMouseListener(new Listener());		
		staff.addMouseListener(new Listener());	
		org.addMouseListener(new Listener());	
		examdoc.addMouseListener(new Listener());	
		statistic.addMouseListener(new Listener());	
        exit.addMouseListener(new Listener());
	}
	
	private class Listener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==exit){
				m.jumpToSignInUI();						
			}else if(e.getSource()==log){
				m.jumpTomanagerLogUI(card,mainPanel);	
			}else if(e.getSource()==staff){
				m.jumpTomanagerMemberUI(card,mainPanel);
			}else if(e.getSource()==org){
				m.jumpTomanagerOrgUI(card,mainPanel);
			}else if(e.getSource()==examdoc){
				m.jumpTomanagerExamDocUI(card,mainPanel);
			}else if(e.getSource()==statistic){
				m.jumpTomanagerStatisticUI(card,mainPanel);
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
