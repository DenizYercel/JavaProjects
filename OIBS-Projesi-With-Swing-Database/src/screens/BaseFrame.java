package screens;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import daoImplements.TeacherDAOImplements;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BaseFrame extends JFrame {

	int EkranX, EkranY;
	Toolkit kit = Toolkit.getDefaultToolkit();
	Container c;
	JPanel pnlSetButton1, pnlSetButton2;
	TeacherFrame teacherFrame;
	public static int choiseAddORUpdate = 0;
	

	public void emptyTextFields() {

	}

	public void enabledTrueTextFields() {

	}

	public void enabledFalseTextFields() {

	}

	public void buttonAddClick() throws SQLException {

	}

	public void buttonDeleteClick() throws SQLException {

	}

	public void buttonUpdateClick() throws SQLException {

	}

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseFrame window = new BaseFrame();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BaseFrame() {
		setTitle("OIBS");
		this.setResizable(false);
		setSize(994, 700);
		setBounds(100, 100, 800, 700);
		c = this.getContentPane();
		this.getContentPane().setLayout(null);
		EkranX = (int) kit.getScreenSize().width;
		EkranY = (int) kit.getScreenSize().height;
		this.setSize(900, 700);
		setLocation((EkranX - 800) / 2, (EkranY - 700) / 2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(240, 128, 128));
		menuBar.setBounds(10, 11, 101, 22);
		getContentPane().add(menuBar);

		pnlSetButton1 = new JPanel();
		pnlSetButton1.setBackground(new Color(0, 255, 255));
		pnlSetButton1.setBounds(148, 565, 715, 42);
		getContentPane().add(pnlSetButton1);
		pnlSetButton1.setVisible(false);

		pnlSetButton2 = new JPanel();
		pnlSetButton2.setBackground(new Color(0, 255, 255));
		pnlSetButton2.setBounds(0, 618, 845, 42);
		getContentPane().add(pnlSetButton2);
		pnlSetButton2.setVisible(false);

		JButton btnAdd = new JButton("ADD");
		btnAdd.setBackground(new Color(124, 252, 0));
		btnAdd.setBounds(225, 0, 120, 43);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choiseAddORUpdate = 1;
				enabledTrueTextFields();
				pnlSetButton1.setVisible(true);
				pnlSetButton2.setVisible(false);
				emptyTextFields();

			}
		});
		pnlSetButton2.setLayout(null);
		pnlSetButton2.add(btnAdd);

		JButton btnReplace = new JButton("UPDATE");
		btnReplace.setBackground(new Color(255, 255, 0));
		btnReplace.setBounds(343, 0, 120, 43);
		btnReplace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choiseAddORUpdate = 2;
				enabledTrueTextFields();
				pnlSetButton1.setVisible(true);
				pnlSetButton2.setVisible(false);

				try {
					buttonUpdateClick();

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		pnlSetButton2.add(btnReplace);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(new Color(220, 20, 60));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choise = JOptionPane.showOptionDialog(null, "Silmek istediginizden emin misin?", "Message",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (choise == JOptionPane.YES_OPTION) {
					try {
						buttonDeleteClick();
						enabledFalseTextFields();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				emptyTextFields();
			}
		});
		btnDelete.setBounds(460, 0, 120, 43);
		pnlSetButton2.add(btnDelete);

		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(239, 11, 72, 26);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (choiseAddORUpdate == 1) {
						buttonAddClick();

					} else if (choiseAddORUpdate == 2) {
						buttonUpdateClick();

					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		pnlSetButton1.setLayout(null);
		pnlSetButton1.add(btnSave);

		JButton btnIptal = new JButton("CANCEL");
		btnIptal.setBounds(316, 11, 87, 26);
		btnIptal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choise = JOptionPane.showOptionDialog(null,
						"Degisiklikleri kaydetmeden cikmak istediginizden emin misiniz?", "Message",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (choise == JOptionPane.YES_OPTION) {
					pnlSetButton1.setVisible(false);
					pnlSetButton2.setVisible(true);
					enabledFalseTextFields();
				} else {
					pnlSetButton1.setVisible(true);
					pnlSetButton2.setVisible(false);
				}
				emptyTextFields();

			}
		});
		pnlSetButton1.add(btnIptal);

		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(255, 105, 180));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(579, 0, 120, 43);
		pnlSetButton2.add(btnExit);

		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);

		JMenuItem menuTeacher = new JMenuItem("TEACHER");
		menuTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (teacherFrame == null)
					teacherFrame = new TeacherFrame();
				setVisible(false);
			}
		});

		JMenuItem menuHome = new JMenuItem("HOME");
		mnNewMenu.add(menuHome);
		mnNewMenu.add(menuTeacher);

		JMenuItem menuExit = new JMenuItem("EXIT");
		menuExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(menuExit);

	}
}
