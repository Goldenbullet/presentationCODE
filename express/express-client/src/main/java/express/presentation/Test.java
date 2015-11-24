package express.presentation;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUI;
import express.presentation.mainUI.MainUIService;
import express.presentation.managerUI.managerLogUI;
import express.presentation.managerUI.managerMenuUI;
import express.presentation.userUI.SignInUI;

public class Test extends JFrame{
	private SignInUI signin;
	private CardLayout card;
	private JPanel container;
	private MainUIService main;
	
	public Test(){

		this.setLayout(null);
		container = new JPanel();
		container.setBounds(0,0,1000,700);
//		this.setContentPane(container);
		card= new CardLayout();		
		container.setLayout(card);
		
		main = new MainUI(card,container);
		signin = new SignInUI(main);
		this.add(container);
		container.add("signin", signin);
		card.show(container, "signin");
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,700);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test();
		
	}

}
