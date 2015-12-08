package express.presentation.managerUI;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import express.presentation.mainUI.MainUIService;

public class managerExamDocUI extends JPanel {

	private JButton exam, exit;
	private MainUIService m;
	private JTable table;
	private MyTableModel tableModel;
	private Object[][] data;
	private String[] header = { "选择", "单据类型", "单据名称" };

	public managerExamDocUI(MainUIService main) {
		setLayout(null);
		m = main;
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);

		exam = new JButton("审批");
		exam.setBounds(100, 100, 100, 50);
		this.add(exam);

		exit = new JButton("exit");
		exit.setBounds(100, 200, 100, 50);
		this.add(exit);

		exit.addMouseListener(new Listener());
	}

	private class MyTableModel extends DefaultTableModel {

		public MyTableModel(Object[][] data, String[] head) {
			super(data, head);
		}

		// 创建类型数组
		Class[] typeArray = { Boolean.class, Object.class, Object.class };

		// 使表格具有可编辑性
		@Override
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			if (columnIndex == 0) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Class getColumnClass(int columnIndex) {
			return typeArray[columnIndex];// 返回每一列的数据类型
		}
	}

	private class Listener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == exit) {
				m.jumpTomanagerMenuUI();
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
