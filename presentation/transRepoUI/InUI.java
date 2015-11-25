package express.presentation.transRepoUI;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import express.presentation.mainUI.MainUIService;

public class InUI extends JPanel{
	

//	private JButton button_afterin;
//	private JButton button_return;
	private JButton button_confirm;
	private JButton button_cancel;
    private MainUIService m;
    private String number,date,arrival,district,row,shelf,position;
	
	public InUI(MainUIService main){
		
        int textlength=150;
        int textwidth=30;
        
        int labellength=100;
        int labelwidth=30;  
        
        Font font = new Font("楷体",Font.PLAIN,18);
		Font f = new Font("仿宋",Font.PLAIN,16);
		
		setLayout(null);
		this.m=main;
		
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		// 快递编号……
		JTextField textArea1 = new JTextField("快递编号");
		textArea1.setBounds(300, 100, textlength, textwidth);
		textArea1.setFont(f);
//		textArea1.setBackground(Color.BLUE);
		// textAreaOutput.setSelectedTextColor(Color.RED);
//		textArea1.setLineWrap(true); // 激活自动换行功能
//		textArea1.setWrapStyleWord(true);// 激活断行不断字功能
		number = textArea1.getText();
		this.add(textArea1);

		JTextField textArea2 = new JTextField("入库日期");
		textArea2.setBounds(300, 100 + textwidth * 2, textlength, textwidth);
		textArea2.setFont(f);
//		textArea2.setBackground(Color.BLUE);
//		textArea2.setLineWrap(true);
//		textArea2.setWrapStyleWord(true);
		date = textArea2.getText();
		this.add(textArea2);

		JTextField textArea3 = new JTextField("目的地");
		textArea3.setBounds(300, 100 + textwidth * 4, textlength, textwidth);
		textArea3.setFont(f);
//		textArea3.setBackground(Color.BLUE);
//		textArea3.setLineWrap(true);
//		textArea3.setWrapStyleWord(true);
		arrival = textArea3.getText();
		this.add(textArea3);

		JTextField textArea4 = new JTextField("区号");
		textArea4.setBounds(300, 100 + textwidth * 6, textlength, textwidth);
		textArea4.setFont(f);
//		textArea4.setBackground(Color.BLUE);
//		textArea4.setLineWrap(true);
//		textArea4.setWrapStyleWord(true);
		district = textArea4.getText();
		this.add(textArea4);

		JTextField textArea5 = new JTextField("排号");
		textArea5.setBounds(300, 100 + textwidth * 8, textlength, textwidth);
		textArea5.setFont(f);
//		textArea5.setBackground(Color.BLUE);
//		textArea5.setLineWrap(true);
//		textArea5.setWrapStyleWord(true);
		row = textArea5.getText();
		this.add(textArea5);

		JTextField textArea6 = new JTextField("架号");
		textArea6.setBounds(300, 100 + textwidth * 10, textlength, textwidth);
		textArea6.setFont(f);
//		textArea6.setBackground(Color.BLUE);
//		textArea6.setLineWrap(true);
//		textArea6.setWrapStyleWord(true);
		shelf = textArea6.getText();
		this.add(textArea6);

		JTextField textArea7 = new JTextField("位号");
		textArea7.setBounds(300, 100 + textwidth * 12, textlength, textwidth);
		textArea7.setFont(f);
//		textArea7.setBackground(Color.BLUE);
//		textArea7.setLineWrap(true);
//		textArea7.setWrapStyleWord(true);
		position = textArea7.getText();
		// System.out.println(position);
		this.add(textArea7);

		JLabel label1 = new JLabel("快递编号");
		label1.setBounds(200, 100, labellength, labelwidth);
		label1.setFont(font);
		this.add(label1);

		JLabel label2 = new JLabel("入库日期");
		label2.setBounds(200, 100 + labelwidth * 2, labellength, labelwidth);
		label2.setFont(font);
		this.add(label2);

		JLabel label3 = new JLabel("目的地");
		label3.setBounds(200, 100 + labelwidth * 4, labellength, labelwidth);
		label3.setFont(font);
		this.add(label3);

		JLabel label4 = new JLabel("区号");
		label4.setBounds(200, 100 + labelwidth * 6, labellength, labelwidth);
		label4.setFont(font);
		this.add(label4);

		JLabel label5 = new JLabel("排号");
		label5.setBounds(200, 100 + labelwidth * 8, labellength, labelwidth);
		label5.setFont(font);
		this.add(label5);

		JLabel label6 = new JLabel("架号");
		label6.setBounds(200, 100 + labelwidth * 10, labellength, labelwidth);
		label6.setFont(font);
		this.add(label6);

		JLabel label7 = new JLabel("位号");
		label7.setBounds(200, 100 + labelwidth * 12, labellength, labelwidth);
		label7.setFont(font);
		this.add(label7);

		JListener listener=new JListener();
		
		
		button_confirm=new JButton("确定");
		button_confirm.setBounds(250, 520, 60, 30);
		this.add(button_confirm);
				
		button_cancel=new JButton("取消");
		button_cancel.setBounds(350, 520, 60, 30);
		this.add(button_cancel);
		
		
//	    button_afterin=new JButton("点击入库之后");
//        button_afterin.setBounds(100, 100, 150, 50);
//        button_afterin.addMouseListener(listener);
//		
//		button_return=new JButton("返回");
//	    button_return.setBounds(100, 200, 150, 50);
//	    button_return.addMouseListener(listener);
//        
//	    this.add( button_afterin);
//	    this.add( button_return);
		
	}
	
	class JListener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
//			 if (e.getSource()==button_afterin){
//				 System.out.println("你点击了“点击入库之后”");
//				 
//			 }
//			 
//			 else if (e.getSource()==button_return){
//				 System.out.println("应该回到了repo界面");
//			 }
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
