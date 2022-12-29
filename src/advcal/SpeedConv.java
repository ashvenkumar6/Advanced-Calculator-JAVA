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

public class SpeedConv extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	String num="";
	String[] choice = {"Kmph", "Mph", "Knot"};
	/**
	 * Launch the application.
	 */
	public static void n13() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpeedConv frame = new SpeedConv();
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
	public SpeedConv() {
		setTitle("Speed Converter");
		setBounds(100, 100, 340, 554);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<?> comboBox = new JComboBox<Object>(choice);
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.PINK);
		comboBox.setBounds(41, 32, 100, 36);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(174, 32, 100, 36);
		contentPane.add(textField);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>(choice);
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.PINK);
		comboBox_1.setBounds(41, 92, 100, 36);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 92, 100, 36);
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
		btnNewButton_2.setBounds(41, 206, 75, 61);
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
		btnNewButton_1_3.setBounds(121, 206, 75, 61);
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
		btnNewButton_1_1_1.setBounds(201, 206, 75, 61);
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
		btnNewButton_1_1_2.setBounds(201, 280, 75, 61);
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
		btnNewButton_1_4.setBounds(121, 280, 75, 61);
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
		btnNewButton_3.setBounds(41, 279, 75, 61);
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
		btnNewButton_4.setBounds(41, 354, 75, 61);
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
		btnNewButton_1_5.setBounds(121, 354, 75, 61);
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
		btnNewButton_1_1_3.setBounds(201, 354, 75, 61);
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
		btnNewButton_1_5_1.setBounds(121, 428, 75, 61);
		contentPane.add(btnNewButton_1_5_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str = textField.getText();
	            double KM = Double.parseDouble(Str);
	            double M = Double.parseDouble(Str);
	            double K = Double.parseDouble(Str);
	            if (comboBox.getSelectedItem() == comboBox_1.getSelectedItem()) {
	            	textField_1.setText(Str);
	            }
	            else if (comboBox.getSelectedItem().equals("Kmph") && comboBox_1.getSelectedItem().equals("Mph")){
	                double Mph = convertKMtoM(KM);
	                textField_1.setText("" + String.format("%.3f",Mph));
	            }
	            else if(comboBox.getSelectedItem().equals("Kmph") && comboBox_1.getSelectedItem().equals("Knot")){
	                double Knot = convertKMtoK(KM);
	                textField_1.setText("" + String.format("%.3f",Knot));
	            }
	            else if(comboBox.getSelectedItem().equals("Mph") && comboBox_1.getSelectedItem().equals("Kmph")) {
	                double Kmph = convertMtoKM(M);
	                textField_1.setText("" + String.format("%.3f",Kmph));
	            }
	            else if(comboBox.getSelectedItem().equals("Mph") && comboBox_1.getSelectedItem().equals("Knot")) {
	                double Knot = convertMtoK(M);
	                textField_1.setText("" + String.format("%.3f",Knot));
	            }
	            else if(comboBox.getSelectedItem().equals("Knot") && comboBox_1.getSelectedItem().equals("Kmph")) {
	                double Kmph = convertKtoKM(K);
	                textField_1.setText("" + String.format("%.3f",Kmph));
	            }
	            else if(comboBox.getSelectedItem().equals("Knot") && comboBox_1.getSelectedItem().equals("Mph")) {
	                double Mph = convertKtoM(K);
	                textField_1.setText("" + String.format("%.3f",Mph));
	            }
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(86, 157, 142, 26);
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
		btnNewButton_1.setBounds(41, 428, 75, 61);
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
		btnNewButton_1_1.setBounds(201, 428, 75, 61);
		contentPane.add(btnNewButton_1_1);
	}

	// CONVERSION OF Kmph
    public static double convertKMtoM(double km) {
        double m = km*0.621371192;
        return m;
    }
    public static double convertKMtoK(double km) {
        double k = km*0.539956803;
        return k;
    }

    // CONVERSION OF Mph
    public static double convertMtoKM(double m) {
        double km = m*1.609344;
        return km;
    }
    public static double convertMtoK(double m) {
        double k= m*0.868976242;
        return k;
    }
   
    // CONVERSION OF Knot
    public static double convertKtoKM(double k) {
        double km = k*1.852;
        return km;
    }
    public static double convertKtoM(double k) {
        double m = k*1.15077945;
        return m;
    }
}
