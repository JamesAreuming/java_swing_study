package java_swing_study.p530_533;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;

public class Exam07_Cal extends JPanel {
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;

	/**
	 * Create the panel.
	 */
	public Exam07_Cal() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 4, 10, 10));
		
		btn0 = new JButton("0");
		btn0.setBackground(SystemColor.activeCaption);
		btn0.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn0);
		
		btn1 = new JButton("1");
		btn1.setBackground(SystemColor.activeCaption);
		btn1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBackground(SystemColor.activeCaption);
		btn2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBackground(SystemColor.activeCaption);
		btn3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBackground(SystemColor.activeCaption);
		btn4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBackground(SystemColor.activeCaption);
		btn5.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBackground(SystemColor.activeCaption);
		btn6.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn6);
		
		btn7 = new JButton("7");
		btn7.setBackground(SystemColor.activeCaption);
		btn7.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBackground(SystemColor.activeCaption);
		btn8.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBackground(SystemColor.activeCaption);
		btn9.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn9);
		
		btn10 = new JButton("CE");
		btn10.setBackground(SystemColor.activeCaption);
		btn10.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn10);
		
		btn11 = new JButton("계산");
		btn11.setBackground(SystemColor.activeCaption);
		btn11.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn11);
		
		btn12 = new JButton("+");
		btn12.setBackground(SystemColor.textHighlight);
		btn12.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn12);
		
		btn13 = new JButton("-");
		btn13.setBackground(SystemColor.textHighlight);
		btn13.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn13);
		
		btn14 = new JButton("X");
		btn14.setBackground(SystemColor.textHighlight);
		btn14.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn14);
		
		btn15 = new JButton("/");
		btn15.setBackground(SystemColor.textHighlight);
		btn15.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		add(btn15);
	}

}
