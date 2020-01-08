package java_swing_study.p530_533;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;

public class Exam07_output extends JPanel {
	private JLabel label;
	private JTextField tfOutput;

	/**
	 * Create the panel.
	 */
	public Exam07_output() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(204, 204, 0));
		setLayout(null);
		
		label = new JLabel("계산 결과");
		label.setBounds(12, 6, 146, 43);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("굴림", Font.BOLD, 20));
		add(label);
		
		tfOutput = new JTextField();
		tfOutput.setBounds(170, 6, 203, 43);
		tfOutput.setColumns(10);
		add(tfOutput);
	}

}
