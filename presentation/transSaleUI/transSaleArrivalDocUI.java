package express.presentation.transSaleUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import express.presentation.mainUI.MainUIService;

public class transSaleArrivalDocUI extends JPanel{
	private JButton button_return;
	private MainUIService m;
	
	public transSaleArrivalDocUI(MainUIService main){
		
		int textlength = 200;
		int textwidth = 40;

		int labellength = 150;
		int labelwidth = 30;

		Font font = new Font("楷体",Font.PLAIN,18);
		Font f = new Font("仿宋",Font.PLAIN,16);
		
        setLayout(null);
		this.m=main;
		
		
//		String year[]={"2013","2014","2015"};
//		String month[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
//		String day[]=new String[32];
//		
//		for (int i=1;i<=30;i++){
//			day[i]=String.valueOf(i);
//		}//这样写日期其实是错的，因为要考虑大月、小月、闰月，我只是先试试，待会还是要用专门的时间选择器
//		
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
//		button_return=new JButton("到达单 退出");
//		button_return.setBounds(100, 100, 150, 50);
//		this.add(button_return);
		
		JComboBox comboBox=new JComboBox();
		JComboBox comboBox1=new JComboBox();
		JComboBox comboBox2=new JComboBox();
		
		comboBox.addItem("110");
		comboBox.addItem("119");
		comboBox.addItem("120");
		comboBox.setBounds(360, 100, textlength, textwidth);
		comboBox.setFont(f);
		this.add(comboBox);
		
		comboBox1.addItem("北京");
		comboBox1.addItem("南京");
		comboBox1.addItem("上海");
		comboBox1.setBounds(360, 100+labelwidth*4, textlength, textwidth);
		comboBox1.setFont(f);
		this.add(comboBox1);
		
		comboBox2.addItem("损坏");
		comboBox2.addItem("完整");
		comboBox2.addItem("丢失");
		comboBox2.setBounds(360, 100+labelwidth*6, textlength, textwidth);
		comboBox2.setFont(f);
		this.add(comboBox2);
		
		
		JTextField textArea = new JTextField("中转单编号");
		textArea.setBounds(360, 100 + labelwidth * 2, textlength, textwidth);
		textArea.setFont(f);
//		textArea.setBackground(Color.BLUE);
//		textArea.setLineWrap(true);
//		textArea.setWrapStyleWord(true);
		//date = textArea.getText();
		this.add(textArea);
		
		JLabel label1 = new JLabel("中转中心编号");
		label1.setBounds(210, 105, labellength, labelwidth);
		label1.setFont(font);
		this.add(label1);
		
		JLabel label2 = new JLabel("中转单编号");
		label2.setBounds(210, 105+labelwidth*2, labellength, labelwidth);
		label2.setFont(font);
		this.add(label2);
		
		JLabel label3 = new JLabel("出发地");
		label3.setBounds(210, 105+labelwidth*4, labellength, labelwidth);
		label3.setFont(font);
		this.add(label3);
		
		JLabel label4 = new JLabel("货物到达状态");
		label4.setBounds(210, 105+labelwidth*6, labellength, labelwidth);
		label4.setFont(font);
		this.add(label4);
		
		
		JButton button_confirm=new JButton("确定");
		 button_confirm.setBounds(250, 490, 110, 40);
		this.add(button_confirm);
				
		JButton button_cancel=new JButton("取消");
		button_cancel.setBounds(400, 490, 110, 40);
		this.add(button_cancel);
		
    }
}






