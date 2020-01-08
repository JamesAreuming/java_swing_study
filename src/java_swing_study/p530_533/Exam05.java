package java_swing_study.p530_533;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;

public class Exam05 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl0;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel lbl9;
	private JLabel lbl10;
	private JLabel lbl11;
	private JLabel lbl12;
	private JLabel lbl13;
	private JLabel lbl14;
	private JLabel lbl15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exam05 frame = new Exam05();
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
	public Exam05() {
		initialize();
	}
	private void initialize() {
		setTitle("4X4 Color Fame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 0, 0));
		
		lbl0 = new JLabel("0");
		lbl0.setOpaque(true);
		lbl0.setBackground(Color.red);
		contentPane.add(lbl0);
		
		lbl1 = new JLabel("1");
		lbl1.setOpaque(true);
		lbl1.setBackground(Color.ORANGE);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("2");
		lbl2.setOpaque(true);
		lbl2.setBackground(Color.YELLOW);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("3");
		lbl3.setOpaque(true);
		lbl3.setBackground(Color.GREEN);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("4");
		lbl4.setOpaque(true);
		lbl4.setBackground(Color.CYAN);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("5");
		lbl5.setOpaque(true);
		lbl5.setBackground(Color.BLUE);
		contentPane.add(lbl5);
		
		lbl6 = new JLabel("6");
		lbl6.setOpaque(true);
		lbl6.setBackground(Color.MAGENTA);
		contentPane.add(lbl6);
		
		lbl7 = new JLabel("7");
		lbl7.setOpaque(true);
		lbl7.setBackground(Color.DARK_GRAY);
		contentPane.add(lbl7);
		
		lbl8 = new JLabel("8");
		lbl8.setOpaque(true);
		lbl8.setBackground(Color.PINK);
		contentPane.add(lbl8);
		
		lbl9 = new JLabel("9");
		lbl9.setOpaque(true);
		lbl9.setBackground(Color.LIGHT_GRAY);
		contentPane.add(lbl9);
		
		lbl10 = new JLabel("10");
		lbl10.setOpaque(true);
		lbl10.setBackground(Color.WHITE);
		contentPane.add(lbl10);
		
		lbl11 = new JLabel("11");
		lbl11.setOpaque(true);
		lbl11.setBackground(Color.GRAY);
		contentPane.add(lbl11);
		
		lbl12 = new JLabel("12");
		lbl12.setOpaque(true);
		lbl12.setBackground(Color.BLACK);
		contentPane.add(lbl12);
		
		lbl13 = new JLabel("13");
		lbl13.setOpaque(true);
		lbl13.setBackground(Color.ORANGE);
		contentPane.add(lbl13);
		
		lbl14 = new JLabel("14");
		lbl14.setOpaque(true);
		lbl14.setBackground(Color.BLUE);
		contentPane.add(lbl14);
		
		lbl15 = new JLabel("15");
		lbl15.setOpaque(true);
		lbl15.setBackground(Color.MAGENTA);
		contentPane.add(lbl15);
	}

}
