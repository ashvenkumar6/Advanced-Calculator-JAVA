package advcal;

import java.awt.EventQueue;
import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoanCal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void n18() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoanCal frame = new LoanCal();
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
	public LoanCal() {
		setTitle("Loan Calculator");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 344, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrincipal = new JLabel("Principal Amount");
		lblPrincipal.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPrincipal.setBounds(47, 36, 135, 36);
		contentPane.add(lblPrincipal);
		
		JLabel lblInterest = new JLabel("Annual Interest");
		lblInterest.setFont(new Font("Dialog", Font.BOLD, 15));
		lblInterest.setBounds(47, 93, 135, 36);
		contentPane.add(lblInterest);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tenure(in months)");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(47, 150, 142, 36);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(188, 37, 94, 36);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(188, 93, 94, 36);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(188, 151, 94, 36);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("EMI");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(47, 207, 111, 36);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(188, 207, 94, 36);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Total Interest");
		lblNewLabel_1_1_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_1_2.setBounds(47, 263, 111, 36);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(188, 264, 94, 36);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1 = textField.getText();
				String Str2 = textField_1.getText();
				String Str3 = textField_2.getText();
				double P=Double.parseDouble(Str1);
				double I=Double.parseDouble(Str2);
				double T=Double.parseDouble(Str3);
				double Loan = CalculateLoan(P,I,T);
                textField_3.setText("" +String.format("%.2f",Loan));
                double Total = Loan*T;
                textField_5.setText(""+String.format("%.2f",Total));
                double Interest = Loan*T-P;
                textField_4.setText(""+String.format("%.2f",Interest));
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(90, 368, 142, 26);
		contentPane.add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(188, 320, 94, 36);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Total Payment");
		lblNewLabel_1_1_2_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_1_2_1.setBounds(47, 319, 111, 36);
		contentPane.add(lblNewLabel_1_1_2_1);
		
	}
	
	public static double CalculateLoan(double p,double i,double n) {
		double r=i/12/100;
        double emi = p*r*(Math.pow(1+r,n))/(Math.pow(1+r,n)-1);
        return emi;
    }
}
