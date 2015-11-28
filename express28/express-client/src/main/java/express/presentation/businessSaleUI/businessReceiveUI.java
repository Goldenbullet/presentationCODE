package express.presentation.businessSaleUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import express.presentation.mainUI.MainUIService;

public class businessReceiveUI extends JPanel{
	
	private MainUIService m;
	private JTextField textArea1;
    private JTextField textArea2;
    private JTextField textArea3;
    private JTextField textArea4;
    
    private JButton button_confirm;
    private JButton button_cancel;
    
    
	public businessReceiveUI(MainUIService main){
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

		textArea2 = new JTextField("收款金额");
		textArea2.setBounds(300, 100 + textwidth * 2, textlength, textwidth);
		textArea2.setFont(f);
//		textArea2.setBackground(Color.BLUE);
//		textArea2.setLineWrap(true);
//		textArea2.setWrapStyleWord(true);	
		this.add(textArea2);

		textArea3 = new JTextField("收款快递员");
		textArea3.setBounds(300, 100 + textwidth * 4, textlength, textwidth);
		textArea3.setFont(f);
//		textArea3.setBackground(Color.BLUE);
//		textArea3.setLineWrap(true);
//		textArea3.setWrapStyleWord(true);		
		this.add(textArea3);

		textArea4 = new JTextField("订单条形号码");
		textArea4.setBounds(300, 100 + textwidth * 6, textlength, textwidth);
		textArea4.setFont(f);
//		textArea4.setBackground(Color.BLUE);
//		textArea4.setLineWrap(true);
//		textArea4.setWrapStyleWord(true);		
		this.add(textArea4);
		
		
		JLabel label1 = new JLabel("收款日期");
		label1.setBounds(200, 100, labellength, labelwidth);
		label1.setFont(font);
		this.add(label1);

		JLabel label2 = new JLabel("收款金额");
		label2.setBounds(200, 100 + labelwidth * 2, labellength, labelwidth);
		label2.setFont(font);
		this.add(label2);

		JLabel label3 = new JLabel("收款快递员");
		label3.setBounds(200, 100 + labelwidth * 4, labellength, labelwidth);
		label3.setFont(font);
		this.add(label3);

		JLabel label4 = new JLabel("订单条形号码");
		label4.setBounds(200-30, 100 + labelwidth * 6, labellength+30, labelwidth);
		label4.setFont(font);
		this.add(label4);
		
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
