package express.presentation.deliverUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import express.presentation.mainUI.MainUIService;

public class deliverOrderUI extends JPanel{
	
	private JButton button_return;
	private MainUIService m;
	
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_8;
	private JTextField textField_6;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	
	public deliverOrderUI(MainUIService main){
		setLayout(null);
		this.m=main;
		
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\u5BC4\u4EF6\u4EBA\u4FE1\u606F\uFF1A");
		label.setBounds(5, 30, 150, 30);
		this.add(label);
		
		JLabel label_1 = new JLabel("\u5BC4\u4EF6\u4EBA\u59D3\u540D");
		label_1.setBounds(20, 75, 100, 30);
		this.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(100, 75, 100, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u4F4F\u5740");
		label_2.setBounds(300, 75, 100, 30);
		this.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(375, 76, 150, 30);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u5355\u4F4D");
		lblNewLabel.setBounds(20, 130, 100, 30);
		this.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 135, 150, 30);
		this.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u7535\u8BDD");
		label_3.setBounds(300, 130, 100, 30);
		this.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(375, 135, 150, 30);
		this.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u624B\u673A\u53F7");
		lblNewLabel_1.setBounds(550, 135, 100, 30);
		this.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(610, 131, 150, 30);
		this.add(textField_4);
		
		
		JLabel label_4 = new JLabel("\u6536\u4EF6\u4EBA\u4FE1\u606F\uFF1A");
		label_4.setBounds(5, 180, 100, 30);
		this.add(label_4);
		
		JLabel label_5 = new JLabel("\u5BC4\u4EF6\u4EBA\u59D3\u540D");
		label_5.setBounds(20, 225, 100, 30);
		this.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(100, 225, 100, 30);
		this.add(textField_5);
		
		JLabel label_6 = new JLabel("\u4F4F\u5740");
		label_6.setBounds(300, 225, 100, 30);
		this.add(label_6);
		
		JLabel label_7 = new JLabel("\u5355\u4F4D");
		label_7.setBounds(20, 275, 100, 30);
		this.add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(100, 275, 150, 30);
		this.add(textField_7);
		
		JLabel label_8 = new JLabel("\u7535\u8BDD");
		label_8.setBounds(300, 275, 100, 30);
		this.add(label_8);
		
		JLabel label_9 = new JLabel("\u624B\u673A\u53F7");
		label_9.setBounds(550, 275, 100, 30);
		this.add(label_9);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(610, 275, 150, 30);
		this.add(textField_9);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(375, 275, 150, 30);
		this.add(textField_8);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(375, 225, 150, 30);
		this.add(textField_6);
		
		JLabel lblNewLabel_2 = new JLabel("\u6258\u8FD0\u8D27\u7269\u4FE1\u606F\uFF1A");
		lblNewLabel_2.setBounds(5, 350, 100, 30);
		this.add(lblNewLabel_2);
		
		JLabel label_10 = new JLabel("\u539F\u4EF6\u6570");
		label_10.setBounds(20, 395, 100, 30);
		this.add(label_10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(100, 395, 70, 30);
		this.add(textField_10);
		
		JLabel label_11 = new JLabel("\u5B9E\u9645\u91CD\u91CF");
		label_11.setBounds(224, 395, 100, 30);
		this.add(label_11);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(300, 395, 70, 30);
		this.add(textField_11);
		
		JLabel label_12 = new JLabel("\u4F53\u79EF");
		label_12.setBounds(425, 395, 100, 30);
		this.add(label_12);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(497, 395, 70, 30);
		this.add(textField_12);
		
		JLabel label_13 = new JLabel("\u5185\u4EF6\u54C1\u540D");
		label_13.setBounds(612, 395, 100, 30);
		this.add(label_13);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(684, 395, 150, 30);
		this.add(textField_13);
		
		JLabel label_14 = new JLabel("\u5FEB\u9012\u79CD\u7C7B\uFF1A");
		label_14.setBounds(5, 460, 100, 30);
		this.add(label_14);
		
		JRadioButton radioButton = new JRadioButton("\u7ECF\u6D4E\u5FEB\u9012");
		radioButton.setBounds(100, 460, 100, 30);
		this.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u6807\u51C6\u5FEB\u9012");
		radioButton_1.setBounds(270, 460, 100, 30);
		this.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u7279\u5FEB\u5FEB\u9012");
		radioButton_2.setBounds(440, 460, 100, 30);
		this.add(radioButton_2);
		
		JLabel label_15 = new JLabel("\u5305\u88C5\u7C7B\u578B\uFF1A");
		label_15.setBounds(5, 520, 100, 30);
		this.add(label_15);
		
		JRadioButton radioButton_3 = new JRadioButton("\u7EB8\u7BB1");
		radioButton_3.setBounds(100, 520, 100, 30);
		this.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("\u6728\u7BB1");
		radioButton_4.setBounds(270, 520, 100, 30);
		this.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("\u5FEB\u9012\u888B");
		radioButton_5.setBounds(440, 520, 100, 30);
		this.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("\u5176\u5B83");
		radioButton_6.setBounds(610, 520, 100, 30);
		this.add(radioButton_6);
		
		JLabel label_16 = new JLabel("\u8BA2\u5355\u6761\u5F62\u7801");
		label_16.setBounds(5, 586, 100, 30);
		this.add(label_16);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(100, 586, 150, 30);
		this.add(textField_14);
		
		JLabel label_17 = new JLabel("\u8D39\u7528\u5408\u8BA1");
		label_17.setBounds(300, 586, 100, 30);
		this.add(label_17);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(375, 586, 100, 30);
		this.add(textField_15);
		
		JButton button_confirm=new JButton("确定");
		button_confirm.setBounds(250, 620, 60, 30);
		this.add(button_confirm);
				
		JButton button_cancel=new JButton("取消");
		button_cancel.setBounds(350, 620, 60, 30);
		this.add(button_cancel);
		
		
	}
}

