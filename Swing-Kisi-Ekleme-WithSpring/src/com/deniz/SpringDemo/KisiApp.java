package com.deniz.SpringDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KisiApp extends JFrame {

	private JPanel contentPane;
	static ClassPathXmlApplicationContext context;
	DefaultListModel<Kisi> model =new DefaultListModel<Kisi>();
	ArrayList<Kisi> kisilerim=new ArrayList<Kisi>(5);
	JList<Kisi>txtList = new JList<Kisi>(model);
	Kisi kisi;
	int sayac=6;
	private JTextField txtName;
	private JTextField txtSurname;

	
	public static void main(String[] args) {
		
		context=new ClassPathXmlApplicationContext("beans.xml");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KisiApp frame = new KisiApp();
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
	public KisiApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("\u0130sim");
		lblName.setBounds(210, 21, 424, 14);
		panel.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(328, 18, 86, 20);
		panel.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Soyisim");
		lblNewLabel_1.setBounds(210, 84, 56, 14);
		panel.add(lblNewLabel_1);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(328, 81, 86, 20);
		panel.add(txtSurname);
		txtSurname.setColumns(10);
		
		JButton btnNewButton = new JButton("EKLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kisi kisi=context.getBean("kisi", Kisi.class);
				kisi.setName(txtName.getText());
				kisi.setSurname(txtSurname.getText());
				kisilerim.add(kisi);
				model.addElement(kisi);
				
				for (int i = 0; i < kisilerim.size(); i++) {				
					if(kisi.equals(kisilerim.get(i))) {
						kisilerim.remove(i);
					
					}
				}
				
				kisilerim.add(0, kisi);
				model.clear();
				if (kisilerim.size() == 6) {
					kisilerim.remove(kisilerim.size()-1);
					
				}
				
				for (Kisi kisi1 : kisilerim) {
					model.addElement(kisi1);
				}
				
				txtName.setText("");
				txtSurname.setText("");
					
				
				
			}
		});
		btnNewButton.setBounds(312, 157, 89, 23);
		panel.add(btnNewButton);
		
		txtList.setBounds(10, 20, 166, 185);
		panel.add(txtList);
		
		
		
		
		
		
		
		
		
	}
}
