package express.presentation.managerUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import express.businessLogic.infoManageBL.StaffForManager;
import express.businesslogicService.managerBLService.StaffManageBLService;
import express.po.UserRole;
import express.presentation.mainUI.MainUIService;
import express.presentation.mainUI.MyTableModel;
import express.vo.UserInfoVO;

public class managerMemberUI extends JPanel {

	private MainUIService m;
	private JTable table;
	private MyTableModel tableModel;
	private TableColumnModel tcm;
	private JButton detele, add, change;
	private JTextField idtf;
	private JComboBox positioncb, gendercb, citycb;
	private StaffManageBLService smb;
	private UserInfoVO userinfo;
	private UserInfoVO vo;
	private ArrayList<UserInfoVO> userarr;
	private String changeunder = "<HTML><U>修改</U></HTML>";
	private String confirmunder = "<HTML><U>确认</U></HTML>";
	private String id;
	private Object[][] data;
	private String[] header = { "选择", "姓名", "性别", "工号", "职位", "所在单位", "联系方式",
			"入职日期", "修改" };

	public managerMemberUI(MainUIService main) {
		setLayout(null);
		m = main;
		this.setBounds(0, 0, 850, 700);
		this.setBackground(Color.WHITE);

		Font font = new Font("楷体", Font.PLAIN, 18);
		Font f = new Font("仿宋", Font.PLAIN, 16);
		smb = new StaffForManager();
		JListener listener = new JListener();

		String[] pos = { "快递员", "管理员", "总经理", "普通财务人员", "最高权限财务人员",
				"中转中心仓库管理人员", "中转中心业务员", "营业厅业务员" };
		String[] genders = { "男", "女" };
		String[] cities = { "南京", "北京", "上海" };
		Class[] typeArray = { Boolean.class, Object.class, JComboBox.class,
				Object.class, JComboBox.class, JComboBox.class, Object.class,
				 Object.class, Object.class };


		
		 Object[] user1 = { true, "lhl", "man", "10001", "110", "1", "2", " 3",
		 changeunder };
		 Object[] user2 = { false, "hmt", "woman", "10086", "120", "4", "5",
		 "6", changeunder };
		 Object user[][] = { user1, user2 };
		 data = user;

		tableModel = new MyTableModel(data, header,typeArray);
		table = new JTable(tableModel);
		table.setRowHeight(40);
		table.getTableHeader().setReorderingAllowed(false);
		table.setBounds(50, 60, 750, 600);
		table.setFont(f);
		table.addMouseListener(listener);

		tcm = table.getColumnModel();
		positioncb = new JComboBox(pos);
		gendercb = new JComboBox(genders);
		citycb = new JComboBox(cities);
		tcm.getColumn(4).setCellEditor(new DefaultCellEditor(positioncb));
		tcm.getColumn(2).setCellEditor(new DefaultCellEditor(gendercb));
		tcm.getColumn(5).setCellEditor(new DefaultCellEditor(citycb));
		tcm.getColumn(6).setPreferredWidth(100);//因为联系方式是11位的电话号码，所以拉大点才能放得下
        tcm.getColumn(7).setPreferredWidth(100);//理由同上，日期太长
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(50, 60, 750, 600);
		this.add(scrollPane);

		detele = new JButton("删除");
		detele.setBounds(50, 10, 100, 40);
		detele.setFont(font);
		detele.addMouseListener(listener);
		this.add(detele);

		add = new JButton("添加");
		add.setBounds(190, 10, 100, 40);
		add.addMouseListener(listener);
		add.setFont(font);
		this.add(add);

		change = new JButton("查找");
		change.setBounds(320, 10, 100, 40);
		change.addMouseListener(listener);
		change.setFont(font);
		this.add(change);

		JLabel idl = new JLabel("工号");
		idl.setBounds(450, 10, 50, 40);
		idl.setFont(font);
		this.add(idl);

		idtf = new JTextField();
		idtf.setBounds(510, 10, 150, 40);
		idtf.setFont(f);
		this.add(idtf);
	}

	private class JListener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == detele) {
				// m.jumpTomanagerMenuUI();
				for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
					if ((boolean) tableModel.getValueAt(i, 0)) {
						tableModel.removeRow(i);
						smb.removeUser((String) tableModel.getValueAt(i, 3));
						smb.endManage();
					}
				}
				JOptionPane.showMessageDialog(null, "删除成功", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (e.getSource() == add) {
				managerMemberAddUI mmaui = new managerMemberAddUI(tableModel);
				mmaui.setVisible(true);

			} else if (e.getSource() == change) {
				id = idtf.getText();
				managerMemberChangeUI mmcui = new managerMemberChangeUI(
						tableModel, id);
				mmcui.setVisible(true);

			} else if (e.getSource() == table) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				if (col == 8) {
					if (tableModel.getValueAt(row, col).equals(changeunder)) {
						tableModel.setrowedit(row);
						tableModel.setValueAt(confirmunder, row, col);
					} else if (tableModel.getValueAt(row, col).equals(
							confirmunder)) {
						tableModel.setrowunedit();
						tableModel.setValueAt(changeunder, row, col);

						String name = (String) tableModel.getValueAt(row, 1);
						String gender = (String) tableModel.getValueAt(row, 2);
						String position = (String) tableModel
								.getValueAt(row, 4);
						String id = (String) tableModel.getValueAt(row, 3);
						String city = (String) tableModel.getValueAt(row, 5);
						String phone = (String) tableModel.getValueAt(row, 6);
						String date = (String) tableModel.getValueAt(row, 7);

						//System.out.println(positioncb.getSelectedIndex()+1);
						UserRole posit = UserRole.values()[positioncb.getSelectedIndex()+1];
						boolean sex;
						if (gender.equals("男")) {
							sex = true;
						} else {
							sex = false;
						}

						vo = new UserInfoVO(name, sex, id, phone, posit, city,
								date);
						smb.changeUser(vo, id);
						JOptionPane.showMessageDialog(null, "信息修改成功", "提示",
								JOptionPane.INFORMATION_MESSAGE);
						smb.endManage();
					}
				}
			}
			updateUI();
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
