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

public class LengthConv extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	String num="";
	String[] choice = {"Mile", "Meter", "Feet", "Kilometer"};


	/**
	 * Launch the application.
	 */
	public static void n9() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LengthConv frame = new LengthConv();
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
	public LengthConv() {
		setTitle("Length Converter");
		setBounds(100, 100, 337, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		JComboBox<?> comboBox = new JComboBox<Object>(choice);
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.PINK);
		comboBox.setBounds(43, 33, 100, 36);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(176, 33, 100, 36);
		contentPane.add(textField);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>(choice);
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.PINK);
		comboBox_1.setBounds(43, 93, 100, 36);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(176, 93, 100, 36);
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
		btnNewButton_2.setBounds(41, 218, 75, 61);
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
		btnNewButton_1_3.setBounds(121, 218, 75, 61);
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
		btnNewButton_1_1_1.setBounds(201, 218, 75, 61);
		contentPane.add(btnNewButton_1_1_1);
		
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
		btnNewButton_1_1_2.setBounds(201, 292, 75, 61);
		contentPane.add(btnNewButton_1_1_2);
		
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
		btnNewButton_1_4.setBounds(121, 292, 75, 61);
		contentPane.add(btnNewButton_1_4);
		
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
		btnNewButton_3.setBounds(41, 291, 75, 61);
		contentPane.add(btnNewButton_3);
		
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
		btnNewButton_4.setBounds(41, 366, 75, 61);
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
		btnNewButton_1_5.setBounds(121, 366, 75, 61);
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
		btnNewButton_1_1_3.setBounds(201, 366, 75, 61);
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
		btnNewButton_1_5_1.setBounds(121, 440, 75, 61);
		contentPane.add(btnNewButton_1_5_1);
		
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
		btnNewButton_1_1.setBounds(201, 440, 75, 61);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str = textField.getText();
	            double km = Double.parseDouble(Str);
	            double f = Double.parseDouble(Str);
	            double mil = Double.parseDouble(Str);
	            double m = Double.parseDouble(Str);
	            if (comboBox.getSelectedItem() == comboBox_1.getSelectedItem()) {
	            	textField_1.setText(Str);
	            }
	            else if (comboBox.getSelectedItem().equals("Kilometer") && comboBox_1.getSelectedItem().equals("Mile")){
	                double Mile = convertKmToMi(km);
	                textField_1.setText("" + String.format("%.6f",Mile));
	            }
	            else if(comboBox.getSelectedItem().equals("Kilometer") && comboBox_1.getSelectedItem().equals("Meter")){
	                double meter = convertKmToMeter(km);
	                textField_1.setText("" + String.format("%.6f",meter));
	            }
	            else if(comboBox.getSelectedItem().equals("Kilometer") && comboBox_1.getSelectedItem().equals("Feet")) {
	                double Feet = convertKmToFeet(km);
	                textField_1.setText("" + String.format("%.6f",Feet));
	            }
	            else if(comboBox.getSelectedItem().equals("Mile") && comboBox_1.getSelectedItem().equals("Kilometer")) {
	                double Kilometer = convertMiToKm(mil);
	                textField_1.setText("" + String.format("%.6f",Kilometer));
	            }
	            else if(comboBox.getSelectedItem().equals("Mile") && comboBox_1.getSelectedItem().equals("Meter")) {
	                double meter = convertMiToMeter(mil);
	                textField_1.setText("" + String.format("%.6f",meter));
	            }
	            else if(comboBox.getSelectedItem().equals("Mile") && comboBox_1.getSelectedItem().equals("Feet")) {
	                double Feet = convertMiToFeet(mil);
	                textField_1.setText("" + String.format("%.6f",Feet));
	            }
	            else if(comboBox.getSelectedItem().equals("Feet") && comboBox_1.getSelectedItem().equals("Kilometer")) {
	                double Kilometer = convertFeetToKm(f);
	                textField_1.setText("" + String.format("%.6f",Kilometer));
	            }
	            else if(comboBox.getSelectedItem().equals("Feet") && comboBox_1.getSelectedItem().equals("Meter")) {
	                double meter = convertFeetToMeter(f);
	                textField_1.setText("" + String.format("%.6f",meter));
	            }
	            else if (comboBox.getSelectedItem().equals("Feet") && comboBox_1.getSelectedItem().equals("Mile")){
	                double Mile = convertFeetToMi(f);
	                textField_1.setText("" + String.format("%.6f",Mile));
	            }
	            else if(comboBox.getSelectedItem().equals("Meter") && comboBox_1.getSelectedItem().equals("Kilometer")) {
	                double Kilometer = convertMeterToKm(m);
	                textField_1.setText("" + String.format("%.6f",Kilometer));
	            }
	            else if(comboBox.getSelectedItem().equals("Meter") && comboBox_1.getSelectedItem().equals("Feet")) {
	                double Feet = convertMeterToFeet(m);
	                textField_1.setText("" + String.format("%.6f",Feet));
	            }
	            else if (comboBox.getSelectedItem().equals("Meter") && comboBox_1.getSelectedItem().equals("Mile")){
	                double Mile = convertMeterToMi(m);
	                textField_1.setText("" + String.format("%.6f",Mile));
	            }
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(90, 164, 142, 26);
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
		btnNewButton_1.setBounds(41, 440, 75, 61);
		contentPane.add(btnNewButton_1);
		
		
	}
	// CONVERSION OF KILOMETER
    public static double convertKmToMi(double kilometer) {
        double mile = kilometer * 0.621;
        return mile;
    }
    public static double convertKmToMeter(double kilometer) {
        double meter = kilometer * 1000;
        return meter;
    }
    public static double convertKmToFeet(double kilometer) {
        double feet = kilometer * 3280.84;
        return feet;
    }

    // CONVERSION OF MILES
    public static double convertMiToKm(double mile) {
        double kilometer = mile * 1.60934;
        return kilometer;
    }
    public static double convertMiToMeter(double mile) {
        double meter = mile * 1609.34;
        return meter;
    }
    public static double convertMiToFeet(double mile) {
        double feet = mile * 5280;
        return feet;
    }

    // CONVERSION OF FOOT
    public static double convertFeetToKm(double feet) {
        double kilometer = feet * 0.0003048;
        return kilometer;
    }
    public static double convertFeetToMeter(double feet) {
        double meter = feet * 0.3048;
        return meter;
    }
    public static double convertFeetToMi(double feet) {
        double mile = feet * 0.000189394;
        return mile;
    }

    // CONVERSION OF METER
    public static double convertMeterToKm(double meter) {
        double kilometer = meter * 0.001;
        return kilometer;
    }
    public static double convertMeterToFeet(double meter) {
        double feet = meter * 3.28084;
        return feet;
    }
    public static double convertMeterToMi(double meter) {
        double mile = meter * 0.000621371;
        return mile;
    }
}
