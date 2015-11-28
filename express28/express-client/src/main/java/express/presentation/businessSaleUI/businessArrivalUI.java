package express.presentation.businessSaleUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import express.presentation.mainUI.MainUIService;

public class businessArrivalUI extends JPanel{
	private MainUIService m;
	
	private JTextField textArea1;
    private JTextField textArea3;
    private JButton button_confirm;
    private JButton button_cancel;
	
	public businessArrivalUI(MainUIService main){
		int textlength = 150;
		int textwidth = 30;

		int labellength = 100;
		int labelwidth = 30;  
		Font font = new Font("楷体", Font.PLAIN, 18);
		Font f = new Font("仿宋", Font.PLAIN, 16);

		setLayout(null);
		this.m = main;
		
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		JListener listener=new JListener();
		textArea1 = new JTextField("年、月、日");
		textArea1.setBounds(300, 100, textlength, textwidth);
		textArea1.setFont(f);
//		textArea1.setBackground(Color.BLUE);
		// textAreaOutput.setSelectedTextColor(Color.RED);
//		textArea1.setLineWrap(true); // 激活自动换行功能
//		textArea1.setWrapStyleWord(true);// 激活断行不断字功能		
		this.add(textArea1);
		

		JComboBox comboBox=new JComboBox();
		comboBox.addItem("110");
		comboBox.addItem("119");
		comboBox.addItem("120");
		comboBox.setBounds(300, 100+textwidth*2, textlength, textwidth);
		comboBox.setFont(f);
		this.add(comboBox);
		
		textArea3 = new JTextField("中转单编号");
		textArea3.setBounds(300, 100 + textwidth * 4, textlength, textwidth);
		textArea3.setFont(f);
//		textArea2.setBackground(Color.BLUE);
//		textArea2.setLineWrap(true);
//		textArea2.setWrapStyleWord(true);	
		this.add(textArea3);

		
		JComboBox comboBox1=new JComboBox();
		comboBox1.addItem("南京");
		comboBox1.addItem("北京");
		comboBox1.addItem("上海");
		comboBox1.setBounds(300, 100+textwidth*6, textlength, textwidth);
		comboBox1.setFont(f);
		this.add(comboBox1);
		
		
		
		JLabel label1 = new JLabel("到达日期");
		label1.setBounds(200, 100, labellength, labelwidth);
		label1.setFont(font);
		this.add(label1);
		
		JLabel label2 = new JLabel("中转中心编号");
		label2.setBounds(200-30, 100 + labelwidth * 2, labellength+30, labelwidth);
		label2.setFont(font);
		this.add(label2);
		
		JLabel label3 = new JLabel("中转单编号");
		label3.setBounds(200, 100 + labelwidth * 4, labellength, labelwidth);
		label3.setFont(font);
		this.add(label3);
		
		JLabel label4 = new JLabel("出发地");
		label4.setBounds(200, 100 + labelwidth * 6, labellength+30, labelwidth);
		label4.setFont(font);
		this.add(label4);
		
		JLabel label5 = new JLabel("货物到达状态");
		label5.setBounds(200-30, 100 + labelwidth * 8, labellength+30, labelwidth);
		label5.setFont(font);
		this.add(label5);
		
		
		ButtonGroup bg1 = new ButtonGroup();
		
		JRadioButton radioButton = new JRadioButton("损坏");
		radioButton.setBounds(300, 100 + labelwidth * 8, 100, 30);
		radioButton.setFont(font);
		bg1.add(radioButton);
		this.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("完整");
		radioButton_1.setBounds(300, 100 + labelwidth * 9, 100, 30);
		radioButton_1.setFont(font);
		bg1.add(radioButton_1);
		this.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("丢失");
		radioButton_2.setBounds(300, 100 + labelwidth * 10, 100, 30);
		radioButton_2.setFont(font);
		bg1.add(radioButton_2);
		this.add(radioButton_2);
		
		
		button_confirm=new JButton("确定");
		button_confirm.setBounds(250, 520, 60, 30);
		button_confirm.addMouseListener(listener);
		this.add(button_confirm);
				
		button_cancel=new JButton("取消");
		button_cancel.setBounds(350, 520, 60, 30);
		button_cancel.addMouseListener(listener);
		this.add(button_cancel);
		

		
	}
	private class JListener implements MouseListener{

		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
