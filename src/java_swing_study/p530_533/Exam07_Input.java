package java_swing_study.p530_533;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class Exam07_Input extends JPanel {
	private JLabel lblInput;
	private JTextField tfInput;

	/**
	 * Create the panel.
	 */
	public Exam07_Input() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		lblInput = new JLabel("수식입력 ");
		lblInput.setFont(new Font("굴림", Font.BOLD, 20));
		lblInput.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblInput);
		
		tfInput = new JTextField();
		add(tfInput);
		tfInput.setColumns(10);
	}

}
