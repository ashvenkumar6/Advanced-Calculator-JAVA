package advcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VolConv extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	String num="";
	String[] choice = {"Cu. meter", "Liter", "Milliliter"};
	
	/**
	 * Launch the application.
	 */
	public static void n11() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VolConv frame = new VolConv();
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
	public VolConv() {
		setTitle("Volume Converter");
		setBounds(100, 100, 324, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<?> comboBox = new JComboBox<Object>(choice);
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.PINK);
		comboBox.setBounds(41, 40, 100, 36);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(174, 40, 100, 36);
		contentPane.add(textField);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>(choice);
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.PINK);
		comboBox_1.setBounds(41, 100, 100, 36);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 100, 100, 36);
		contentPane.add(textField_1);
		
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
		btnNewButton_2.setBounds(41, 207, 75, 61);
		contentPane.add(btnNewButton_2);
		
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
		btnNewButton_1_3.setBounds(121, 207, 75, 61);
		contentPane.add(btnNewButton_1_3);
		
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
		btnNewButton_1_1_1.setBounds(201, 207, 75, 61);
		contentPane.add(btnNewButton_1_1_1);
		
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
		btnNewButton_3.setBounds(41, 280, 75, 61);
		contentPane.add(btnNewButton_3);
		
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
		btnNewButton_1_4.setBounds(121, 281, 75, 61);
		contentPane.add(btnNewButton_1_4);
		
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
		btnNewButton_1_1_2.setBounds(201, 281, 75, 61);
		contentPane.add(btnNewButton_1_1_2);
		
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
		btnNewButton_4.setBounds(41, 355, 75, 61);
		contentPane.add(btnNewButton_4);
		
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
		btnNewButton_1_5.setBounds(121, 355, 75, 61);
		contentPane.add(btnNewButton_1_5);
		
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
		btnNewButton_1_1_3.setBounds(201, 355, 75, 61);
		contentPane.add(btnNewButton_1_1_3);
		
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
		btnNewButton_1_5_1.setBounds(121, 429, 75, 61);
		contentPane.add(btnNewButton_1_5_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str = textField.getText();
	            double C = Double.parseDouble(Str);
	            double L = Double.parseDouble(Str);
	            double M = Double.parseDouble(Str);
	            if (comboBox.getSelectedItem() == comboBox_1.getSelectedItem()) {
	            	textField_1.setText(Str);
	            }
	            else if (comboBox.getSelectedItem().equals("Cu. meter") && comboBox_1.getSelectedItem().equals("Liter")){
	                double Liter = convertCtoL(C);
	                textField_1.setText("" + String.format("%.6f",Liter));
	            }
	            else if(comboBox.getSelectedItem().equals("Cu. meter") && comboBox_1.getSelectedItem().equals("Milliliter")){
	                double MilliLiter = convertCtoM(C);
	                textField_1.setText("" + String.format("%.6f",MilliLiter));
	            }
	            else if(comboBox.getSelectedItem().equals("Liter") && comboBox_1.getSelectedItem().equals("Cu. meter")) {
	                double Cubicmeter = convertLtoC(L);
	                textField_1.setText("" + String.format("%.6f",Cubicmeter));
	            }
	            else if(comboBox.getSelectedItem().equals("Liter") && comboBox_1.getSelectedItem().equals("Milliliter")) {
	                double MilliLiter = convertLtoM(L);
	                textField_1.setText("" + String.format("%.6f",MilliLiter));
	            }
	            else if(comboBox.getSelectedItem().equals("Milliliter") && comboBox_1.getSelectedItem().equals("Cu. meter")) {
	                double Cubicmeter = convertMtoC(M);
	                textField_1.setText("" + String.format("%.6f",Cubicmeter));
	            }
	            else if(comboBox.getSelectedItem().equals("Milliliter") && comboBox_1.getSelectedItem().equals("Liter")) {
	                double Liter = convertMtoL(M);
	                textField_1.setText("" + String.format("%.6f",Liter));
	            }
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(84, 158, 142, 26);
		contentPane.add(btnNewButton);
		
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
		btnNewButton_1.setBounds(39, 429, 75, 61);
		contentPane.add(btnNewButton_1);
		
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
		btnNewButton_1_1.setBounds(199, 429, 75, 61);
		contentPane.add(btnNewButton_1_1);
	
	}
	
	// CONVERSION OF Cu.meter
    public static double convertCtoL(double c) {
        double l = c*1000;
        return l;
    }
    public static double convertCtoM(double c) {
        double m = c*1000000;
        return m;
    }

    // CONVERSION OF Liter
    public static double convertLtoC(double l) {
        double c = l*0.001;
        return c;
    }
    public static double convertLtoM(double l) {
        double m = l*1000;
        return m;
    }
   
    // CONVERSION OF MilliLiter
    public static double convertMtoC(double m) {
        double c = m*1E-6;
        return c;
    }
    public static double convertMtoL(double m) {
        double l = m*0.001;
        return l;
    }
}
