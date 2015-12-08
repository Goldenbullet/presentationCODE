package express.presentation.businessSaleUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import express.businessLogic.IDKeeper;
import express.presentation.mainUI.DateChooser;
import express.presentation.mainUI.MainUIService;

public class businessArrivalUI extends JPanel {
	
	private MainUIService m;

	private JTextField ordertf, startplacetf,datetf, transDocNumtf;
	private JButton button_confirm;
	private JButton button_cancel;
	private ButtonGroup bg1;
	private JRadioButton radioButton, radioButton_1, radioButton_2;
	private DateChooser datechooser;
	private String date,transDocNum, order, startplace;

	public businessArrivalUI(MainUIService main) {
		
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

		JListener listener = new JListener();

		datetf = new JTextField();
		datetf.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		datetf.setBounds(300, 100, textlength, textwidth);
		datetf.setFont(f);
		datetf.setEditable(false);
		this.add(datetf);

		datechooser = new DateChooser("yyyy-MM-dd", datetf);
		datechooser.setBounds(460, 95, 40, 40);
		this.add(datechooser);

		ordertf = new JTextField();
		ordertf.setBounds(300, 100 + textwidth * 2, textlength, textwidth);
		ordertf.setFont(f);
		this.add(ordertf);

		transDocNumtf = new JTextField();
		transDocNumtf.setBounds(300, 100 + textwidth * 4, textlength, textwidth);
		transDocNumtf.setFont(f);
		transDocNumtf.setEditable(false);
		this.add(transDocNumtf);

		startplacetf = new JTextField();
		startplacetf.setBounds(300, 100 + textwidth * 6, textlength, textwidth);
		startplacetf.setFont(f);
		startplacetf.setEditable(false);
		this.add(startplacetf);

		JLabel label1 = new JLabel("到达日期");
		label1.setBounds(200, 100, labellength, labelwidth);
		label1.setFont(font);
		this.add(label1);

		JLabel label2 = new JLabel("订单号");
		label2.setBounds(200, 100 + labelwidth * 2, labellength, labelwidth);
		label2.setFont(font);
		this.add(label2);

		JLabel label3 = new JLabel("中转单编号");
		label3.setBounds(200, 100 + labelwidth * 4, labellength, labelwidth);
		label3.setFont(font);
		this.add(label3);

		JLabel label4 = new JLabel("出发地");
		label4.setBounds(200, 100 + labelwidth * 6, labellength + 30,
				labelwidth);
		label4.setFont(font);
		this.add(label4);

		JLabel label5 = new JLabel("货物到达状态");
		label5.setBounds(200 - 30, 100 + labelwidth * 8, labellength + 30,
				labelwidth);
		label5.setFont(font);
		this.add(label5);

		bg1 = new ButtonGroup();

		radioButton = new JRadioButton("损坏");
		radioButton.setBounds(300, 100 + labelwidth * 8, 100, 30);
		radioButton.setFont(font);
		bg1.add(radioButton);
		this.add(radioButton);

		radioButton_1 = new JRadioButton("完整");
		radioButton_1.setBounds(300, 100 + labelwidth * 9, 100, 30);
		radioButton_1.setFont(font);
		bg1.add(radioButton_1);
		this.add(radioButton_1);

		radioButton_2 = new JRadioButton("丢失");
		radioButton_2.setBounds(300, 100 + labelwidth * 10, 100, 30);
		radioButton_2.setFont(font);
		bg1.add(radioButton_2);
		this.add(radioButton_2);

		button_confirm = new JButton("确定");
		button_confirm.setBounds(250, 520, 60, 30);
		button_confirm.addMouseListener(listener);
		this.add(button_confirm);

		button_cancel = new JButton("取消");
		button_cancel.setBounds(350, 520, 60, 30);
		button_cancel.addMouseListener(listener);
		this.add(button_cancel);
	}

	private class JListener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == button_cancel) {
				ordertf.setText("");
				datetf.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
				bg1.clearSelection();
			} else if (e.getSource() == button_confirm) {
				date = datetf.getText();
				startplace = startplacetf.getText();
				order = ordertf.getText();
				transDocNum = startplacetf.getText();
			}
		}

		public void mouseEntered(MouseEvent e) {
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
