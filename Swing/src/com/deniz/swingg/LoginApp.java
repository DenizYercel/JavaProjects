package com.deniz.swingg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Scanner;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginApp extends JFrame {
	static Scanner input = new Scanner(System.in);
	static File myFile = new File("files/Users.txt");
	static HashMap<Integer, String> map = new HashMap<Integer, String>();


	private JPanel contentPane;
	private JTextField txtKullanciAdi;
	private JTextField txtSifre;
	String kAdi;
	int sifre;
	private JTextField textField;
	
	
	
	
/*	void createFile() {
		if(myFile.exists()) {
			myFile.mkdirs();
		}
	}
	void readFile() {
		File myFile=new File("C:\\Users\\deniz.yercel\\eclipse-workspace\\2020.02.06.SwingApp\\src\\com\\deniz/Users.txt");
		try {
			FileReader read=new FileReader(myFile);
		} catch (FileNotFoundException e) {
			try {
				FileWriter writer =new FileWriter(myFile);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Dosya oluþturuldu.");
			}
		}
	} */
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginApp frame = new LoginApp();
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
	public LoginApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtKullanciAdi = new JTextField();
		txtKullanciAdi.setBounds(234, 28, 126, 23);
		txtKullanciAdi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(txtKullanciAdi);
		txtKullanciAdi.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Kullanici Adi :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(42, 28, 136, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u015Eifre :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(42, 73, 160, 23);
		panel.add(lblNewLabel_2);
		
		txtSifre = new JTextField();
		txtSifre.setBounds(234, 76, 126, 20);
		panel.add(txtSifre);
		txtSifre.setColumns(10);
		
		JButton Sonuc = new JButton("BAGLAN");
		Sonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File myFile =new File("files/Users.txt");
				
					try {
						String line;
						RandomAccessFile raf=new RandomAccessFile(myFile, "rw");
					try {
							line=raf.readLine();
							String username=line.substring(9);
							String password=raf.readLine().substring(9);
						if(txtKullanciAdi.getText().equals(username) && txtSifre.getText().equals(password)) {
								Sonuc.setText("basarili");
								
								boolean success=true;
								if(success) {
									OtherFrameApp oA=new OtherFrameApp();
									oA.setVisible(true);
									
									textField.setText(oA.getTextField_1()+" "+oA.getTextField());
									
									
								}
						}
						else {
								JOptionPane.showMessageDialog(contentPane, "GÝRÝS BASARÝSÝZ");
							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}				
			}
		});
		Sonuc.setBounds(40, 165, 89, 23);
		panel.add(Sonuc);
		
		JButton btnNewButton_1 = new JButton("\u00C7IKI\u015E");
		btnNewButton_1.setBounds(247, 165, 89, 23);
		panel.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(136, 198, 153, 20);
		panel.add(textField);
		textField.setColumns(10);
	}
}
