package deniz.Calculator;

import java.awt.EventQueue;
import java.math.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Calculatorr {

	private JFrame frmHesapMakinesi;
	private JTextField txtDisplay;
	
	double firstNumber;
	double secondNumber;
	double result;
	
	private byte op;
	String operations;
	String answer;
	private boolean zerodisp;
	private boolean decdisp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatorr window = new Calculatorr();
					window.frmHesapMakinesi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculatorr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHesapMakinesi = new JFrame();
		frmHesapMakinesi.setFont(new Font("Dialog", Font.BOLD, 11));
		frmHesapMakinesi.setBackground(Color.GRAY);
		frmHesapMakinesi.setTitle("HESAP MAK\u0130NES\u0130");
		frmHesapMakinesi.setBounds(100, 100, 296, 355);
		frmHesapMakinesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHesapMakinesi.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 260, 36);
		frmHesapMakinesi.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnMod = new JButton("%");
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(op==0) {
						firstNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					else {
						secondNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					if(op==1) {
						firstNumber=firstNumber+secondNumber;
					}
					if(op==2) {
						firstNumber=firstNumber-secondNumber;
					}
					if(op==3) {
						firstNumber=firstNumber*secondNumber;
					}
					if(op==4) {
						firstNumber=firstNumber/secondNumber;
					}
					if(op==5) {
						firstNumber=firstNumber%secondNumber;
					}
					
					txtDisplay.setText("0");
					op=5;
					decdisp=false;
					zerodisp=false;
				} catch (Exception e1) {
					
				}
				
			}
		});
		btnMod.setBounds(10, 58, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnMod);
		
		JButton button = new JButton("");
		button.setBounds(65, 58, 48, 41);
		frmHesapMakinesi.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(txtDisplay.getText().length()>0) {
					StringBuilder strB=new StringBuilder((txtDisplay.getText()));
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace=strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		button_1.setIcon(new ImageIcon(Calculatorr.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		button_1.setBounds(171, 58, 48, 41);
		frmHesapMakinesi.getContentPane().add(button_1);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("0");
				zerodisp=false;
				decdisp=false;
				firstNumber=0;
				secondNumber=0;
			}
		});
		btnC.setBounds(118, 58, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnC);
		
		JButton btnDiv = new JButton("\u00F7");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(op==0) {
						firstNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					else {
						secondNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					if(op==1) {
						firstNumber=firstNumber+secondNumber;
					}
					if(op==2) {
						firstNumber=firstNumber-secondNumber;
					}
					if(op==3) {
						firstNumber=firstNumber*secondNumber;
					}
					if(op==4) {
						firstNumber=firstNumber/secondNumber;
					}
					if(op==5) {
						firstNumber=firstNumber%secondNumber;
					}
					
					txtDisplay.setText("0");
					op=4;
					decdisp=false;
					zerodisp=false;
				} catch (Exception e1) {
					
				}
				
			}
		});
		btnDiv.setBounds(224, 58, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnDiv);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					ops=Math.sqrt(ops);
					txtDisplay.setText(String.valueOf(ops));
					ops=0;
				} catch (Exception e1) {
					
				}
			}
		});
		btnSqrt.setBounds(10, 110, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnSqrt);
		
		JButton btnx2 = new JButton("x\u00B2");
		btnx2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					ops=(ops*ops);
					txtDisplay.setText(String.valueOf(ops));
					ops=0;
				} catch (Exception e1) {
					
				}
			}
		});
		btnx2.setBounds(10, 162, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnx2);
		
		JButton btnx3 = new JButton("x\u00B3");
		btnx3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					ops=(ops*ops*ops);
					txtDisplay.setText(String.valueOf(ops));
					ops=0;
				} catch (Exception e1) {
					
				}
			}
		});
		btnx3.setBounds(10, 214, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnx3);
		
		JButton btnFrak = new JButton("1\\x");
		btnFrak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					ops=1/ops;
					txtDisplay.setText(String.valueOf(ops));
				} catch (Exception e1) {
					
				}
			}
		});
		btnFrak.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnFrak.setBounds(10, 264, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnFrak);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
				String iNum=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(iNum);
				zerodisp=true;
			}
		});
		btn7.setBounds(65, 110, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
				String iNum=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(iNum);
				zerodisp=true;
			}
		});
		btn4.setBounds(65, 162, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
				String iNum=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(iNum);
				zerodisp=true;
			}
		});
		btn1.setBounds(65, 214, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn1);
		
		JButton btnMinusPlus = new JButton("\u2213");
		btnMinusPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					ops=ops*(-1); 
					txtDisplay.setText(String.valueOf(ops));
					decdisp=true;
				} catch (Exception e1) {
					
				}
			}
		});
		btnMinusPlus.setBounds(65, 264, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnMinusPlus);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
				String iNum=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(iNum);
				zerodisp=true;
			}
		});
		btn8.setBounds(118, 110, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
				String iNum=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(iNum);
				zerodisp=true;
			}
		});
		btn5.setBounds(118, 162, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
			String iNum=txtDisplay.getText()+btn2.getText();
			txtDisplay.setText(iNum);
			zerodisp=true;
			}
		});
		btn2.setBounds(118, 214, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
				String iNum=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(iNum);
				zerodisp=true;
			}
		});
		btn0.setBounds(118, 264, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn0);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
				String iNum=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(iNum);
				zerodisp=true;
			}
		});
		btn9.setBounds(171, 110, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
				String iNum=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(iNum);
				zerodisp=true;
			}
		});
		btn6.setBounds(171, 162, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!zerodisp && !decdisp) {
					txtDisplay.setText(null);
				}
				String iNum=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(iNum);
				zerodisp=true;
			}
		});
		btn3.setBounds(171, 214, 48, 41);
		frmHesapMakinesi.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!decdisp) {
					txtDisplay.setText(txtDisplay.getText()+btnDot.getText());
					decdisp=true;
				}
			}
		});
		btnDot.setBounds(171, 264, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnDot);
		
		JButton btnMult = new JButton("\u00D7");
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					if(op==0) {
						firstNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					else {
						secondNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					if(op==1) {
						firstNumber=firstNumber+secondNumber;
					}
					if(op==2) {
						firstNumber=firstNumber-secondNumber;
					}
					if(op==3) {
						firstNumber=firstNumber*secondNumber;
					}
					if(op==4) {
						firstNumber=firstNumber/secondNumber;
					}
					if(op==5) {
						firstNumber=firstNumber%secondNumber;
					}
					
					txtDisplay.setText("0");
					op=3;
					decdisp=false;
					zerodisp=false;
				} catch (Exception e1) {
					
				}
				
			}
		});
		btnMult.setBounds(224, 110, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnMult);
		
		JButton btnSub = new JButton("\u2212");
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(op==0) {
						firstNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					else {
						secondNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					if(op==1) {
						firstNumber=firstNumber+secondNumber;
					}
					if(op==2) {
						firstNumber=firstNumber-secondNumber;
					}
					if(op==3) {
						firstNumber=firstNumber*secondNumber;
					}
					if(op==4) {
						firstNumber=firstNumber/secondNumber;
					}
					if(op==5) {
						firstNumber=firstNumber%secondNumber;
					}
					
					txtDisplay.setText("0");
					op=2;
					decdisp=false;
					zerodisp=false;
				} catch (Exception e1) {
					
				}
			}
		});
		btnSub.setBounds(224, 162, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnSub);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(op==0) {
						firstNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					else {
						secondNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					}
					if(op==1) {
						firstNumber=firstNumber+secondNumber;
					}
					if(op==2) {
						firstNumber=firstNumber-secondNumber;
					}
					if(op==3) {
						firstNumber=firstNumber*secondNumber;
					}
					if(op==4) {
						firstNumber=firstNumber/secondNumber;
					}
					if(op==5) {
						firstNumber=firstNumber%secondNumber;
					}
					
					txtDisplay.setText("0");
					op=1;
					decdisp=false;
					zerodisp=false;
				} catch (Exception e1) {
					
				}
				
				
			}
		});
		btnPlus.setBounds(224, 214, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnPlus);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					secondNumber=Double.parseDouble(String.valueOf(txtDisplay.getText()));
					
					if(op==0) {
						result=secondNumber;
						txtDisplay.setText(String.valueOf(secondNumber)); 
					}
					
					if(op==1) {
						result=firstNumber+secondNumber;
						//txtDisplay.setText(txtDisplay.getText()+String.valueOf(secondNumber)); 
						txtDisplay.setText(String.valueOf(result));
					}
					
					if(op==2) {
						result=firstNumber-secondNumber;
					//	txtDisplay.setText(txtDisplay.getText()+String.valueOf(secondNumber));
						txtDisplay.setText(String.valueOf(result));
					}
					
					if(op==3) {
						result=firstNumber*secondNumber;
					//	txtDisplay.setText(txtDisplay.getText()+String.valueOf(secondNumber)); 
						txtDisplay.setText(String.valueOf(result));
					}
					
					if(op==4) {
						result=firstNumber/secondNumber;
					//	txtDisplay.setText(txtDisplay.getText()+String.valueOf(secondNumber)); 
						txtDisplay.setText(String.valueOf(result));
					}
					
					if(op==5) {
						result=firstNumber%secondNumber;
					//	txtDisplay.setText(txtDisplay.getText()+String.valueOf(secondNumber)); 
						txtDisplay.setText(String.valueOf(result));
					}
					
					firstNumber=0;
					secondNumber=0;
					result=0;
					
					op=0;
					decdisp=false;
					zerodisp=false;
				} catch (Exception e1) {
					
				}
				
				
			}
		});
		btnEquals.setBounds(224, 264, 48, 41);
		frmHesapMakinesi.getContentPane().add(btnEquals);
	}
}
