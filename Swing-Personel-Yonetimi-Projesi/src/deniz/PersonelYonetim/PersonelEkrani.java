package deniz.PersonelYonetim;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TrayIcon.MessageType;

import javax.swing.JToolBar;
import javax.naming.ldap.Rdn;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class PersonelEkrani extends JFrame {

	private JPanel contentPane;
	private JTextField txtIsim;
	private JTextField txtSoyisim;
	private JTextField txtSicilno;
	static int sayac = 0;
	static int i = 0;
	static ArrayList<Personel> kisiler = new ArrayList<Personel>();
	static boolean yeniKayit = false;
	static boolean kaydedildi = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelEkrani a = new PersonelEkrani();
					a.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public PersonelEkrani() {
		ButtonGroup group = new ButtonGroup();

		int guncelKisi;

		File file = new File("Dosyalar/personel.txt");
		try {
			Scanner sc = new Scanner(file);

			while (sc.hasNext()) {
				kisiler.add(new Personel(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
						Integer.parseInt(sc.nextLine()), sc.nextLine(), CType.valueOf(sc.nextLine()),
						Boolean.parseBoolean(sc.nextLine())));

			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JButton button_1 = new JButton("<");
		JButton button = new JButton("<<");
		JButton button_2 = new JButton(">");
		JButton button_3 = new JButton(">>");
		JButton buttonYeniKayit = new JButton("Yeni Kay�t");
		JButton btnEkle = new JButton("Ekle");
		JButton btnSil = new JButton("Sil");
		JButton btnGncelle = new JButton("G\u00FCncelle");
		JButton btnVazge = new JButton("Vazge\u00E7");

		btnVazge.setEnabled(false);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 30, 125, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblIsim = new JLabel("\u0130sim");
		lblIsim.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblIsim = new GridBagConstraints();
		gbc_lblIsim.anchor = GridBagConstraints.EAST;
		gbc_lblIsim.insets = new Insets(0, 0, 5, 5);
		gbc_lblIsim.gridx = 0;
		gbc_lblIsim.gridy = 0;
		panel.add(lblIsim, gbc_lblIsim);

		txtIsim = new JTextField();
		GridBagConstraints gbc_txtIsim = new GridBagConstraints();
		gbc_txtIsim.gridwidth = 2;
		gbc_txtIsim.insets = new Insets(0, 0, 5, 5);
		gbc_txtIsim.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIsim.gridx = 1;
		gbc_txtIsim.gridy = 0;
		panel.add(txtIsim, gbc_txtIsim);
		txtIsim.setColumns(10);

		JLabel lblSoyisim = new JLabel("Soyisim");
		GridBagConstraints gbc_lblSoyisim = new GridBagConstraints();
		gbc_lblSoyisim.anchor = GridBagConstraints.EAST;
		gbc_lblSoyisim.insets = new Insets(0, 0, 5, 5);
		gbc_lblSoyisim.gridx = 0;
		gbc_lblSoyisim.gridy = 1;
		panel.add(lblSoyisim, gbc_lblSoyisim);

		txtSoyisim = new JTextField();
		GridBagConstraints gbc_txtSoyisim = new GridBagConstraints();
		gbc_txtSoyisim.gridwidth = 2;
		gbc_txtSoyisim.insets = new Insets(0, 0, 5, 5);
		gbc_txtSoyisim.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSoyisim.gridx = 1;
		gbc_txtSoyisim.gridy = 1;
		panel.add(txtSoyisim, gbc_txtSoyisim);
		txtSoyisim.setColumns(10);

		JLabel lblSicilNo = new JLabel("Sicil No");
		GridBagConstraints gbc_lblSicilNo = new GridBagConstraints();
		gbc_lblSicilNo.anchor = GridBagConstraints.EAST;
		gbc_lblSicilNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSicilNo.gridx = 0;
		gbc_lblSicilNo.gridy = 2;
		panel.add(lblSicilNo, gbc_lblSicilNo);

		txtSicilno = new JTextField();
		GridBagConstraints gbc_txtSicilno = new GridBagConstraints();
		gbc_txtSicilno.gridwidth = 2;
		gbc_txtSicilno.insets = new Insets(0, 0, 5, 5);
		gbc_txtSicilno.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSicilno.gridx = 1;
		gbc_txtSicilno.gridy = 2;
		panel.add(txtSicilno, gbc_txtSicilno);
		txtSicilno.setColumns(10);

		JLabel lblGiriYl = new JLabel("Giri\u015F Y\u0131l\u0131");
		GridBagConstraints gbc_lblGiriYl = new GridBagConstraints();
		gbc_lblGiriYl.anchor = GridBagConstraints.EAST;
		gbc_lblGiriYl.insets = new Insets(0, 0, 5, 5);
		gbc_lblGiriYl.gridx = 0;
		gbc_lblGiriYl.gridy = 3;
		panel.add(lblGiriYl, gbc_lblGiriYl);

		JComboBox comboBoxGirisYili = new JComboBox();
		comboBoxGirisYili.setModel(new DefaultComboBoxModel(new String[] { "2018", "2019", "2020" }));
		GridBagConstraints gbc_comboBoxGirisYili = new GridBagConstraints();
		gbc_comboBoxGirisYili.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxGirisYili.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxGirisYili.gridx = 1;
		gbc_comboBoxGirisYili.gridy = 3;
		panel.add(comboBoxGirisYili, gbc_comboBoxGirisYili);

		JLabel lblDoumYeri = new JLabel("Do\u011Fum Yeri");
		GridBagConstraints gbc_lblDoumYeri = new GridBagConstraints();
		gbc_lblDoumYeri.anchor = GridBagConstraints.EAST;
		gbc_lblDoumYeri.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoumYeri.gridx = 0;
		gbc_lblDoumYeri.gridy = 4;
		panel.add(lblDoumYeri, gbc_lblDoumYeri);

		JComboBox comboBoxSehir = new JComboBox();
		comboBoxSehir.setModel(new DefaultComboBoxModel(new String[] { "Ankara","�stanbul","�zmir" }));
		GridBagConstraints gbc_comboBoxSehir = new GridBagConstraints();
		gbc_comboBoxSehir.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxSehir.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxSehir.gridx = 1;
		gbc_comboBoxSehir.gridy = 4;
		panel.add(comboBoxSehir, gbc_comboBoxSehir);

		JLabel lblCinsiyet = new JLabel("Cinsiyet");
		GridBagConstraints gbc_lblCinsiyet = new GridBagConstraints();
		gbc_lblCinsiyet.insets = new Insets(0, 0, 5, 5);
		gbc_lblCinsiyet.gridx = 0;
		gbc_lblCinsiyet.gridy = 5;
		panel.add(lblCinsiyet, gbc_lblCinsiyet);

		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 5;
		panel.add(panel_3, gbc_panel_3);

		JRadioButton rdbtnK = new JRadioButton("K");
		panel_3.add(rdbtnK);
		group.add(rdbtnK);

		JRadioButton rdbtnE = new JRadioButton("E");
		panel_3.add(rdbtnE);
		group.add(rdbtnE);

		JLabel lblYnetimPersoneli = new JLabel("Y\u00F6netim Personeli");
		GridBagConstraints gbc_lblYnetimPersoneli = new GridBagConstraints();
		gbc_lblYnetimPersoneli.insets = new Insets(0, 0, 0, 5);
		gbc_lblYnetimPersoneli.gridx = 0;
		gbc_lblYnetimPersoneli.gridy = 6;
		panel.add(lblYnetimPersoneli, gbc_lblYnetimPersoneli);

		JCheckBox checkBoxYonetim = new JCheckBox("");
		GridBagConstraints gbc_checkBoxYonetim = new GridBagConstraints();
		gbc_checkBoxYonetim.insets = new Insets(0, 0, 0, 5);
		gbc_checkBoxYonetim.gridx = 1;
		gbc_checkBoxYonetim.gridy = 6;
		panel.add(checkBoxYonetim, gbc_checkBoxYonetim);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);

		JToolBar toolBar = new JToolBar();
		panel_2.add(toolBar);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayac = 0;
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(true);
				button_3.setEnabled(true);
				btnEkle.setEnabled(false);
				btnSil.setEnabled(true);
				btnGncelle.setEnabled(true);
				btnVazge.setEnabled(false);

				txtIsim.setText(kisiler.get(sayac).getIsim());
				txtSoyisim.setText(kisiler.get(sayac).getSoyIsim());
				txtSicilno.setText(String.valueOf(kisiler.get(sayac).getSicilNo()));
				comboBoxGirisYili.setSelectedIndex(kisiler.get(sayac).getGirisYili() - 2018);
				comboBoxSehir.setSelectedItem((String)kisiler.get(sayac).getDogumYeri());
					
				if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("E"))
					rdbtnE.setSelected(true);
				else if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("K"))
					rdbtnK.setSelected(true);
				if (kisiler.get(sayac).yonetimPersoneli())
					checkBoxYonetim.setSelected(true);
				else
					checkBoxYonetim.setSelected(false);

			}
		});
		toolBar.add(button);

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				sayac--;
				if (sayac == 0) {
					button_1.setEnabled(false);
					button.setEnabled(false);
				}

				button_2.setEnabled(true);
				button_3.setEnabled(true);
				btnEkle.setEnabled(false);
				btnSil.setEnabled(true);
				btnGncelle.setEnabled(true);
				btnVazge.setEnabled(false);

				txtIsim.setText(kisiler.get(sayac).getIsim());
				txtSoyisim.setText(kisiler.get(sayac).getSoyIsim());
				txtSicilno.setText(String.valueOf(kisiler.get(sayac).getSicilNo()));
				comboBoxGirisYili.setSelectedIndex(kisiler.get(sayac).getGirisYili() - 2018);
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("�stanbul"))
//					i = 0;
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("Ankara"))
//					i = 1;
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("�zmir"))
//					i = 2;
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("Bursa"))
//					i = 3;
//				comboBoxSehir.setSelectedIndex(i);
				
				comboBoxSehir.setSelectedItem(kisiler.get(sayac).getDogumYeri());
				/*
				 * for (int j = 0; j < 3; j++) { if
				 * (kisiler.get(i).getDogumYeri().equals(comboBoxSehir.getItemAt(j))) {
				 * comboBoxSehir.setSelectedIndex(j); } }
				 */
				if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("E"))
					rdbtnE.setSelected(true);
				else if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("K"))
					rdbtnK.setSelected(true);
				if (kisiler.get(sayac).yonetimPersoneli())
					checkBoxYonetim.setSelected(true);
				else
					checkBoxYonetim.setSelected(false);

			}
		});
		toolBar.add(button_1);

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sayac++;
				if (sayac == kisiler.size() - 1) {
					button_2.setEnabled(false);
					button_3.setEnabled(false);
				}

				button.setEnabled(true);
				button_1.setEnabled(true);
				btnEkle.setEnabled(false);
				btnSil.setEnabled(true);
				btnGncelle.setEnabled(true);
				btnVazge.setEnabled(false);

				txtIsim.setText(kisiler.get(sayac).getIsim());
				txtSoyisim.setText(kisiler.get(sayac).getSoyIsim());
				txtSicilno.setText(String.valueOf(kisiler.get(sayac).getSicilNo()));
				comboBoxGirisYili.setSelectedIndex(kisiler.get(sayac).getGirisYili() - 2018);
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("�stanbul"))
//					i = 0;
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("Ankara"))
//					i = 1;
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("�zmir"))
//					i = 2;
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("Bursa"))
//					i = 3;
//				comboBoxSehir.setSelectedIndex(i);
				comboBoxSehir.setSelectedItem((String)kisiler.get(sayac).getDogumYeri());
				
				/*
				 * for (int j = 0; j < 3; j++) { if
				 * (kisiler.get(i).getDogumYeri().equals(comboBoxSehir.getItemAt(j))) {
				 * comboBoxSehir.setSelectedIndex(j); } }
				 */
				if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("E"))
					rdbtnE.setSelected(true);
				else if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("K"))
					rdbtnK.setSelected(true);
				if (kisiler.get(sayac).yonetimPersoneli())
					checkBoxYonetim.setSelected(true);
				else
					checkBoxYonetim.setSelected(false);

			}
		});
		toolBar.add(button_2);

		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sayac = kisiler.size() - 1;
				button_3.setEnabled(false);
				button_2.setEnabled(false);
				button.setEnabled(true);
				button_1.setEnabled(true);

				txtIsim.setText(kisiler.get(sayac).getIsim());
				txtSoyisim.setText(kisiler.get(sayac).getSoyIsim());
				txtSicilno.setText(String.valueOf(kisiler.get(sayac).getSicilNo()));
			//	comboBoxGirisYili.setSelectedIndex(kisiler.get(sayac).getGirisYili() - 2018);
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("�stanbul"))
//					i = 0;
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("Ankara"))
//					i = 1;
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("�zmir"))
//					i = 2;
//				if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("Bursa"))
//					i = 3;
//				comboBoxSehir.setSelectedIndex(i);
				comboBoxSehir.setSelectedItem(kisiler.get(sayac).getDogumYeri());
				/*
				 * for (int j = 0; j < 3; j++) { if
				 * (kisiler.get(i).getDogumYeri().equals(comboBoxSehir.getItemAt(j))) {
				 * comboBoxSehir.setSelectedIndex(j); } }
				 */

				if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("E"))
					rdbtnE.setSelected(true);
				else if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("K"))
					rdbtnK.setSelected(true);
				if (kisiler.get(sayac).yonetimPersoneli())
					checkBoxYonetim.setSelected(true);
				else
					checkBoxYonetim.setSelected(false);
			}
		});
		toolBar.add(button_3);

		btnEkle.setEnabled(false);
		btnEkle.addActionListener(new ActionListener() {
			boolean yonetim = false;
			CType cinsiyet = CType.E;

			public void actionPerformed(ActionEvent e) {
				btnSil.setEnabled(true);
				btnGncelle.setEnabled(true);
				if (!yeniKayit)
					btnEkle.setEnabled(false);
				else {
					String ad = txtIsim.getText();
					String soyad = txtSoyisim.getText();
					int sicilNo = Integer.parseInt(txtSicilno.getText());
					int girisyili = comboBoxGirisYili.getSelectedIndex() + 2018;
					String dogumYeri = (String)comboBoxSehir.getSelectedItem();
//					if (comboBoxSehir.getSelectedIndex() == 0)
//						dogumYeri = "�stanbul";
//					else if (comboBoxSehir.getSelectedIndex() == 1)
//						dogumYeri = "Ankara";
//					else if (comboBoxSehir.getSelectedIndex() == 2)
//						dogumYeri = "�zmir";
//					else if (comboBoxSehir.getSelectedIndex() == 3)
//						dogumYeri = "Bursa";
					if (rdbtnK.isSelected()) {
						cinsiyet = CType.K;
					}

					if (checkBoxYonetim.isSelected()) {
						yonetim = true;
					}

					kisiler.add(new Personel(ad, soyad, sicilNo, girisyili, dogumYeri, cinsiyet, yonetim));
				}
				btnEkle.setEnabled(false);
				sayac = kisiler.size() - 1;
				kaydedildi = false;
				button.setEnabled(true);
				button_1.setEnabled(true);
			}
		});
		toolBar.add(btnEkle);

		btnVazge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVazge.setEnabled(false);
				btnEkle.setEnabled(false);
				button.setEnabled(true);
				button_1.setEnabled(true);
				button_1.doClick();
				kaydedildi = false;

			}
		});
		toolBar.add(btnVazge);

		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEkle.setEnabled(false);
//				JOptionPane.showConfirmDialog(contentPane, "Kay�t Silinsin mi?");
				int h = JOptionPane.showConfirmDialog(contentPane, "Kay�t Silinsin mi?");
				if (h == 0) {
					kisiler.remove(sayac);
					JOptionPane.showMessageDialog(contentPane, "Kay�t Silindi");
					if (sayac != kisiler.size() - 1) {
						button_2.doClick();
					} else
						button_1.doClick();

					button_1.doClick();
					kaydedildi = false;
				} else
					JOptionPane.showMessageDialog(contentPane, "Silinmedi");

			}
		});
		toolBar.add(btnSil);

		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEkle.setEnabled(false);

				kisiler.get(sayac).setIsim(txtIsim.getText());
				kisiler.get(sayac).setSoyIsim(txtSoyisim.getText());
				kisiler.get(sayac).setSicilNo(Integer.parseInt(txtSicilno.getText()));
				kisiler.get(sayac).setGirisYili(comboBoxGirisYili.getSelectedIndex() + 2018);
//				if (comboBoxSehir.getSelectedIndex() == 0)
//					kisiler.get(sayac).setDogumYeri("�stanbul");
//				if (comboBoxSehir.getSelectedIndex() == 1)
//					kisiler.get(sayac).setDogumYeri("Ankara");
//				if (comboBoxSehir.getSelectedIndex() == 2)
//					kisiler.get(sayac).setDogumYeri("�zmir");
//				if (comboBoxSehir.getSelectedIndex() == 3)
//					kisiler.get(sayac).setDogumYeri("Bursa");
				kisiler.get(sayac).setDogumYeri((String)comboBoxSehir.getSelectedItem());
				String dogumYeri = (String)comboBoxSehir.getSelectedItem();
				if (rdbtnE.isSelected())
					kisiler.get(sayac).setTip(CType.valueOf("E"));
				else if (rdbtnK.isSelected())
					kisiler.get(sayac).setTip(CType.valueOf("K"));
				if (checkBoxYonetim.isSelected())
					kisiler.get(sayac).setYonetimPersoneli(true);
				else
					kisiler.get(sayac).setYonetimPersoneli(false);

				kaydedildi = false;
			}
		});
		toolBar.add(btnGncelle);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.SOUTH);

		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEkle.setEnabled(false);
				btnVazge.setEnabled(false);

				try {
					Formatter fm = new Formatter(file);
					for (int i = 0; i < kisiler.size(); i++) {
						fm.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n", kisiler.get(i).getIsim(), kisiler.get(i).getSoyIsim(),
								String.valueOf(kisiler.get(i).getSicilNo()),
								String.valueOf(kisiler.get(i).getGirisYili()), kisiler.get(i).getDogumYeri(),
								String.valueOf(kisiler.get(i).getTip()),
								String.valueOf(kisiler.get(i).yonetimPersoneli()));
					}
					fm.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				kaydedildi = true;
			}
		});

		panel_4.add(buttonYeniKayit);
		buttonYeniKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEkle.setEnabled(true);
				btnSil.setEnabled(false);
				btnGncelle.setEnabled(false);
				btnVazge.setEnabled(true);

				button_3.doClick();
				yeniKayit = true;
				txtIsim.setText("");
				txtSoyisim.setText("");
				txtSicilno.setText("");
				comboBoxGirisYili.setSelectedIndex(0);
				comboBoxSehir.setSelectedIndex(0);
				group.clearSelection();
//				rdbtnE.setSelected(false);
//				rdbtnK.setSelected(false);
				checkBoxYonetim.setSelected(false);
				button.setEnabled(false);
				button_1.setEnabled(false);

			}
		});

		panel_4.add(btnKaydet);

		JButton btnk = new JButton("\u00C7\u0131k\u0131\u015F");
		panel_4.add(btnk);
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!kaydedildi) {
					int h = JOptionPane.showConfirmDialog(contentPane, "De�i�iklikler Kaydedilsin mi?");
					if (h == 0) {
						btnKaydet.doClick();
						System.exit(0);
					} else if (h == 1) {
						System.exit(0);
					}
					
				}else 
				System.exit(0);

			}
			
		});

		txtIsim.setText(kisiler.get(sayac).getIsim());
		txtSoyisim.setText(kisiler.get(sayac).getSoyIsim());
		txtSicilno.setText(String.valueOf(kisiler.get(sayac).getSicilNo()));
		//comboBoxGirisYili.setSelectedIndex(kisiler.get(sayac).getGirisYili() - 2018);
//		if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("�stanbul"))
//			i = 0;
//		if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("Ankara"))
//			i = 1;
//		if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("�zmir"))
//			i = 2;
//		if (kisiler.get(sayac).getDogumYeri().equalsIgnoreCase("Bursa"))
//			i = 3;
//		comboBoxSehir.setSelectedIndex(i);
		
		comboBoxSehir.setSelectedItem(kisiler.get(sayac).getDogumYeri());
		
		/*
		 * for (int j = 0; j < 3; j++) { if
		 * (kisiler.get(i).getDogumYeri().equals(comboBoxSehir.getItemAt(j))) {
		 * comboBoxSehir.setSelectedIndex(j); } }
		 */
		if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("E"))
			rdbtnE.setSelected(true);
		else if (kisiler.get(sayac).getTip().toString().equalsIgnoreCase("K"))
			rdbtnK.setSelected(true);
		if (kisiler.get(sayac).yonetimPersoneli())
			checkBoxYonetim.setSelected(true);
		else
			checkBoxYonetim.setSelected(false);

		button_1.setEnabled(false);
		button.setEnabled(false);
	}

//	public void goster() {
//		txtIsim.setText(kisiler.get(i).getAd());
//		txtSoyisim.setText(kisiler.get(i).getSoyad());
//		txtSicilno.setText(String.valueOf(kisiler.get(0).getSicilNo()));
//		comboBoxGirisYili.setSelectedIndex(1);
//		comboBoxSehir.setSelectedIndex(i);
//		rdbtnE.setSelected(true);
//		checkBoxYonetim.setSelected(true);
//		
//	}

}