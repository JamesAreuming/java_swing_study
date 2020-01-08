package java_swing_study.p530_533;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Exam08_star extends JPanel {
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;

	/**
	 * Create the panel.
	 */
	public Exam08_star() {

		initialize();
	}
	private void initialize() {
		setForeground(Color.RED);
		setBackground(Color.YELLOW);
		setLayout(null);
		
		lblNewLabel_1 = new JLabel("★");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(118, 128, 20, 15);
		add(lblNewLabel_1);
		
		label = new JLabel("★");
		label.setForeground(Color.RED);
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(308, 113, 20, 15);
		add(label);
		
		label_1 = new JLabel("★");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		label_1.setBounds(159, 75, 20, 15);
		add(label_1);
		
		label_2 = new JLabel("★");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		label_2.setBounds(91, 203, 20, 15);
		add(label_2);
		
		label_3 = new JLabel("★");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("굴림", Font.PLAIN, 20));
		label_3.setBounds(322, 201, 20, 15);
		add(label_3);
		
		label_4 = new JLabel("★");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("굴림", Font.PLAIN, 20));
		label_4.setBounds(192, 194, 20, 15);
		add(label_4);
		
		label_5 = new JLabel("★");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("굴림", Font.PLAIN, 20));
		label_5.setBounds(58, 151, 20, 15);
		add(label_5);
		
		label_6 = new JLabel("★");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("굴림", Font.PLAIN, 20));
		label_6.setBounds(211, 128, 20, 15);
		add(label_6);
		
		label_7 = new JLabel("★");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("굴림", Font.PLAIN, 20));
		label_7.setBounds(375, 63, 20, 15);
		add(label_7);
		
		label_8 = new JLabel("★");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("굴림", Font.PLAIN, 20));
		label_8.setBounds(231, 256, 20, 15);
		add(label_8);
	}

}
