package express.presentation.deliverUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;

public class deliverReceiveUI extends JPanel{
	private JButton button_return;
	private MainUIService m;
	
	public deliverReceiveUI(MainUIService main){
		setLayout(null);
		this.m=main;	
		
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		Font font = new Font("楷体",Font.PLAIN,18);
		Font font0 = new Font("楷体",Font.BOLD,20);
		Font f = new Font("仿宋",Font.PLAIN,14);
		
		button_return=new JButton("收件信息 退出");
		button_return.setBounds(100, 100, 150, 50);
		this.add(button_return);
		
	}
	

}
