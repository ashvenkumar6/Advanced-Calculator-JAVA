package advcal;

import java.awt.EventQueue;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DateCal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int d1, d2, m1, m2, y1, y2;
    LocalDate startDate, endDate;
    long daysCounter, monthsCounter, yearsCounter;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void n8() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateCal frame = new DateCal();
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
	public DateCal() {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
	            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	        Integer[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
	            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
	            21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

	        int currentYear = LocalDate.now().getYear();
	        Integer[] years = new Integer[currentYear];

	        for (int i = 0; i < years.length; i++) {
	            years[i] = i + 1;
	        }
	        
		setTitle("Date");
		setBounds(100, 100, 369, 382);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fromdate = new JLabel("From Date");
		fromdate.setHorizontalAlignment(SwingConstants.CENTER);
		fromdate.setFont(new Font("Dialog", Font.BOLD, 15));
		fromdate.setBounds(74, 12, 208, 36);
		contentPane.add(fromdate);
		
		JComboBox<Integer> dayOffrom = new JComboBox<Integer>(days);
		dayOffrom.setFont(new Font("Dialog", Font.BOLD, 15));
		dayOffrom.setBounds(74, 47, 57, 25);
		contentPane.add(dayOffrom);
		
		JComboBox<?> monthOffrom = new JComboBox<Object>(months);
		monthOffrom.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String month = monthOffrom.getSelectedItem().toString();

                if (month.equals("Jan") || month.equals("Mar") || month.equals("May")
                        || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
                    for (int i = 1; i <= 31; i++) {
                        dayOffrom.addItem(i);
                    }
                } else if (month.equals("Feb")) {
                    for (int i = 1; i <= 28; i++) {
                        dayOffrom.addItem(i);
                    }
                } else {
                    for (int i = 1; i <= 30; i++) {
                        dayOffrom.addItem(i);
                    }
                }
			}
		});
		monthOffrom.setFont(new Font("Dialog", Font.BOLD, 15));
		monthOffrom.setBounds(140, 47, 57, 25);
		contentPane.add(monthOffrom);
		
		JComboBox<?> yearOffrom = new JComboBox<Object>(years);
		yearOffrom.setFont(new Font("Dialog", Font.BOLD, 15));
		yearOffrom.setBounds(209, 47, 73, 25);
		yearOffrom.setSelectedItem(2000);
		contentPane.add(yearOffrom);
		
		JLabel todaydate = new JLabel("To Date");
		todaydate.setHorizontalAlignment(SwingConstants.CENTER);
		todaydate.setFont(new Font("Dialog", Font.BOLD, 15));
		todaydate.setEnabled(false);
		todaydate.setBounds(74, 99, 208, 36);
		contentPane.add(todaydate);
		
		JComboBox<Integer> dayOfTo = new JComboBox<Integer>(days);
		dayOfTo.setFont(new Font("Dialog", Font.BOLD, 15));
		dayOfTo.setEnabled(false);
		dayOfTo.setBounds(74, 148, 57, 25);
		contentPane.add(dayOfTo);
		
		JComboBox<?> monthOfTo = new JComboBox<Object>(months);
		monthOfTo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String month = monthOfTo.getSelectedItem().toString();

                if (month.equals("Jan") || month.equals("Mar") || month.equals("May")
                        || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
                    for (int i = 1; i <= 31; i++) {
                        dayOfTo.addItem(i);
                    }
                } else if (month.equals("Feb")) {
                    for (int i = 1; i <= 28; i++) {
                        dayOfTo.addItem(i);
                    }
                } else {
                    for (int i = 1; i <= 30; i++) {
                        dayOfTo.addItem(i);
                    }
                }
			}
		});
		monthOfTo.setFont(new Font("Dialog", Font.BOLD, 15));
		monthOfTo.setEnabled(false);
		monthOfTo.setSelectedItem(2022);
		monthOfTo.setBounds(140, 148, 57, 25);
		contentPane.add(monthOfTo);
		
		JComboBox<?> yearOfTo = new JComboBox<Object>(years);
		yearOfTo.setFont(new Font("Dialog", Font.BOLD, 15));
		yearOfTo.setEnabled(false);
		yearOfTo.setSelectedItem(2022);
		yearOfTo.setBounds(209, 148, 73, 25);
		contentPane.add(yearOfTo);
		
		JLabel Result = new JLabel("");
		Result.setHorizontalAlignment(SwingConstants.CENTER);
		Result.setFont(new Font("Dialog", Font.BOLD, 15));
		Result.setBackground(UIManager.getColor("Button.background"));
		Result.setBounds(26, 255, 305, 40);
		contentPane.add(Result);
		
		JCheckBox datestate = new JCheckBox("New check box");
		datestate.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (datestate.isSelected()) {
                    todaydate.setEnabled(true);
                    dayOfTo.setEnabled(true);
                    monthOfTo.setEnabled(true);
                    yearOfTo.setEnabled(true);
                } else {
                    todaydate.setEnabled(false);
                    dayOfTo.setEnabled(false);
                    monthOfTo.setEnabled(false);
                    yearOfTo.setEnabled(false);
                }
			}
		});
		datestate.setBackground(Color.LIGHT_GRAY);
		datestate.setBounds(128, 106, 21, 24);
		contentPane.add(datestate);
		
		JButton calculateDate = new JButton("Calculate");
		calculateDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = "";

                y1 = yearOffrom.getSelectedIndex() + 1;
                m1 = monthOffrom.getSelectedIndex() + 1;
                d1 = dayOffrom.getSelectedIndex() + 1;

                if (datestate.isSelected()) {
                    y2 = yearOfTo.getSelectedIndex() + 1;
                    m2 = monthOfTo.getSelectedIndex() + 1;
                    d2 = dayOfTo.getSelectedIndex() + 1;
                } else {
                    y2 = LocalDate.now().getYear();
                    m2 = LocalDate.now().getMonthValue();
                    d2 = LocalDate.now().getDayOfMonth();
                }

                startDate = LocalDate.of(y1, m1, d1);
                endDate = LocalDate.of(y2, m2, d2);

                yearsCounter = Period.between(startDate, endDate).getYears();
                monthsCounter = Period.between(startDate, endDate).getMonths();
                daysCounter = Period.between(startDate, endDate).getDays();
                text=diffcal(yearsCounter,monthsCounter,daysCounter,startDate,endDate);
                Result.setText(text);
			}
		});
		calculateDate.setFont(new Font("Dialog", Font.BOLD, 15));
		calculateDate.setBackground(new Color(255, 128, 128));
		calculateDate.setBounds(101, 217, 142, 26);
		contentPane.add(calculateDate);
		
	}
	public String diffcal(long yc,long mc,long dc,LocalDate sd,LocalDate ed)
    {
    String text1=new String();
    if (yc == 0 && mc == 0 && dc == 0) 
    {
        text1="Cannot compare same date!";
    } 
    else if (!Period.between(sd, ed).isNegative()) 
    {

        if (yc == 1) {
            text1 += yc + " year ";
        } else if (yc > 1) {
            text1 += yc + " years ";
        }

        if (mc == 1) {
            if (yc > 0 && dc > 0) {
                text1 += ", " + mc + " month ";
            } else if (yc > 0 && dc == 0) {
                text1 += "and " + mc + " month ";
            } else {
                text1 += mc + " month ";
            }
        }

        if (mc > 1) {
            if (yc > 0 && dc > 0) {
                text1 += ", " + mc + " months ";
            } else if (yc > 0 && dc == 0) {
                text1 += "and " + mc + " months ";
            } else {
                text1 += mc + " months ";
            }
        }

        if (dc == 1) {
            if (yc == 0 && mc == 0) {
                text1 += dc + " day";
            } else {
                text1 += "and " + dc + " day";
            }
        }

        if (dc > 1) {
            if (yc == 0 && mc == 0) {
                text1 += dc + " days";
            } else {
                text1 += "and " + dc + " days";
            }
        }
       
    } 
    else 
    {
        text1="Logic order of Dates is wrong!";
    }
    return text1;
 }
}
