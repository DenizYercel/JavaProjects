package com.deniz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SwingDisplay extends JFrame   {
	
	static ArrayList<Donem> donemList = new ArrayList<Donem>();
	
	
	private JPanel contentPane;
	private JTextField txtAktif;
	private JTextField txtSearch;

	
	public static Connection myConn;
	public static Statement st;
	public static ResultSet rs;
	public static PreparedStatement ps;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDisplay frame = new SwingDisplay();
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
	public SwingDisplay()  throws SQLException{
		DefaultListModel<Donem> model= new DefaultListModel<Donem>();
		JList<Donem>txtList = new JList<Donem>(model);
		
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection myConn = DriverManager.getConnection(dbUrl, "oidb", "oidb");
		Statement stmt = myConn.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select id, donem_adi"+" from donem");

		while (rs.next()) {
			donemList.add( new Donem(rs.getInt(1),rs.getString(2)));
}
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("AKT\u0130F D\u00D6NEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblNewLabel);
		
		txtAktif = new JTextField();
		panel.add(txtAktif);	
		txtAktif.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("D\u00F6nem");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(9, 20, 57, 21);
		panel_1.add(lblNewLabel_1);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(75, 20, 96, 22);
		panel_1.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("Bul");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
					ResultSet rs3 = stmt.executeQuery("Select * from donem where donem.donem_adi like '"+txtSearch.getText() +"%'");
					while (rs3.next()) {
						
						donemList.add(new Donem(rs3.getInt(1), rs3.getString(2)));							
							
						model.addElement(new Donem(rs3.getInt(1), rs3.getString(2)));
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				donemList.clear();
			}
		});
		btnNewButton.setBounds(282, 21, 89, 23);
		panel_1.add(btnNewButton);
		
		txtList.setBounds(10, 68, 254, 114);
		panel_1.add(txtList);
		
		JButton btnNewButton_1 = new JButton("Aktif D\u00F6nemi Belirle");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet rs4;
				try {
					rs4 = stmt.executeQuery("update aktif_donem set donem_id ="+(txtList.getSelectedValue().getId()));
					txtAktif.setText(txtList.getSelectedValue().getAdi());
					
				} catch (SQLException e1) {
					
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(265, 116, 174, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u00C7IKI\u015E");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					myConn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(277, 176, 89, 23);
		panel_1.add(btnNewButton_2);
		
		ResultSet rs2 = stmt.executeQuery("Select donem_id  from aktif_donem");
		if(rs2.next()) {
			ResultSet rs3 = stmt.executeQuery("Select donem_adi from donem where id="+rs2.getInt(1));
			if(rs3.next()){
				txtAktif.setText(rs3.getString(1));
			}
		}
		
		
		
	}

}
