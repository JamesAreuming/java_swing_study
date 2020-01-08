package java_swing_study.chap09.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AbsoluteLayoutEx extends JFrame {

	private JPanel contentPane;

	public AbsoluteLayoutEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		la = new JLabel("Hello, Press buttons");
		
		for(int i=1;i<10;i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setBounds(i*15, i*15, 50, 20);
			contentPane.add(btn);
		}
	}

}
