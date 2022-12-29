package advcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiscountCal extends JFrame {

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
	public static void n7() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiscountCal frame = new DiscountCal();
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
	public DiscountCal() {
		setTitle("Discount");
		setBounds(100, 100, 375, 329);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Original Price");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(63, 35, 111, 36);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 15));
		textField.setBounds(204, 35, 94, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDiscount = new JLabel("Discount %");
		lblDiscount.setFont(new Font("Dialog", Font.BOLD, 15));
		lblDiscount.setBounds(63, 97, 111, 36);
		contentPane.add(lblDiscount);
		
		JLabel lblNewLabel_1_1 = new JLabel("Final Price");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(63, 154, 111, 36);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(204, 97, 94, 36);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(204, 154, 94, 36);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1 = textField.getText();
				String Str2 = textField_1.getText();
				double O=Double.parseDouble(Str1);
				double D=Double.parseDouble(Str2);
				double Disc = CalculateDiscount(O,D);
                textField_2.setText("" +Disc);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(106, 209, 142, 26);
		contentPane.add(btnNewButton);
	}
	public static double CalculateDiscount(double o,double d) {
        double disc = o*((100-d)/100);
        return disc;
    }
}
