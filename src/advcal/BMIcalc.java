package advcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMIcalc extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void n5() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIcalc frame = new BMIcalc();
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
	public BMIcalc() {
		setTitle("BMI Calculator");
		setBounds(100, 100, 349, 344);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WEIGHT");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(52, 25, 75, 36);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(170, 25, 100, 36);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(170, 85, 100, 36);
		contentPane.add(textField_1);
		
		JLabel lblHeight = new JLabel("HEIGHT");
		lblHeight.setBackground(Color.DARK_GRAY);
		lblHeight.setForeground(Color.RED);
		lblHeight.setFont(new Font("Dialog", Font.BOLD, 15));
		lblHeight.setBounds(52, 85, 75, 36);
		contentPane.add(lblHeight);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setForeground(Color.RED);
		lblBmi.setFont(new Font("Dialog", Font.BOLD, 15));
		lblBmi.setBackground(Color.DARK_GRAY);
		lblBmi.setBounds(94, 170, 45, 36);
		contentPane.add(lblBmi);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(141, 155, 159, 67);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1 = textField.getText();
				String Str2 = textField_1.getText();
				double W=Double.parseDouble(Str1);
				double H=Double.parseDouble(Str2);
				double BMI = CalculateBMI(W,H);
				if(BMI<=18.4)
                textField_2.setText("" + String.format("%.1f",BMI)+" - Underweight");
				else if(BMI>=18.5 && BMI<=24.9)
	            textField_2.setText("" + String.format("%.1f",BMI)+" - Normal");
				else if(BMI>=25.0 && BMI<=39.9)
		        textField_2.setText("" + String.format("%.1f",BMI)+" - Overweight");
				else if(BMI>=40.0)
		        textField_2.setText("" + String.format("%.1f",BMI)+" - Obese");
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(94, 234, 142, 26);
		contentPane.add(btnNewButton);
	}
	public static double CalculateBMI(double w,double h) {
        double bmi = w/(h*h);
        return bmi;
    }
}
