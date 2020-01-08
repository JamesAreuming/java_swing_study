package java_swing_study.p530_533;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class Exam07 extends JFrame {

	private JPanel contentPane;
	private Exam07_Input pInput;
	private Exam07_Cal exam08_Cal;
	private Exam07_output panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exam07 frame = new Exam07();
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
	public Exam07() {
		initialize();
	}
	private void initialize() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		exam08_Cal = new Exam07_Cal();
		exam08_Cal.setBounds(29, 57, 376, 189);
		contentPane.add(exam08_Cal);
		
		pInput = new Exam07_Input();
		pInput.setBounds(29, 5, 376, 42);
		contentPane.add(pInput);
		
		panel = new Exam07_output();
		panel.setBounds(29, 256, 376, 57);
		contentPane.add(panel);
		panel.setLayout(null);
	}
}
