package express.presentation.deliverUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import express.businessLogic.receiveInfoBL.ReceiveInfo;
import express.businesslogicService.delivermanBLService.ReceiveInfoBLService;
import express.presentation.mainUI.DateChooser;
import express.presentation.mainUI.MainUIService;
import express.vo.ReceiveInfoVO;

public class deliverReceiveUI extends JPanel {
	private JButton button_return, button_cancel;
	private JTextField textArea1, textArea2, textArea3;
	private DateChooser datechooser;
	private MainUIService m;
	private String receiverName,receiveTime,OrderID;
	private boolean complete = true;

	public deliverReceiveUI(MainUIService main) {

		int textlength = 200;
		int textwidth = 40;

		int labellength = 100;
		int labelwidth = 40;

		setLayout(null);
		this.m = main;

		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);

		Font font = new Font("楷体", Font.PLAIN, 18);
		Font f = new Font("仿宋", Font.PLAIN, 14);

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

		textArea1 = new JTextField();
		textArea1.setBounds(300, 100, textlength, textwidth);
		textArea1.setFont(f);
		this.add(textArea1);

		textArea2 = new JTextField(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		textArea2.setBounds(300, 100 + textwidth * 2, textlength, textwidth);
		textArea2.setFont(f);
		textArea2.setEditable(false);
		this.add(textArea2);

		datechooser = new DateChooser("yyyy-MM-dd", textArea2);
		datechooser.setBounds(510, 100 + textwidth * 2, 40, 40);
		this.add(datechooser);
		
		textArea3 = new JTextField();
		textArea3.setBounds(300, 100 + textwidth * 4, textlength, textwidth);
		textArea3.setFont(f);
		this.add(textArea3);

		Listener lis = new Listener();

		button_return = new JButton("确认");
		button_return.setBounds(220, 520, 100, 30);
		button_return.setFont(font);
		button_return.addMouseListener(lis);
		this.add(button_return);

		button_cancel = new JButton("取消");
		button_cancel.setBounds(350, 520, 100, 30);
		button_cancel.setFont(font);
		button_cancel.addMouseListener(lis);
		this.add(button_cancel);

	}

	private class Listener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == button_cancel) {
				textArea1.setText("");
				textArea2.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
				textArea3.setText("");
			} else if (e.getSource() == button_return) {
				receiverName = textArea1.getText();
				if (receiverName.isEmpty()) {
					complete = false;
					textArea1.setBorder(new LineBorder(
							new Color(200, 80, 80)));
				}
				
				receiveTime = textArea2.getText();
				if (receiveTime.isEmpty()) {
					complete = false;
					textArea2.setBorder(new LineBorder(
							new Color(200, 80, 80)));
				}
				
				OrderID = textArea3.getText();
				if (OrderID.isEmpty()) {
					complete = false;
					textArea3.setBorder(new LineBorder(
							new Color(200, 80, 80)));
				}
				
				if (complete) {
					ReceiveInfoVO vo = new ReceiveInfoVO(receiverName, receiveTime, OrderID);
					ReceiveInfoBLService rbs = new ReceiveInfo();
					if(rbs.addReceiveInfo(vo)){
						JOptionPane.showMessageDialog(null, "生成收件信息成功", "提示",
								JOptionPane.INFORMATION_MESSAGE);
						rbs.endReceiveInfo();
					}else{
						JOptionPane.showMessageDialog(null, "订单号错误", "提示",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			repaint();
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

}
