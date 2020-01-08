package java_swing_study.p530_533;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java_swing_study.p530_533.Exam02;

import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MainEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnExam02;
	private JButton btnExam03;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEx frame = new MainEx();
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
	public MainEx() {
		initialize();
	}
	private void initialize() {
		setTitle("실습문제(p530-533)");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		
		btnExam02 = new JButton("실습문제2번");
		btnExam02.setFont(new Font("궁서", Font.BOLD, 20));
		btnExam02.setBackground(Color.YELLOW);
		btnExam02.addActionListener(this);
		contentPane.add(btnExam02);
		
		btnExam03 = new JButton("실습문제4번");
		btnExam03.addActionListener(this);
		btnExam03.setBackground(Color.RED);
		btnExam03.setFont(new Font("궁서", Font.BOLD, 20));
		contentPane.add(btnExam03);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnExam03) {
			btnExam03ActionPerformed(e);
		}
		if (e.getSource() == btnExam02) {
			btnExam02ActionPerformed(e);
		}
	}
	private void btnExam02ActionPerformed(ActionEvent e) {
		Exam02 frame = new Exam02(); 
		frame.setVisible(true);
	}

	protected void btnExam03ActionPerformed(ActionEvent e) {
		Exam04 frame = new Exam04();
		frame.setVisible(true);
	}
}
