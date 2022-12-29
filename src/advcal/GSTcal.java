package advcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GSTcal extends JFrame {

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
	public static void n17() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GSTcal frame = new GSTcal();
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
	public GSTcal() {
		setTitle("GST Calculator");
		setBounds(100, 100, 330, 327);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Original Price");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(39, 31, 111, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblGst = new JLabel("GST %");
		lblGst.setFont(new Font("Dialog", Font.BOLD, 15));
		lblGst.setBounds(39, 93, 111, 36);
		contentPane.add(lblGst);
		
		JLabel lblNewLabel_1_1 = new JLabel("Final Price");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(39, 150, 111, 36);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(180, 32, 94, 36);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(180, 93, 94, 36);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(180, 151, 94, 36);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(81, 201, 142, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1 = textField.getText();
				String Str2 = textField_1.getText();
				double O=Double.parseDouble(Str1);
				double G=Double.parseDouble(Str2);
				double GST = CalculateGST(O,G);
                textField_2.setText("" +GST);
                lblNewLabel_1.setText("CGST/SGST:"+G/2);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(81, 229, 142, 26);
		contentPane.add(btnNewButton);
		
	}
	
	public static double CalculateGST(double o,double g) {
        double gst = o+((o*g)/100);
        return gst;
    }
}
