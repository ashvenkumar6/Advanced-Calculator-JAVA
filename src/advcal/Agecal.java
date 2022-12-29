package advcal;

import java.awt.EventQueue;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agecal extends JFrame {
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
	public static void n6() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agecal frame = new Agecal();
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
	public Agecal() {
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
		setTitle("Age");
		setBounds(100, 100, 343, 393);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel birthdate = new JLabel("Date of Birth");
		birthdate.setHorizontalAlignment(SwingConstants.CENTER);
		birthdate.setFont(new Font("Dialog", Font.BOLD, 15));
		birthdate.setBounds(60, 26, 208, 36);
		contentPane.add(birthdate);
		
		JLabel todaydate = new JLabel("Today's Date");
		todaydate.setHorizontalAlignment(SwingConstants.CENTER);
		todaydate.setFont(new Font("Dialog", Font.BOLD, 15));
		todaydate.setBounds(60, 113, 208, 36);
		contentPane.add(todaydate);
		
		
		
		JComboBox<Integer> dayOfBirth = new JComboBox<Integer>(days);
		dayOfBirth.setFont(new Font("Dialog", Font.BOLD, 15));
		dayOfBirth.setBounds(60, 61, 57, 25);
		contentPane.add(dayOfBirth);
		
		JComboBox<?> monthOfBirth= new JComboBox<Object>(months);
		monthOfBirth.setFont(new Font("Dialog", Font.BOLD, 15));
		monthOfBirth.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String month = monthOfBirth.getSelectedItem().toString();

                if (month.equals("Jan") || month.equals("Mar") || month.equals("May")
                        || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
                    for (int i = 1; i <= 31; i++) {
                        dayOfBirth.addItem(i);
                    }
                } else if (month.equals("Feb")) {
                    for (int i = 1; i <= 28; i++) {
                        dayOfBirth.addItem(i);
                    }
                } else {
                    for (int i = 1; i <= 30; i++) {
                        dayOfBirth.addItem(i);
                    }
                }
			}
		});
		monthOfBirth.setBounds(126, 61, 57, 25);
		contentPane.add(monthOfBirth);
		
		JComboBox<?> yearOfBirth = new JComboBox<Object>(years);
		yearOfBirth.setFont(new Font("Dialog", Font.BOLD, 15));
		yearOfBirth.setBounds(195, 61, 73, 25);
		yearOfBirth.setSelectedItem(2000);
		contentPane.add(yearOfBirth);
		
		JComboBox<Integer> dayOfToday = new JComboBox<Integer>(days);
		dayOfToday.setFont(new Font("Dialog", Font.BOLD, 15));
		dayOfToday.setBounds(60, 162, 57, 25);
		contentPane.add(dayOfToday);
		
		JComboBox<?> monthOfToday = new JComboBox<Object>(months);
		monthOfToday.setFont(new Font("Dialog", Font.BOLD, 15));
		monthOfToday.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String month = monthOfToday.getSelectedItem().toString();

                if (month.equals("Jan") || month.equals("Mar") || month.equals("May")
                        || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
                    for (int i = 1; i <= 31; i++) {
                        dayOfToday.addItem(i);
                    }
                } else if (month.equals("Feb")) {
                    for (int i = 1; i <= 28; i++) {
                        dayOfToday.addItem(i);
                    }
                } else {
                    for (int i = 1; i <= 30; i++) {
                        dayOfToday.addItem(i);
                    }
                }
			}
		});
        monthOfToday.setSelectedItem("Dec");
		monthOfToday.setBounds(126, 162, 57, 25);
		contentPane.add(monthOfToday);
		
		JComboBox<?> yearOfToday= new JComboBox<Object>(years);
		yearOfToday.setFont(new Font("Dialog", Font.BOLD, 15));
		yearOfToday.setBounds(195, 162, 73, 25);
        yearOfToday.setSelectedItem(2022);
		contentPane.add(yearOfToday);
		
		todaydate.setEnabled(false);
        dayOfToday.setEnabled(false);
        monthOfToday.setEnabled(false);
        yearOfToday.setEnabled(false);
		
		JLabel Result = new JLabel("");
		Result.setFont(new Font("Dialog", Font.BOLD, 15));
		Result.setBackground(new Color(238, 238, 238));
		Result.setHorizontalAlignment(SwingConstants.CENTER);
		Result.setBounds(12, 269, 305, 40);
		contentPane.add(Result);
		
		JCheckBox datestate = new JCheckBox("New check box");
		datestate.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (datestate.isSelected()) {
                    todaydate.setEnabled(true);
                    dayOfToday.setEnabled(true);
                    monthOfToday.setEnabled(true);
                    yearOfToday.setEnabled(true);
                } else {
                    todaydate.setEnabled(false);
                    dayOfToday.setEnabled(false);
                    monthOfToday.setEnabled(false);
                    yearOfToday.setEnabled(false);
                }
			}
		});
	    datestate.setBackground(Color.LIGHT_GRAY);
	    datestate.setBounds(96, 120, 21, 24);
	    contentPane.add(datestate);
		
        JButton calculateAge = new JButton("Calculate");
		calculateAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = "";

                y1 = yearOfBirth.getSelectedIndex() + 1;
                m1 = monthOfBirth.getSelectedIndex() + 1;
                d1 = dayOfBirth.getSelectedIndex() + 1;

                if (datestate.isSelected()) {
                    y2 = yearOfToday.getSelectedIndex() + 1;
                    m2 = monthOfToday.getSelectedIndex() + 1;
                    d2 = dayOfToday.getSelectedIndex() + 1;
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
		calculateAge.setBackground(new Color(255, 128, 128));
		calculateAge.setFont(new Font("Dialog", Font.BOLD, 15));
		calculateAge.setBounds(87, 231, 142, 26);
		contentPane.add(calculateAge);
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
