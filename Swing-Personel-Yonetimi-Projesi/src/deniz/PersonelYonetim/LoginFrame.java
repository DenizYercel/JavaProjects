package deniz.PersonelYonetim;
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
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Scanner;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {
	static Scanner input = new Scanner(System.in);
	static File myFile = new File("Dosyalar/login.txt");
	static HashMap<String, String> map = new HashMap<String, String>();


	private JPanel contentPane;
	private JTextField txtKullanciAdi;
	private JTextField txtSifre;
	String kAdi;
	String sifre;
	
	
	
	
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
				JOptionPane.showMessageDialog(null, "Dosya olu�turuldu.");
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
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		
		
		try {

			Scanner scan = new Scanner(myFile);
			while (scan.hasNext()) {

				map.put(scan.next(), scan.next());

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
		txtSifre.setBounds(235, 80, 126, 20);
		panel.add(txtSifre);
		txtSifre.setColumns(10);
		
		JButton Sonuc = new JButton("BAGLAN");
		Sonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File myFile =new File("Dosyalar/login.txt");
			
			
				for (Entry<String, String> entry : map.entrySet()) {
					if(entry.getKey().equals(txtKullanciAdi.getText()) && entry.getValue().equals(txtSifre.getText())) {
						PersonelEkrani pE=new PersonelEkrani();
						pE.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "giris basarisiz.");
					}
						
									
					
				}
					

							
			}
}
	);
		
		Sonuc.setBounds(240, 138, 89, 23);
		panel.add(Sonuc);
	}
}
