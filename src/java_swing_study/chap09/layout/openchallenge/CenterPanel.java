package java_swing_study.chap09.layout.openchallenge;

import javax.swing.JPanel;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CenterPanel extends JPanel {
	private JLabel lbHello;
	private JLabel lbLove;
	private JLabel lbJava;

	/**
	 * Create the panel.
	 */
	public CenterPanel() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		lbHello = new JLabel("Hello");
		lbHello.setBounds(158, 69, 57, 15);
		add(lbHello);
		
		lbLove = new JLabel("Love");
		lbLove.setBounds(303, 150, 57, 15);
		add(lbLove);
		
		lbJava = new JLabel("Java");
		lbJava.setBounds(111, 191, 57, 15);
		add(lbJava);
	}
}
