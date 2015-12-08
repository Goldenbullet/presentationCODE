package express.presentation.transRepoUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;

public class ViewShowUI extends JPanel{
	
	private JButton button_viewShow;
	private JButton button_return;
    private MainUIService m;
	
	public ViewShowUI(MainUIService main){
		
		setLayout(null);
		this.m=main;
		
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		
	}
	
}
