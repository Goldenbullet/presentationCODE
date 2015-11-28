package express.presentation.deliverUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import express.presentation.mainUI.MainUIService;

public class deliverReceiveUI extends JPanel{
	private JButton button_return;
	private MainUIService m;
	
	public deliverReceiveUI(MainUIService main){
		
		 int textlength=150;
	        int textwidth=30;
	        
	        int labellength=100;
	        int labelwidth=30; 
	        
	        
		setLayout(null);
		this.m=main;	
		
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		Font font = new Font("楷体",Font.PLAIN,18);
		Font font0 = new Font("楷体",Font.BOLD,20);
		Font f = new Font("仿宋",Font.PLAIN,14);
		
		
		JLabel label1 = new JLabel("收件人姓名");
		label1.setBounds(200, 100, labellength, labelwidth);
		label1.setFont(font);
		this.add(label1);

		JLabel label2 = new JLabel("签收时间");
		label2.setBounds(200, 100 + labelwidth * 2, labellength, labelwidth);
		label2.setFont(font);
		this.add(label2);

		JLabel label3 = new JLabel("订单编号");
		label3.setBounds(200, 100 + labelwidth * 4, labellength, labelwidth);
		label3.setFont(font);
		this.add(label3);
		
		
		JTextField textArea1 = new JTextField("收件人姓名");
		textArea1.setBounds(300, 100, textlength, textwidth);
		textArea1.setFont(f);
//		textArea1.setBackground(Color.BLUE);
		// textAreaOutput.setSelectedTextColor(Color.RED);
//		textArea1.setLineWrap(true); // 激活自动换行功能
//		textArea1.setWrapStyleWord(true);// 激活断行不断字功能		
		this.add(textArea1);

		JTextField textArea2 = new JTextField("年月日");
		textArea2.setBounds(300, 100 + textwidth * 2, textlength, textwidth);
		textArea2.setFont(f);
//		textArea2.setBackground(Color.BLUE);
//		textArea2.setLineWrap(true);
//		textArea2.setWrapStyleWord(true);	
		this.add(textArea2);

		JTextField textArea3 = new JTextField("订单编号");
		textArea3.setBounds(300, 100 + textwidth * 4, textlength, textwidth);
		textArea3.setFont(f);
//		textArea3.setBackground(Color.BLUE);
//		textArea3.setLineWrap(true);
//		textArea3.setWrapStyleWord(true);		
		this.add(textArea3);

		
		button_return=new JButton("确认");
		button_return.setBounds(250, 520, 100, 30);
		button_return.setFont(font);
		this.add(button_return);
		
		JButton button_cancel=new JButton("取消");
		button_cancel.setBounds(380, 520, 100, 30);
		button_cancel.setFont(font);
		this.add(button_cancel);
		
	}
	

}
