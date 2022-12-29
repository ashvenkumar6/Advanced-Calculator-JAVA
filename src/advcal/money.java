package advcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class money extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					money frame = new money();
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
	public money() {
		setTitle("Finance");
		setBounds(100, 100, 380, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Currency");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CurrencyConv();
				CurrencyConv.n16();
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBackground(new Color(153, 153, 255));
		btnNewButton.setBounds(33, 115, 89, 63);
		contentPane.add(btnNewButton);
		
		JButton btnGst = new JButton("GST");
		btnGst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GSTcal();
				GSTcal.n17();
			}
		});
		btnGst.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 13));
		btnGst.setBackground(new Color(153, 153, 255));
		btnGst.setBounds(144, 115, 89, 63);
		contentPane.add(btnGst);
		
		JButton btnLoan = new JButton("Loan");
		btnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoanCal();
				LoanCal.n18();
			}
		});
		btnLoan.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 13));
		btnLoan.setBackground(new Color(153, 153, 255));
		btnLoan.setBounds(255, 115, 89, 63);
		contentPane.add(btnLoan);
	}
}
