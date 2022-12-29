package advcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Dimension;

public class DataConv extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	String num="";
	String[] choice = {"Byte", "KiloByte", "MegaByte", "GigaByte"};

	/**
	 * Launch the application.
	 */
	public static void n4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataConv frame = new DataConv();
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
	public DataConv() {
		getContentPane().setBackground(new Color(192, 192, 192));
		setSize(new Dimension(350, 564));
		setTitle("Data Convertor");
		getContentPane().setLayout(null);
		
		JComboBox<?> comboBox = new JComboBox<Object>(choice);
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.PINK);
		comboBox.setBounds(38, 45, 100, 36);
		getContentPane().add(comboBox);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>(choice);
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.PINK);
		comboBox_1.setBounds(38, 105, 100, 36);
		getContentPane().add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(171, 45, 100, 36);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 105, 100, 36);
		getContentPane().add(textField_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+7;
				textField.setText(num);
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_2.setBackground(new Color(100, 149, 237));
		btnNewButton_2.setBounds(46, 216, 75, 61);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_3 = new JButton("8");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+8;
				textField.setText(num);
			}
		});
		btnNewButton_1_3.setForeground(Color.BLACK);
		btnNewButton_1_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_3.setBackground(new Color(100, 149, 237));
		btnNewButton_1_3.setBounds(126, 216, 75, 61);
		getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_1 = new JButton("9");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+9;
				textField.setText(num);
			}
		});
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_1_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1_1.setBounds(206, 216, 75, 61);
		getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+4;
				textField.setText(num);
			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_3.setBackground(new Color(100, 149, 237));
		btnNewButton_3.setBounds(46, 289, 75, 61);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_4 = new JButton("5");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+5;
				textField.setText(num);
			}
		});
		btnNewButton_1_4.setForeground(Color.BLACK);
		btnNewButton_1_4.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_4.setBackground(new Color(100, 149, 237));
		btnNewButton_1_4.setBounds(126, 290, 75, 61);
		getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_1_2 = new JButton("6");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+6;
				textField.setText(num);
			}
		});
		btnNewButton_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_1_2.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1_2.setBounds(206, 290, 75, 61);
		getContentPane().add(btnNewButton_1_1_2);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+1;
				textField.setText(num);
			}
		});
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_4.setBackground(new Color(100, 149, 237));
		btnNewButton_4.setBounds(46, 364, 75, 61);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_5 = new JButton("2");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+2;
				textField.setText(num);
			}
		});
		btnNewButton_1_5.setForeground(Color.BLACK);
		btnNewButton_1_5.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_5.setBackground(new Color(100, 149, 237));
		btnNewButton_1_5.setBounds(126, 364, 75, 61);
		getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_1_3 = new JButton("3");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+3;
				textField.setText(num);
			}
		});
		btnNewButton_1_1_3.setForeground(Color.BLACK);
		btnNewButton_1_1_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_1_3.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1_3.setBounds(206, 364, 75, 61);
		getContentPane().add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_5_1 = new JButton("0");
		btnNewButton_1_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+0;
				textField.setText(num);
			}
		});
		btnNewButton_1_5_1.setForeground(Color.BLACK);
		btnNewButton_1_5_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_5_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_5_1.setBounds(126, 438, 75, 61);
		getContentPane().add(btnNewButton_1_5_1);
		
		JButton btnNewButton_1_1 = new JButton(".");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+".";
				textField.setText(num);
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1.setBounds(206, 438, 75, 61);
		getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str = textField.getText();
	            double B = Double.parseDouble(Str);
	            double KB = Double.parseDouble(Str);
	            double MB = Double.parseDouble(Str);
	            double GB = Double.parseDouble(Str);
	            if (comboBox.getSelectedItem() == comboBox_1.getSelectedItem()) {
	            	textField_1.setText(Str);
	            }
	            else if (comboBox.getSelectedItem().equals("Byte") && comboBox_1.getSelectedItem().equals("KiloByte")){
	                double KiloByte = convertBtoKB(B);
	                textField_1.setText("" + String.format("%.6f",KiloByte));
	            }
	            else if(comboBox.getSelectedItem().equals("Byte") && comboBox_1.getSelectedItem().equals("GigaByte")){
	                double GigaByte = convertBtoGB(B);
	                textField_1.setText("" + String.format("%.6f",GigaByte));
	            }
	            else if(comboBox.getSelectedItem().equals("Byte") && comboBox_1.getSelectedItem().equals("MegaByte")) {
	                double MegaByte = convertBtoMB(B);
	                textField_1.setText("" + String.format("%.6f",MegaByte));
	            }
	            else if(comboBox.getSelectedItem().equals("KiloByte") && comboBox_1.getSelectedItem().equals("Byte")) {
	                double Byte = convertKBtoB(KB);
	                textField_1.setText("" + String.format("%.6f",Byte));
	            }
	            else if(comboBox.getSelectedItem().equals("KiloByte") && comboBox_1.getSelectedItem().equals("GigaByte")) {
	                double GigaByte = convertKBtoGB(KB);
	                textField_1.setText("" + String.format("%.6f",GigaByte));
	            }
	            else if(comboBox.getSelectedItem().equals("KiloByte") && comboBox_1.getSelectedItem().equals("MegaByte")) {
	                double MegaByte = convertKBtoMB(KB);
	                textField_1.setText("" + String.format("%.6f",MegaByte));
	            }
	            else if(comboBox.getSelectedItem().equals("MegaByte") && comboBox_1.getSelectedItem().equals("Byte")) {
	                double Byte = convertMBtoB(MB);
	                textField_1.setText("" + String.format("%.6f",Byte));
	            }
	            else if(comboBox.getSelectedItem().equals("MegaByte") && comboBox_1.getSelectedItem().equals("GigaByte")) {
	                double GigaByte = convertMBtoGB(MB);
	                textField_1.setText("" + String.format("%.6f",GigaByte));
	            }
	            else if (comboBox.getSelectedItem().equals("MegaByte") && comboBox_1.getSelectedItem().equals("KiloByte")){
	                double KiloByte = convertMBtoKB(MB);
	                textField_1.setText("" + String.format("%.6f",KiloByte));
	            }
	            else if(comboBox.getSelectedItem().equals("GigaByte") && comboBox_1.getSelectedItem().equals("Byte")) {
	                double Byte = convertGBtoB(GB);
	                textField_1.setText("" + String.format("%.6f",Byte));
	            }
	            else if(comboBox.getSelectedItem().equals("GigaByte") && comboBox_1.getSelectedItem().equals("MegaByte")) {
	                double MegaByte = convertGBtoMB(GB);
	                textField_1.setText("" + String.format("%.6f",MegaByte));
	            }
	            else if (comboBox.getSelectedItem().equals("GigaByte") && comboBox_1.getSelectedItem().equals("KiloByte")){
	                double KiloByte = convertGBtoKB(GB);
	                textField_1.setText("" + String.format("%.6f",KiloByte));
	            }
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(90, 165, 142, 26);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("AC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				num = "";
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setBounds(46, 438, 75, 61);
		getContentPane().add(btnNewButton_1);
		
	    }
		// CONVERSION OF Bytes
	    public static double convertBtoKB(double B) {
	        double KB = B * 0.0009765625;
	        return KB;
	    }
	    public static double convertBtoMB(double B) {
	        double MB = B * 9.53674316E-7;
	        return MB;
	    }
	    public static double convertBtoGB(double B) {
	        double GB = B * 9.31322575E-10;
	        return GB;
	    }

	    // CONVERSION OF KiloBytes
	    public static double convertKBtoB(double KB) {
	        double B = KB * 1024;
	        return B;
	    }
	    public static double convertKBtoMB(double KB) {
	        double MB = KB * 0.0009765625;
	        return MB;
	    }
	    public static double convertKBtoGB(double KB) {
	        double GB = KB * 9.53674316E-7;
	        return GB;
	    }

	    // CONVERSION OF MegaBytes
	    public static double convertMBtoB(double MB) {
	        double B = MB * 1048576;
	        return B;
	    }
	    public static double convertMBtoKB(double MB) {
	        double KB = MB * 1024;
	        return KB;
	    }
	    public static double convertMBtoGB(double MB) {
	        double GB = MB * 0.0009765625;
	        return GB;
	    }

	    // CONVERSION OF GigaBytes
	    public static double convertGBtoB(double GB) {
	        double B = GB * 1.07374182E9;
	        return B;
	    }
	    public static double convertGBtoKB(double GB) {
	        double KB = GB * 1048576;
	        return KB;
	    }
	    public static double convertGBtoMB(double GB) {
	        double MB = GB * 1024;
	        return MB;
	    }
		
}
