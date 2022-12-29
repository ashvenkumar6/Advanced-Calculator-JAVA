package advcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {
//Hi
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Advanced Calculator");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Numerical");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new numerical();
				numerical.main();
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setBounds(30, 100, 100, 60);
		contentPane.add(btnNewButton);
		
		JButton btnConversions = new JButton("Conversions");
		btnConversions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new convert();
				convert.main();
			}
		});
		btnConversions.setBackground(new Color(0, 128, 192));
		btnConversions.setBounds(161, 100, 108, 60);
		contentPane.add(btnConversions);
		
		JButton btnFinances = new JButton("Finances");
		btnFinances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new money();
				money.main();
			}
		});
		btnFinances.setBackground(new Color(0, 128, 192));
		btnFinances.setBounds(300, 100, 100, 60);
		contentPane.add(btnFinances);
	}
}
