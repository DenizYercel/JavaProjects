package com.deniz.swingg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;

public class FirstFrameApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtTxtname;
	private JTextField txtTxtsurname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrameApp frame = new FirstFrameApp();
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
	public FirstFrameApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("\u0130sim");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel_1);
		
		txtTxtname = new JTextField();
		panel.add(txtTxtname);
		txtTxtname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Soy isim");
		panel.add(lblNewLabel_2);
		
		txtTxtsurname = new JTextField();
		panel.add(txtTxtsurname);
		txtTxtsurname.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Sizi selamliyorum..");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane, "BEN SELAMLAMIYORUM AMA");
				JOptionPane.showMessageDialog(contentPane, txtTxtname.getText()+ " "+txtTxtsurname.getText()+"hosgeldin KRAL");
			}
		});
		panel.add(btnNewButton_1);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("My First Swing Application");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		toolBar.add(btnNewButton);
	}

}
