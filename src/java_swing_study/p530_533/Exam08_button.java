package java_swing_study.p530_533;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;

public class Exam08_button extends JPanel {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;

	/**
	 * Create the panel.
	 */
	public Exam08_button() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.textInactiveText);
		
		btn1 = new JButton("열기");
		btn1.setBackground(SystemColor.inactiveCaption);
		btn1.setFont(new Font("굴림", Font.BOLD, 20));
		add(btn1);
		
		btn2 = new JButton("닫기");
		btn2.setBackground(SystemColor.inactiveCaption);
		btn2.setFont(new Font("굴림", Font.BOLD, 20));
		add(btn2);
		
		btn3 = new JButton("나가기");
		btn3.setBackground(SystemColor.inactiveCaption);
		btn3.setFont(new Font("굴림", Font.BOLD, 20));
		add(btn3);
	}

}
