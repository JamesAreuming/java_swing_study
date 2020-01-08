package java_swing_study.p530_533;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.GridLayout;

public class Exam08_inPut extends JPanel {
	private JButton btnNewButton;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Exam08_inPut() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(204, 204, 51));
		setLayout(null);
		
		btnNewButton = new JButton("Word Input");
		btnNewButton.setBounds(39, 3, 152, 45);
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(225, 3, 213, 48);
		add(textField);
		textField.setColumns(10);
	}

}
