package advcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class numerical extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	String num="",str;
	int button;
	double n1=0.0,n2=0.0,d1;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					numerical frame = new numerical();
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
	public numerical() {
		setTitle("Numericals");
		setBounds(100, 100, 396, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		textArea.setBounds(37, 28, 315, 131);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				num = "";
				n1=0.0;
				n2=0.0;
				button=0;
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(37, 177, 75, 61);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("%");
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num!="")             //obtain the first operand
				{
				textArea.setText("");
				n1 = Double.parseDouble(num);    //convert string in to
				num="";                           //double & store it in n1
				d1=n1/100;
				str = String.valueOf(d1);          //convert the //value to string
				textArea.setText(str);
				}
				else
				{
				textArea.setText("");
				}
			}
		});
		btnNewButton_1.setBounds(117, 177, 75, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton(".");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+".";
				textArea.setText(num);
			}
		});
		btnNewButton_1_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setBounds(197, 177, 75, 61);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("/");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button = 4;
				if(num!="")             //obtain the first operand
				{
				textArea.setText("");
				n1 = Double.parseDouble(num);    //convert string in to
				num="";             //print the value
				}
				else
				{
				textArea.setText("");
				}
			}
		});
		btnNewButton_1_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_2.setBackground(new Color(0, 191, 255));
		btnNewButton_1_2.setForeground(new Color(0, 0, 0));
		btnNewButton_1_2.setBounds(277, 177, 75, 61);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+7;
				textArea.setText(num);
			}
		});
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(new Color(100, 149, 237));
		btnNewButton_2.setBounds(37, 249, 75, 61);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_3 = new JButton("8");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+8;
				textArea.setText(num);
			}
		});
		btnNewButton_1_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_3.setForeground(Color.BLACK);
		btnNewButton_1_3.setBackground(new Color(100, 149, 237));
		btnNewButton_1_3.setBounds(117, 249, 75, 61);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_1 = new JButton("9");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+9;
				textArea.setText(num);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1_1.setBounds(197, 249, 75, 61);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("-");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button = 2;
				if(num!="")             //obtain the first operand
				{
				textArea.setText("");
			    n1 = Double.parseDouble(num);    //convert string in to
				num="";                           //double & store it in n1
				}
				else
				{
				textArea.setText("");
				}
			}
		});
		btnNewButton_1_2_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_2_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1_2_1.setBounds(277, 249, 75, 61);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+4;
				textArea.setText(num);
			}
		});
		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(new Color(100, 149, 237));
		btnNewButton_3.setBounds(37, 322, 75, 61);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1_4 = new JButton("5");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+5;
				textArea.setText(num);
			}
		});
		btnNewButton_1_4.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_4.setForeground(Color.BLACK);
		btnNewButton_1_4.setBackground(new Color(100, 149, 237));
		btnNewButton_1_4.setBounds(117, 323, 75, 61);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_1_2 = new JButton("6");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+6;
				textArea.setText(num);
			}
		});
		btnNewButton_1_1_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_2.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1_2.setBounds(197, 323, 75, 61);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("+");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button = 1;
				if(num!="")             //obtain the first operand
				{
				textArea.setText("");
				n1 = Double.parseDouble(num);    //convert string in to
				num="";                           //double & store it in n1
				}
				else
				{
				textArea.setText("");
				}
			}
		});
		btnNewButton_1_2_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_2_2.setForeground(Color.BLACK);
		btnNewButton_1_2_2.setBackground(new Color(0, 191, 255));
		btnNewButton_1_2_2.setBounds(277, 323, 75, 61);
		contentPane.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+1;
				textArea.setText(num);
			}
		});
		btnNewButton_4.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBackground(new Color(100, 149, 237));
		btnNewButton_4.setBounds(37, 397, 75, 61);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_5 = new JButton("2");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+2;
				textArea.setText(num);
			}
		});
		btnNewButton_1_5.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_5.setForeground(Color.BLACK);
		btnNewButton_1_5.setBackground(new Color(100, 149, 237));
		btnNewButton_1_5.setBounds(117, 397, 75, 61);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_1_3 = new JButton("3");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+3;
				textArea.setText(num);
			}
		});
		btnNewButton_1_1_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_1_3.setForeground(Color.BLACK);
		btnNewButton_1_1_3.setBackground(new Color(100, 149, 237));
		btnNewButton_1_1_3.setBounds(197, 397, 75, 61);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_2_3 = new JButton("=");
		btnNewButton_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(textArea.getText().equals("")))
				{
			    textArea.setText("");
				n2 = Double.parseDouble(num);//store 2nd operand in n2
				num = "";
				try
				{
				switch(button)
				{
				case 1:
				d1 = n1+n2;
				break;  
				case 2:
				d1 = n1-n2;
				break;
				case 3:
				d1 = n1*n2;
				break;
				case 4:
				d1 = n1/n2;
				break;
				default:
				d1 = 0.0;
				}
				str = String.valueOf(d1);          //convert the //value to string
				textArea.setText(str);       //print the value
				}
				catch(Exception E){}
				}
				else
				{
				textArea.setText("");
				}
			}
		});
		btnNewButton_1_2_3.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_2_3.setForeground(Color.BLACK);
		btnNewButton_1_2_3.setBackground(new Color(220, 20, 60));
		btnNewButton_1_2_3.setBounds(277, 471, 75, 61);
		contentPane.add(btnNewButton_1_2_3);
		
		JButton btnNewButton_1_5_1 = new JButton("0");
		btnNewButton_1_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=num+0;
				textArea.setText(num);
			}
		});
		btnNewButton_1_5_1.setForeground(Color.BLACK);
		btnNewButton_1_5_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_5_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1_5_1.setBounds(117, 471, 75, 61);
		contentPane.add(btnNewButton_1_5_1);
		
		JButton btnNewButton_1_2_4 = new JButton("x");
		btnNewButton_1_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button = 3;
				if(num!="")             //obtain the first operand
				{
				textArea.setText("");
				n1 = Double.parseDouble(num);    //convert string in to
				num="";                           //double & store it in n1
				}
				else
				{
				textArea.setText("");
				}
			}
		});
		btnNewButton_1_2_4.setForeground(Color.BLACK);
		btnNewButton_1_2_4.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnNewButton_1_2_4.setBackground(new Color(0, 191, 255));
		btnNewButton_1_2_4.setBounds(277, 397, 75, 61);
		contentPane.add(btnNewButton_1_2_4);
	}
}
