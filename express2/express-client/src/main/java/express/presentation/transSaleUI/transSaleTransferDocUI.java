package express.presentation.transSaleUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import express.presentation.mainUI.MainUIService;

public class transSaleTransferDocUI extends JPanel{
	private JButton button_return;
	private MainUIService m;
	
	public transSaleTransferDocUI(MainUIService main){
		
        setLayout(null);
		this.m=main;
		
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		button_return=new JButton("中转单 退出");
		button_return.setBounds(100, 100, 150, 50);
		this.add(button_return);
    }

}
