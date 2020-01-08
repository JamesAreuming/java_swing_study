package java_swing_study.chap09.layout;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java_swing_study.chap09.layout.openchallenge.OpenChallengeEx;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class LayoutMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Object object;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton btnOpenchallenge;
	private JButton button_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutMain frame = new LayoutMain();
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
	public LayoutMain() {
		initialize();
	}
	private void initialize() {
		setTitle("배치레이아웃예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "레이아웃 예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		button = new JButton("FlowLayout");
		contentPane.add(button);
		
		button_1 = new JButton("BorderLayout");
		contentPane.add(button_1);
		
		button_2 = new JButton("GridLayout");
		contentPane.add(button_2);
		
		button_4 = new JButton("AbsoluteLayout");
		button_4.addActionListener(this);
		contentPane.add(button_4);
		
		btnOpenchallenge = new JButton("OpenChallenge");
		contentPane.add(btnOpenchallenge);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button_4) {
			button_4ActionPerformed(e);
		}
	}
	protected void button_4ActionPerformed(ActionEvent e) {
		AbsoluteLayoutEx frame = new AbsoluteLayoutEx();
		contentPane.add(frame);
	}
}
