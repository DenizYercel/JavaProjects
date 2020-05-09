package screens;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import connection.DbConnection;
import daoImplements.TeacherDAOImplements;
import data.Teacher;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DropMode;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class TeacherFrame extends BaseFrame {

	private TeacherDAOImplements teacherDAOImplements = new TeacherDAOImplements();
	DefaultTableModel myModel = new DefaultTableModel();
	Object[] columns = { "ID", "AD", "SOYAD", "BOLUM", "SICIL NO", "BASLAMA TARIHI", "UNVAN" };
	Object[] rows = new Object[7];
	private HashMap<Integer, Integer> hm_TeacherId;
	DbConnection con = new DbConnection();
	private static JTextField txtAd;
	private static JTextField txtSoyad;
	private static JTextField txtSicil_no;
	private static JTextField txtBaslama;
	public static JComboBox comboBoxBolum;
	public static JComboBox comboBoxUNVAN;
	private JTable tableTeacher;
	private ResultSet mySet;
	private Integer sicil_No;
	public static HashMap<Integer, String> bolumMap;
	public static HashMap<Integer, String> bolumMap2;
	int sayac = 0;
	private JTextField txtSearch;
	int searchClickCount = 0;

	@Override
	public void emptyTextFields() {
		txtAd.setText("");
		txtSoyad.setText("");
		txtSicil_no.setText("");
		txtBaslama.setText("");
		// txtBolum_id.setText("");
		// txtUnvan.setText("");
	}

	@Override
	public void enabledTrueTextFields() {
		txtAd.setEnabled(true);
		txtSoyad.setEnabled(true);
		txtSicil_no.setEnabled(true);
		txtBaslama.setEnabled(true);
		// txtBolum_id.setEnabled(true);
		// txtUnvan.setEnabled(true);
	}

	@Override
	public void enabledFalseTextFields() {
		txtAd.setEnabled(false);
		txtSoyad.setEnabled(false);
		txtSicil_no.setEnabled(false);
		txtBaslama.setEnabled(false);
		// txtBolum_id.setEnabled(false);
		// txtUnvan.setEnabled(false);

	}

	@Override
	public void buttonAddClick() throws SQLException {
		System.out.println("add");
		try {
			if (!txtSoyad.getText().equals("") && !txtSicil_no.getText().equals("") && !txtBaslama.getText().equals("")
					&& !comboBoxBolum.getSelectedItem().equals("")) {
				System.out.println("asdsad");
				Teacher teacher = new Teacher(txtAd.getText(), txtSoyad.getText(), comboBoxBolum.getSelectedIndex() + 1,
						Integer.parseInt(txtSicil_no.getText()), Integer.parseInt(txtBaslama.getText()),
						comboBoxUNVAN.getSelectedItem().toString());

				if (!txtAd.getText().equals("")) {
					teacher.setAd(txtAd.getText());
				}

				/*
				 * if (!txtUnvan.getText().equals("")) {
				 * teacher.setUnvan((txtUnvan.getText().toString())); }
				 */

				int status = teacherDAOImplements.add(teacher);
				JOptionPane.showMessageDialog(null, "Kaydetme basarili..");
				System.out.println("status=" + status);

				if (status == 1) {
					JOptionPane.showMessageDialog(null, "Kayit basarili.");
					pnlSetButton1.setVisible(false);
					pnlSetButton2.setVisible(true);
					emptyTextFields();
					initialize();
				} else if (status == 0) {
					JOptionPane.showMessageDialog(null, "Bosluklari doldurunuz", "Uyarý", 2);
					pnlSetButton1.setVisible(true);
					pnlSetButton2.setVisible(false);
				}/* else if (status == 2) {
					JOptionPane.showMessageDialog(null, "Email can't be the same.Please write different Email",
							"Warning", 2);
					pnlSetButton1.setVisible(true);
					pnlSetButton2.setVisible(false);
				}*/ else if (status == 3) {
					JOptionPane.showMessageDialog(null, "Kayit basarisiz", "Uyarý", 2);
					pnlSetButton1.setVisible(true);
					pnlSetButton2.setVisible(false);
				} else if (status == 4) {
					JOptionPane.showMessageDialog(null, "Alanlar eslesmedi", "Uyarý", 2);
					pnlSetButton1.setVisible(true);
					pnlSetButton2.setVisible(false);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Bosluklari doldurunuz.", "Uyarý", 2);
				pnlSetButton1.setVisible(true);
				pnlSetButton2.setVisible(false);
			}
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Sayi giriniz", "Uyarý", 2);
		} catch (Exception e) {
			/*
			 * JOptionPane.showMessageDialog(null,
			 * "Date wrong format.(Sample format: dd/mm/yyyy or ddmmyyyy or dd.mm.yyyy)",
			 * "Warning", 2);
			 */
			System.out.println(e.getMessage());

		}

	}

	@Override
	public void buttonDeleteClick() throws SQLException {
		System.out.println(sicil_No);
		try {
			if (txtSicil_no.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Silmek icin tablodan secim yapin!");
			} else {
				if (hm_TeacherId.containsKey(sicil_No)) {
					System.out.println("asdsadsadad");

					int id = Integer
							.parseInt(String.valueOf(tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 0)));
					int status = teacherDAOImplements.delete(id);
					JOptionPane.showMessageDialog(null, "Deleted.");
					if (status == 1) {
						emptyTextFields();
						JOptionPane.showMessageDialog(null, "Deleted.");
						hm_TeacherId.remove(txtSicil_no.getText());
						initialize();
					} else if (status == 0) {
						JOptionPane.showMessageDialog(null, "Hata.", "Uyarý", 2);
					}
				}
				System.out.println("delete");
			}
		} catch (Exception e) {
			System.out.println("Bolum bos..");
		}

	}

	@Override
	public void buttonUpdateClick() throws SQLException {
		int id = 0;
		sayac++;
		try {
			if (hm_TeacherId.containsKey(sicil_No)) {

				Teacher teacher = new Teacher(txtAd.getText(), txtSoyad.getText(), comboBoxBolum.getSelectedIndex() + 1,
						Integer.parseInt(txtSicil_no.getText()), Integer.parseInt(txtBaslama.getText()),
						comboBoxUNVAN.getSelectedItem().toString());

				if (!txtAd.getText().equals("")) {
					teacher.setAd(txtAd.getText());
				}

				if (teacher.getSicil_no() > 0) {

					id = Integer.parseInt(String.valueOf(tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 0)));
					int status = teacherDAOImplements.update(teacher, id);
					if (sayac >= 2) {
						JOptionPane.showMessageDialog(null, "Güncellendi.");

					}

				} else {
					JOptionPane.showMessageDialog(null, "Alanlar bos birakilamaz!");
				}

				/*
				 * if (status>0) { JOptionPane.showMessageDialog(null, "Updated.");
				 * pnlSetButton1.setVisible(false); pnlSetButton2.setVisible(true);
				 * emptyTextFields(); initialize(); } else if (status == 0) {
				 * JOptionPane.showMessageDialog(null, "Alanlar bos birakilamaz!", "Warning",
				 * 2); pnlSetButton1.setVisible(true); pnlSetButton2.setVisible(false); }
				 */
				/*
				 * else if (status == 2) { JOptionPane.showMessageDialog(null,
				 * "Mismatched field.Enter the defined job, department or manager.", "Warning",
				 * 2); pnlSetButton1.setVisible(true); pnlSetButton2.setVisible(false); } else
				 * if (status == 3) { JOptionPane.showMessageDialog(null,
				 * "Unknown error.Save failed.", "Warning", 2); pnlSetButton1.setVisible(true);
				 * pnlSetButton2.setVisible(false); }
				 */
			}

		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "hata", "uyari", 2);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	public int buttonSearch() throws SQLException {
		return searchClickCount;
	}

	public void hepsiniListele() {
		myModel.setColumnIdentifiers(columns);
		TeacherDAOImplements teacherDAO = new TeacherDAOImplements();
		bolumMap = new HashMap();

		try {
			if (buttonSearch() == 0) {
				mySet = teacherDAO.getData();

				DbConnection con = new DbConnection();
				String query = "select id,adi from bolum";
				Statement st = con.getMyConn().createStatement();
				ResultSet rs = st.executeQuery(query);
				while (rs.next()) {
					bolumMap.put(rs.getInt("id"), rs.getString("adi"));

				}
				while (mySet.next()) {

					hm_TeacherId.put(Integer.valueOf((mySet.getString("SICIL_NO"))),
							Integer.valueOf(mySet.getString("ID")));
					System.out.println(mySet.getString("ID"));
					rows[0] = mySet.getInt("ID");
					rows[1] = "" + mySet.getString("AD");
					rows[2] = mySet.getString("SOYAD");
					// rows[3] = mySet.getString("BOLUM_ID");
					for (HashMap.Entry<Integer, String> entry : bolumMap.entrySet()) {
						System.out.println(entry.getKey() + " = " + entry.getValue());
						if (entry.getKey() == Integer.valueOf(mySet.getString("bolum_id"))) {
							rows[3] = "" + entry.getValue();
						}
					}
					rows[4] = "" + mySet.getString("SICIL_NO");
					rows[5] = "" + mySet.getInt("BASLAMA_TARIHI");
					rows[6] = mySet.getString("UNVAN");

					myModel.addRow(rows);

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void showTable() {
		myModel.setColumnIdentifiers(columns);
		TeacherDAOImplements employeesDAO = new TeacherDAOImplements();
		bolumMap = new HashMap();
        int control=0;
		try {
			mySet = employeesDAO.getData();

			DbConnection con = new DbConnection();
			String query = "select id,adi from bolum";
			Statement st = con.getMyConn().createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				bolumMap.put(rs.getInt("id"), rs.getString("adi"));

			}
			if (buttonSearch() == 0) {

				while (mySet.next()) {

					hm_TeacherId.put(Integer.valueOf((mySet.getString("SICIL_NO"))),
							Integer.valueOf(mySet.getString("ID")));
					System.out.println(mySet.getString("ID"));
					rows[0] = mySet.getInt("ID");
					rows[1] = "" + mySet.getString("AD");
					rows[2] = mySet.getString("SOYAD");
					// rows[3] = mySet.getString("BOLUM_ID");
					for (HashMap.Entry<Integer, String> entry : bolumMap.entrySet()) {
						System.out.println(entry.getKey() + " = " + entry.getValue());
						if (entry.getKey() == Integer.valueOf(mySet.getString("bolum_id"))) {
							rows[3] = "" + entry.getValue();
						}
					}
					rows[4] = "" + mySet.getString("SICIL_NO");
					rows[5] = "" + mySet.getInt("BASLAMA_TARIHI");
					rows[6] = mySet.getString("UNVAN");

					myModel.addRow(rows);

				}
				control=1;
			} else {
				myModel = (DefaultTableModel) tableTeacher.getModel();
				while (myModel.getRowCount() > 0) {
					myModel.removeRow(0);
				}
				System.out.println("buttonSearch=" + buttonSearch());
				while (rs.next()) {
					bolumMap.put(rs.getInt("id"), rs.getString("adi"));

				}
				
				while (mySet.next()) {

					if (txtSearch.getText().equals(String.valueOf(mySet.getInt(5)))) {
						System.out.println(mySet.getInt(5));
						hm_TeacherId.put(Integer.valueOf((mySet.getString("SICIL_NO"))),
								Integer.valueOf(mySet.getString("ID")));
						System.out.println(mySet.getString("ID"));
						rows[0] = mySet.getInt("ID");
						rows[1] = "" + mySet.getString("AD");
						rows[2] = mySet.getString("SOYAD");
						// rows[3] = mySet.getString("BOLUM_ID");
						for (HashMap.Entry<Integer, String> entry : bolumMap.entrySet()) {
							System.out.println(entry.getKey() + " = " + entry.getValue());
							if (entry.getKey() == Integer.valueOf(mySet.getString("bolum_id"))) {
								rows[3] = "" + entry.getValue();
							}
						}
						rows[4] = "" + mySet.getString("SICIL_NO");
						rows[5] = "" + mySet.getInt("BASLAMA_TARIHI");
						rows[6] = mySet.getString("UNVAN");
                        control=1;
					}
					
				}
				if(control==0) {
					
					JOptionPane.showMessageDialog(null, "Boyle bir OGRETMEN bulunmamaktadir.");
					
					
				}
				myModel.addRow(rows);
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		tableTeacher.setModel(myModel);
	}

	private void initialize() {
		hm_TeacherId = new HashMap<>();
		setTitle("TEACHER");
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 68, 757, 209);
		getContentPane().add(scrollPane);

		tableTeacher = new JTable();
		tableTeacher.setBounds(119, 331, 541, 191);
		scrollPane.setViewportView(tableTeacher);
		showTable();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 205));
		panel.setBounds(166, 290, 631, 294);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("AD");
		lblNewLabel.setBounds(90, 30, 68, 14);
		panel.add(lblNewLabel);

		txtAd = new JTextField();
		txtAd.setBounds(187, 27, 98, 20);
		txtAd.setEnabled(false);
		panel.add(txtAd);
		txtAd.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Soyad");
		lblNewLabel_1.setBounds(90, 85, 68, 14);
		panel.add(lblNewLabel_1);

		txtSoyad = new JTextField();
		txtSoyad.setBounds(187, 82, 98, 20);
		txtSoyad.setEnabled(false);
		panel.add(txtSoyad);
		txtSoyad.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Sicil No");
		lblNewLabel_2.setBounds(90, 140, 68, 14);
		panel.add(lblNewLabel_2);

		txtSicil_no = new JTextField();
		txtSicil_no.setBounds(187, 137, 98, 20);
		txtSicil_no.setEnabled(false);
		txtSicil_no.setText("");
		panel.add(txtSicil_no);
		txtSicil_no.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("BOLUM:");
		lblNewLabel_3.setBounds(359, 30, 55, 14);
		panel.add(lblNewLabel_3);

		comboBoxBolum = new JComboBox();
		comboBoxBolum.setBounds(424, 27, 157, 20);
		panel.add(comboBoxBolum);

		JLabel lblNewLabel_4 = new JLabel("Baslama Tarihi");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(60, 196, 98, 14);
		panel.add(lblNewLabel_4);

		txtBaslama = new JTextField();
		txtBaslama.setBounds(187, 193, 104, 20);
		txtBaslama.setEnabled(false);
		panel.add(txtBaslama);
		txtBaslama.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("UNVAN:");
		lblNewLabel_7.setBounds(358, 85, 56, 14);
		panel.add(lblNewLabel_7);

		String[] unvan = { "", "PROF", "DOÃ‡", "DR", "ARS.GR", "ASISTAN" };
		comboBoxUNVAN = new JComboBox(unvan);
		comboBoxUNVAN.setBounds(424, 82, 157, 20);
		panel.add(comboBoxUNVAN);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(169, 169, 169));
		panel_1.setBounds(218, 30, 525, 27);
		getContentPane().add(panel_1);

		JLabel label = new JLabel("Sicil no giriniz:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(0, -1, 134, 25);
		panel_1.add(label);

		txtSearch = new JTextField();
		txtSearch.setColumns(10);
		txtSearch.setBounds(154, 2, 110, 20);
		panel_1.add(txtSearch);

		JButton button = new JButton("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (txtSearch.getText().equals("")) {
					
					showTable();
					searchClickCount=1;
					
				} else {
					searchClickCount=1;
					showTable();
					searchClickCount = 0;
				}

			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBackground(Color.BLUE);
		button.setBounds(307, 1, 89, 23);
		panel_1.add(button);

		try {
			DbConnection con = new DbConnection();
			String query = "Select adi from BOLUM";

			Statement st = con.getMyConn().createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				comboBoxBolum.addItem(rs.getString("adi"));
			}

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

		tableTeacher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					if (tableTeacher.getSelectedRow() != -1) {
						if (tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 2).toString().equals("null")) {
							txtAd.setText("");
						} else {

							txtAd.setText(tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 1).toString());
						}
						txtSoyad.setText(tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 2).toString());
						txtSicil_no.setText(tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 4).toString());
						sicil_No = Integer.parseInt(txtSicil_no.getText());

						txtBaslama.setText(tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 5).toString());
						/*
						 * if (tableTeacher.getValueAt(tableTeacher.getSelectedRow(),
						 * 3).toString().equals("null")) { txtBolum_id.setText(""); } else {
						 * txtBolum_id.setText(tableTeacher.getValueAt(tableTeacher.getSelectedRow(),
						 * 3).toString()); }
						 */
						if (tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 6).toString().equals("null")) {
							// txtUnvan.setText("");
							comboBoxUNVAN.setSelectedItem("");

						} else {
							// txtUnvan.setText(tableTeacher.getValueAt(tableTeacher.getSelectedRow(),
							// 6).toString());
							comboBoxUNVAN.setSelectedItem(
									tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 6).toString());
						}
						if (tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 3).toString().equals("null")) {
							comboBoxBolum.setSelectedItem("");
						} else {
							comboBoxBolum.setSelectedItem(
									tableTeacher.getValueAt(tableTeacher.getSelectedRow(), 3).toString());
						}
					} else {
						JOptionPane.showMessageDialog(null, "Lutfen sayfayi yenileyin!");
					}
				} catch (NullPointerException ex) {
					System.out.println("Bos alanlar var..");
				}

			}
		});

		pnlSetButton1.setVisible(false);
		pnlSetButton2.setVisible(true);

	}

	public TeacherFrame() {
		getContentPane().setBackground(new Color(0, 255, 255));
		initialize();
	}
}
