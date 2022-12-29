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

public class AreaConv extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	String num="";
	String[] choice = {"Sq. Km", "Hectare", "Acre","Sq. Foot"};
	
	/**
	 * Launch the application.
	 */
	public static void n10() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaConv frame = new AreaConv();
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
	public AreaConv() {
		setTitle("Area Converter");
		setBounds(100, 100, 326, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<?> comboBox = new JComboBox<Object>(choice);
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.PINK);
		comboBox.setBounds(37, 48, 100, 36);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(170, 48, 100, 36);
		contentPane.add(textField);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>(choice);
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.PINK);
		comboBox_1.setBounds(37, 108, 100, 36);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(170, 108, 100, 36);
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
		btnNewButton_2.setBounds(37, 211, 75, 61);
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
		btnNewButton_1_3.setBounds(117, 211, 75, 61);
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
		btnNewButton_1_1_1.setBounds(197, 211, 75, 61);
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
		btnNewButton_3.setBounds(37, 284, 75, 61);
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
		btnNewButton_1_4.setBounds(117, 285, 75, 61);
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
		btnNewButton_1_1_2.setBounds(197, 285, 75, 61);
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
		btnNewButton_4.setBounds(37, 359, 75, 61);
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
		btnNewButton_1_5.setBounds(117, 359, 75, 61);
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
		btnNewButton_1_1_3.setBounds(197, 359, 75, 61);
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
		btnNewButton_1_5_1.setBounds(117, 433, 75, 61);
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
		btnNewButton_1_1.setBounds(197, 433, 75, 61);
		contentPane.add(btnNewButton_1_1);
		
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
		btnNewButton_1.setBounds(37, 433, 75, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str = textField.getText();
	            double SK = Double.parseDouble(Str);
	            double H = Double.parseDouble(Str);
	            double A = Double.parseDouble(Str);
	            double SF = Double.parseDouble(Str);
	            if (comboBox.getSelectedItem() == comboBox_1.getSelectedItem()) {
	            	textField_1.setText(Str);
	            }
	            else if (comboBox.getSelectedItem().equals("Sq. Km") && comboBox_1.getSelectedItem().equals("Hectare")){
	                double Hectare = convertSKtoH(SK);
	                textField_1.setText("" + String.format("%.6f",Hectare));
	            }
	            else if(comboBox.getSelectedItem().equals("Sq. Km") && comboBox_1.getSelectedItem().equals("Acre")){
	                double Acre = convertSKtoA(SK);
	                textField_1.setText("" + String.format("%.6f",Acre));
	            }
	            else if (comboBox.getSelectedItem().equals("Sq. Km") && comboBox_1.getSelectedItem().equals("Sq. Foot")){
		            double SqFt = convertSKtoSF(SK);
		            textField_1.setText("" + String.format("%.6f",SqFt));
	            }
	            else if(comboBox.getSelectedItem().equals("Hectare") && comboBox_1.getSelectedItem().equals("Sq. Km")) {
	                double SqKm = convertHtoSK(H);
	                textField_1.setText("" + String.format("%.6f",SqKm));
	            }
	            else if(comboBox.getSelectedItem().equals("Hectare") && comboBox_1.getSelectedItem().equals("Acre")) {
	                double Acre = convertHtoA(H);
	                textField_1.setText("" + String.format("%.6f",Acre));
	            }
	            else if (comboBox.getSelectedItem().equals("Hectare") && comboBox_1.getSelectedItem().equals("Sq. Foot")){
		            double SqFt = convertHtoSF(H);
		            textField_1.setText("" + String.format("%.6f",SqFt));
	            }
	            else if(comboBox.getSelectedItem().equals("Acre") && comboBox_1.getSelectedItem().equals("Sq. Km")) {
	                double SqKm = convertAtoSK(A);
	                textField_1.setText("" + String.format("%.6f",SqKm));
	            }
	            else if(comboBox.getSelectedItem().equals("Acre") && comboBox_1.getSelectedItem().equals("Hectare")) {
	                double Hectare = convertAtoH(A);
	                textField_1.setText("" + String.format("%.6f",Hectare));
	            }
	            else if (comboBox.getSelectedItem().equals("Acre") && comboBox_1.getSelectedItem().equals("Sq. Foot")){
		            double SqFt = convertAtoSF(A);
		            textField_1.setText("" + String.format("%.6f",SqFt));
	            }
	            else if(comboBox.getSelectedItem().equals("Sq. Foot") && comboBox_1.getSelectedItem().equals("Sq. Km")) {
	                double SqKm = convertSFtoSK(SF);
	                textField_1.setText("" + String.format("%.6f",SqKm));
	            }
	            else if(comboBox.getSelectedItem().equals("Sq. Foot") && comboBox_1.getSelectedItem().equals("Hectare")) {
	                double Hectare = convertSFtoH(SF);
	                textField_1.setText("" + String.format("%.6f",Hectare));
	            }
	            else if(comboBox.getSelectedItem().equals("Sq. Foot") && comboBox_1.getSelectedItem().equals("Acre")) {
	                double Acre = convertSFtoA(SF);
	                textField_1.setText("" + String.format("%.6f",Acre));
	            }
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(80, 166, 142, 26);
		contentPane.add(btnNewButton);
		
	}
	// CONVERSION OF Sq.Km
    public static double convertSKtoH(double sk) {
        double h = sk * 100;
        return h;
    }
    public static double convertSKtoA(double sk) {
        double a = sk * 247.105407;
        return a;
    }
    public static double convertSKtoSF(double sk) {
        double sf = sk * 10763910.4;
        return sf;
    }

    // CONVERSION OF Hectare
    public static double convertHtoSK(double h) {
        double sk = h * 0.01;
        return sk;
    }
    public static double convertHtoA(double h) {
        double a = h * 2.47105407;
        return a;
    }
    public static double convertHtoSF(double h) {
        double sf= h * 10763910.4;
        return sf;
    }

    // CONVERSION OF Acre
    public static double convertAtoSK(double a) {
        double sk = a * 0.004046856;
        return sk;
    }
    public static double convertAtoH(double a) {
        double h = a * 0.4046856;
        return h;
    }
    public static double convertAtoSF(double a) {
        double sf = a * 43559.9955;
        return sf;
    }

    // CONVERSION OF Sq.Ft
    public static double convertSFtoSK(double sf) {
        double sk = sf * 9.290304E-8;
        return sk;
    }
    public static double convertSFtoH(double sf) {
        double h = sf * 9.290304E-6;
        return h;
    }
    public static double convertSFtoA(double sf) {
        double a = sf * 2.29568435E-5;
        return a;
    }
}
