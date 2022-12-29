package advcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class convert extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					convert frame = new convert();
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
	public convert() {
		setTitle("Conversions");
		setBounds(100, 100, 401, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DataConv();
				DataConv.n4();
			}
		});
		btnNewButton.setFont(new Font("RomanT", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(128, 128, 192));
		btnNewButton.setBounds(23, 44, 89, 66);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BMI");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BMIcalc();
				BMIcalc.n5();
			}
		});
		btnNewButton_1.setFont(new Font("RomanT", Font.BOLD, 15));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(128, 128, 192));
		btnNewButton_1.setBounds(143, 44, 89, 66);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Age");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Agecal();
				Agecal.n6();
			}
		});
		btnNewButton_2.setFont(new Font("RomanT", Font.BOLD, 15));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(128, 128, 192));
		btnNewButton_2.setBounds(263, 44, 89, 66);
		contentPane.add(btnNewButton_2);
		
		JButton btnDiscount = new JButton("Disc%");
		btnDiscount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DiscountCal();
				DiscountCal.n7();
			}
		});
		btnDiscount.setForeground(Color.BLACK);
		btnDiscount.setFont(new Font("RomanT", Font.BOLD, 15));
		btnDiscount.setBackground(new Color(128, 128, 192));
		btnDiscount.setBounds(23, 144, 89, 66);
		contentPane.add(btnDiscount);
		
		JButton btnNewButton_1_1 = new JButton("Date");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DateCal();
				DateCal.n8();
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("RomanT", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(128, 128, 192));
		btnNewButton_1_1.setBounds(143, 144, 89, 66);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Length");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LengthConv();
				LengthConv.n9();
			}
		});
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("RomanT", Font.BOLD, 12));
		btnNewButton_2_1.setBackground(new Color(128, 128, 192));
		btnNewButton_2_1.setBounds(263, 144, 89, 66);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnArea = new JButton("Area");
		btnArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AreaConv();
				AreaConv.n10();
			}
		});
		btnArea.setForeground(Color.BLACK);
		btnArea.setFont(new Font("RomanT", Font.BOLD, 15));
		btnArea.setBackground(new Color(128, 128, 192));
		btnArea.setBounds(23, 244, 89, 66);
		contentPane.add(btnArea);
		
		JButton btnNewButton_1_2 = new JButton("Vol");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new VolConv();
				VolConv.n11();
			}
		});
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setFont(new Font("RomanT", Font.BOLD, 15));
		btnNewButton_1_2.setBackground(new Color(128, 128, 192));
		btnNewButton_1_2.setBounds(143, 244, 89, 66);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("Temp");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TempConv();
				TempConv.n12();
			}
		});
		btnNewButton_2_2.setForeground(Color.BLACK);
		btnNewButton_2_2.setFont(new Font("RomanT", Font.BOLD, 15));
		btnNewButton_2_2.setBackground(new Color(128, 128, 192));
		btnNewButton_2_2.setBounds(263, 244, 89, 66);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnSpeed = new JButton("Speed");
		btnSpeed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SpeedConv();
				SpeedConv.n13();
			}
		});
		btnSpeed.setForeground(Color.BLACK);
		btnSpeed.setFont(new Font("RomanT", Font.BOLD, 13));
		btnSpeed.setBackground(new Color(128, 128, 192));
		btnSpeed.setBounds(23, 344, 89, 66);
		contentPane.add(btnSpeed);
		
		JButton btnNewButton_1_3 = new JButton("Time");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TimeConv();
				TimeConv.n14();
			}
		});
		btnNewButton_1_3.setForeground(Color.BLACK);
		btnNewButton_1_3.setFont(new Font("RomanT", Font.BOLD, 15));
		btnNewButton_1_3.setBackground(new Color(128, 128, 192));
		btnNewButton_1_3.setBounds(143, 344, 89, 66);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("Mass");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MassConv();
				MassConv.n15();
			}
		});
		btnNewButton_2_3.setForeground(Color.BLACK);
		btnNewButton_2_3.setFont(new Font("RomanT", Font.BOLD, 15));
		btnNewButton_2_3.setBackground(new Color(128, 128, 192));
		btnNewButton_2_3.setBounds(263, 344, 89, 66);
		contentPane.add(btnNewButton_2_3);
	}
}
