package express.presentation.businessSaleUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;

public class businessDriverUI extends JPanel{
private MainUIService  m;
	
	public businessDriverUI(MainUIService main){
		Font font = new Font("楷体", Font.PLAIN, 18);
		Font f = new Font("仿宋", Font.PLAIN, 16);

		setLayout(null);
		this.m = main;

		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
	}
}
