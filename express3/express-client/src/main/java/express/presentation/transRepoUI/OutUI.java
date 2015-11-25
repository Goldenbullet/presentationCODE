package express.presentation.transRepoUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import express.presentation.mainUI.MainUIService;

public class OutUI extends JPanel{
	
//	private JButton button_out;
//	private JButton button_return;
	
	private JButton button_cancel;
	private JButton button_confirm;
	
    private MainUIService m;
	
	public OutUI(MainUIService main){
       
		 int textlength=150;
	        int textwidth=30;
	        
	        int labellength=100;
	        int labelwidth=30;
	        
	        String number,date,arrival,district,row,shelf,position;
	        
	        
		
		setLayout(null); 
        this.m=main;
        
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);
		
		
		JTextArea textArea1 = new JTextArea("快递编号");
		textArea1.setBounds(300, 100, textlength, textwidth);
		textArea1.setBackground(Color.BLUE);
		// textAreaOutput.setSelectedTextColor(Color.RED);
		textArea1.setLineWrap(true); // 激活自动换行功能
		textArea1.setWrapStyleWord(true);// 激活断行不断字功能
		number = textArea1.getText();
		this.add(textArea1);

		JTextArea textArea2 = new JTextArea("出库日期");
		textArea2.setBounds(300, 100 + textwidth * 2, textlength, textwidth);
		textArea2.setBackground(Color.BLUE);
		textArea2.setLineWrap(true);
		textArea2.setWrapStyleWord(true);
		date = textArea2.getText();
		this.add(textArea2);

		JTextArea textArea3 = new JTextArea("目的地");
		textArea3.setBounds(300, 100 + textwidth * 4, textlength, textwidth);
		textArea3.setBackground(Color.BLUE);
		textArea3.setLineWrap(true);
		textArea3.setWrapStyleWord(true);
		arrival = textArea3.getText();
		this.add(textArea3);

		JTextArea textArea4 = new JTextArea("装运形式");
		textArea4.setBounds(300, 100 + textwidth * 6, textlength, textwidth);
		textArea4.setBackground(Color.BLUE);
		textArea4.setLineWrap(true);
		textArea4.setWrapStyleWord(true);
		district = textArea4.getText();
		this.add(textArea4);

		JTextArea textArea5 = new JTextArea("中转单编号");
		textArea5.setBounds(300, 100 + textwidth * 8, textlength, textwidth);
		textArea5.setBackground(Color.BLUE);
		textArea5.setLineWrap(true);
		textArea5.setWrapStyleWord(true);
		row = textArea5.getText();
		this.add(textArea5);
		
		
		JLabel label1 = new JLabel("快递编号");
		label1.setBounds(200, 100, labellength, labelwidth);
		this.add(label1);

		JLabel label2 = new JLabel("出库日期");
		label2.setBounds(200, 100 + labelwidth * 2, labellength, labelwidth);
		this.add(label2);

		JLabel label3 = new JLabel("目的地");
		label3.setBounds(200, 100 + labelwidth * 4, labellength, labelwidth);
		this.add(label3);

		JLabel label4 = new JLabel("装运形式");
		label4.setBounds(200, 100 + labelwidth * 6, labellength, labelwidth);
		this.add(label4);

		JLabel label5 = new JLabel("中转单编号");
		label5.setBounds(200, 100 + labelwidth * 8, labellength, labelwidth);
		this.add(label5);
		
		
		button_confirm=new JButton("确定");
		button_confirm.setBounds(250, 520, 60, 30);
		this.add(button_confirm);
				
		button_cancel=new JButton("取消");
		button_cancel.setBounds(350, 520, 60, 30);
		this.add(button_cancel);
		
		JListener listener=new JListener();
		
		
//	    button_out=new JButton("在你点击出库之后");
//        button_out.setBounds(100, 100, 150, 50);
//        button_out.addMouseListener(listener);
//                
//        button_return=new JButton("返回");
//	    button_return.setBounds(100, 200, 150, 50);
//	    button_return.addMouseListener(listener);
//        
//	    
//		this.add( button_out);
//		this.add(button_return);
		
	}
	class JListener implements MouseListener{

		public void mouseClicked(MouseEvent e) {
//			 if (e.getSource()== button_out){
//				 System.out.println("你点击了“点击出库之后”");
//				 
//			 }
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
