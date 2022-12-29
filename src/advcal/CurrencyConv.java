package advcal;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import advcal.backend;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class CurrencyConv extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	String num="";
	/**
	 * Launch the application.
	 */
	public static void n16() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConv frame = new CurrencyConv();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CurrencyConv() {
		setTitle("Currency Converter");
		setBounds(100, 100, 324, 622);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox(getCurrencies());
		comboBox.setFont(new Font("Dialog", Font.BOLD, 15));
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.PINK);
		comboBox.setSelectedItem("USD");
		comboBox.setBounds(38, 45, 100, 36);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(171, 45, 100, 36);
		contentPane.add(textField);
		
		JComboBox comboBox_1 = new JComboBox(getCurrencies());
		comboBox_1.setFont(new Font("Dialog", Font.BOLD, 15));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.PINK);
		comboBox_1.setSelectedItem("INR");
		comboBox_1.setBounds(38, 105, 100, 36);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(171, 105, 100, 36);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(38, 153, 233, 45);
		contentPane.add(lblNewLabel);
		
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
		btnNewButton_2.setBounds(36, 265, 75, 61);
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
		btnNewButton_1_3.setBounds(116, 265, 75, 61);
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
		btnNewButton_1_1_1.setBounds(196, 265, 75, 61);
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
		btnNewButton_3.setBounds(36, 338, 75, 61);
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
		btnNewButton_1_4.setBounds(116, 339, 75, 61);
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
		btnNewButton_1_1_2.setBounds(196, 339, 75, 61);
		contentPane.add(btnNewButton_1_1_2);
		
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
		btnNewButton_1_1_3.setBounds(196, 413, 75, 61);
		contentPane.add(btnNewButton_1_1_3);
		
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
		btnNewButton_1_5.setBounds(116, 413, 75, 61);
		contentPane.add(btnNewButton_1_5);
		
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
		btnNewButton_4.setBounds(36, 413, 75, 61);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("AC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				lblNewLabel.setText("");
				num = "";
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.setBounds(36, 486, 75, 61);
		contentPane.add(btnNewButton_1);
		
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
		btnNewButton_1_5_1.setBounds(116, 487, 75, 61);
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
		btnNewButton_1_1.setBounds(196, 486, 75, 61);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						try {
							backend bk = new backend(comboBox.getItemAt(comboBox.getSelectedIndex()).toString(),
									comboBox_1.getItemAt(comboBox_1.getSelectedIndex()).toString(),
									Double.parseDouble(textField.getText()));
							if (bk.checkstring()) {
								String rate = Double.toString(bk.getRate());
								Double result = bk.getConvertedCurrency();
								lblNewLabel.setText("1 "+comboBox.getItemAt(comboBox.getSelectedIndex()).toString()+"="+rate + " " + comboBox_1.getItemAt(comboBox_1.getSelectedIndex()).toString());
								textField_1.setText(String.format("%.2f",result) + " " );

							} else {
								JOptionPane.showMessageDialog(btnNewButton, "Currency Should not be Same", "Mismatch",JOptionPane.INFORMATION_MESSAGE);
							}
						} catch (NumberFormatException nf) {
							JOptionPane.showMessageDialog(btnNewButton, "Enter the Correct Currency", "Error",JOptionPane.ERROR_MESSAGE);
						}
					}
				}.start();
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setBounds(77, 210, 142, 26);
		contentPane.add(btnNewButton);
		
		
	}
	
	private Vector<String> getCurrencies() {
		Vector<String> vc = new Vector<>();
		File file = new File("D:\\Java Programs\\Currency-Converter\\codes.txt");
		FileReader fr;
		Scanner sc;
		try {
			fr = new FileReader(file);
			sc = new Scanner(fr);
			while (sc.hasNext()) {
				vc.add(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return vc;

	}
}

