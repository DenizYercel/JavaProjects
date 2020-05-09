package com.deniz.swingg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DortIslemSwingApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtDrtIlemeHogeldiniz;
	private JTextField sayi2;
	private JTextField sayi1;
	private JTextField sonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DortIslemSwingApp frame = new DortIslemSwingApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DortIslemSwingApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		txtDrtIlemeHogeldiniz = new JTextField();
		txtDrtIlemeHogeldiniz.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDrtIlemeHogeldiniz.setHorizontalAlignment(SwingConstants.CENTER);
		txtDrtIlemeHogeldiniz.setText("\u0130K\u0130   \u0130\u015ELEME HO\u015EGELD\u0130N\u0130Z");
		toolBar.add(txtDrtIlemeHogeldiniz);
		txtDrtIlemeHogeldiniz.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{147, 106, 0};
		gbl_panel.rowHeights = new int[]{20, 32, 34, 34, 26, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("B\u0130R\u0130NC\u0130 SAY\u0130");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0130K\u0130NC\u0130 SAY\u0130");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		sayi1 = new JTextField();
		GridBagConstraints gbc_sayi1 = new GridBagConstraints();
		gbc_sayi1.anchor = GridBagConstraints.WEST;
		gbc_sayi1.fill = GridBagConstraints.VERTICAL;
		gbc_sayi1.insets = new Insets(0, 0, 5, 5);
		gbc_sayi1.gridx = 0;
		gbc_sayi1.gridy = 1;
		panel.add(sayi1, gbc_sayi1);
		sayi1.setColumns(10);
		
		sayi2 = new JTextField();
		GridBagConstraints gbc_sayi2 = new GridBagConstraints();
		gbc_sayi2.anchor = GridBagConstraints.WEST;
		gbc_sayi2.fill = GridBagConstraints.VERTICAL;
		gbc_sayi2.insets = new Insets(0, 0, 5, 0);
		gbc_sayi2.gridx = 1;
		gbc_sayi2.gridy = 1;
		panel.add(sayi2, gbc_sayi2);
		sayi2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u00C7IKAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int b1=Integer.parseInt(sayi1.getText());
					int b2=Integer.parseInt(sayi2.getText());
					int total1=b1-b2;
					
					sonuc.setText(Integer.toString(total1));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Sayi girinizz.");
				}
			}
		});
		
		JButton btnNewButton = new JButton("TOPLA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a1=Integer.parseInt(sayi1.getText());
					int a2=Integer.parseInt(sayi2.getText());
					int total=a1+a2;
					
					sonuc.setText(Integer.toString(total));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Sayi girinizz.");
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		panel.add(btnNewButton, gbc_btnNewButton);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 3;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("SONU\u00C7");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		sonuc = new JTextField();
		GridBagConstraints gbc_sonuc = new GridBagConstraints();
		gbc_sonuc.anchor = GridBagConstraints.WEST;
		gbc_sonuc.gridx = 1;
		gbc_sonuc.gridy = 4;
		panel.add(sonuc, gbc_sonuc);
		sonuc.setColumns(10);
	}
}
