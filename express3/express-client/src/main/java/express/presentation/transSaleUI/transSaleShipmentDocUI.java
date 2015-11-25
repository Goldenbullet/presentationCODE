package express.presentation.transSaleUI;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import express.presentation.mainUI.MainUIService;

public class transSaleShipmentDocUI extends JPanel{
	private JButton button_return;
	private MainUIService m;
	
	private String transcenterNumber;
	private String arrival;
	private String vin;
	private String checkMan;
	private String transMan;
	private String shipmentID;
//	private ArrayList<String> orderID;
	private String money;
	
	public transSaleShipmentDocUI(MainUIService main){
		
		int textlength = 150;
		int textwidth = 30;

		int labellength = 100;
		int labelwidth = 30;
		
		
		
        setLayout(null);
		this.m=main;
		
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		
		JTextArea textArea1 = new JTextArea("本中转中心汽运编号");
		textArea1.setBounds(300, 100, textlength, textwidth);
		textArea1.setBackground(Color.BLUE);
		// textAreaOutput.setSelectedTextColor(Color.RED);
		textArea1.setLineWrap(true); // 激活自动换行功能
		textArea1.setWrapStyleWord(true);// 激活断行不断字功能
		transcenterNumber = textArea1.getText();
		this.add(textArea1);

		JTextArea textArea2 = new JTextArea("到达地");
		textArea2.setBounds(300, 100 + textwidth * 2, textlength, textwidth);
		textArea2.setBackground(Color.BLUE);
		textArea2.setLineWrap(true);
		textArea2.setWrapStyleWord(true);
		arrival = textArea2.getText();
		this.add(textArea2);

		JTextArea textArea3 = new JTextArea("车辆代号");
		textArea3.setBounds(300, 100 + textwidth * 4, textlength, textwidth);
		textArea3.setBackground(Color.BLUE);
		textArea3.setLineWrap(true);
		textArea3.setWrapStyleWord(true);
		vin = textArea3.getText();
		this.add(textArea3);

		JTextArea textArea4 = new JTextArea("监装员");
		textArea4.setBounds(300, 100 + textwidth * 6, textlength, textwidth);
		textArea4.setBackground(Color.BLUE);
		textArea4.setLineWrap(true);
		textArea4.setWrapStyleWord(true);
		checkMan = textArea4.getText();
		this.add(textArea4);

		JTextArea textArea5 = new JTextArea("押运员");
		textArea5.setBounds(300, 100 + textwidth * 8, textlength, textwidth);
		textArea5.setBackground(Color.BLUE);
		textArea5.setLineWrap(true);
		textArea5.setWrapStyleWord(true);
		transMan = textArea5.getText();
		this.add(textArea5);

		JTextArea textArea6 = new JTextArea("本次装箱所有订单条形号码");
		textArea6.setBounds(300, 100 + textwidth * 10, textlength, textwidth);
		textArea6.setBackground(Color.BLUE);
		textArea6.setLineWrap(true);
		textArea6.setWrapStyleWord(true);
		shipmentID = textArea6.getText();
		this.add(textArea6);

		JTextArea textArea7 = new JTextArea("运费");
		textArea7.setBounds(300, 100 + textwidth * 12, textlength, textwidth);
		textArea7.setBackground(Color.BLUE);
		textArea7.setLineWrap(true);
		textArea7.setWrapStyleWord(true);
		money = textArea7.getText();
		// System.out.println(position);
		this.add(textArea7);
		
		

		JLabel label1 = new JLabel("本中转中心汽运编号");
		label1.setBounds(200-50, 100, labellength+50, labelwidth);
		this.add(label1);

		JLabel label2 = new JLabel("到达地");
		label2.setBounds(200, 100 + labelwidth * 2, labellength, labelwidth);
		this.add(label2);

		JLabel label3 = new JLabel("车辆代号");
		label3.setBounds(200, 100 + labelwidth * 4, labellength, labelwidth);
		this.add(label3);

		JLabel label4 = new JLabel("监装员");
		label4.setBounds(200, 100 + labelwidth * 6, labellength, labelwidth);
		this.add(label4);

		JLabel label5 = new JLabel("押运员");
		label5.setBounds(200, 100 + labelwidth * 8, labellength, labelwidth);
		this.add(label5);

		JLabel label6 = new JLabel("本次装箱所有订单条形号码");
		label6.setBounds(200-70, 100 + labelwidth * 10, labellength+100, labelwidth);
		this.add(label6);

		JLabel label7 = new JLabel("运费");
		label7.setBounds(200, 100 + labelwidth * 12, labellength, labelwidth);
		this.add(label7);
		
		
		JButton button_confirm=new JButton("确定");
		button_confirm.setBounds(250, 520, 60, 30);
		this.add(button_confirm);
				
		JButton button_cancel=new JButton("取消");
		button_cancel.setBounds(350, 520, 60, 30);
		this.add(button_cancel);
//		button_return=new JButton("装车单 退出");
//		button_return.setBounds(100, 100, 150, 50);
//		this.add(button_return);
    }

}
