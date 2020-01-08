package java_swing_study.p530_533;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

@SuppressWarnings("serial")
public class Exam02 extends JFrame {

	private JPanel contentPane;
	private JButton btnNorth;
	private JButton btnCenter;
	private JButton btnEast;
	private JButton btnWest;
	private JButton btnSouth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exam02 frame = new Exam02();
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
	public Exam02() {
		initialize();
	}
	private void initialize() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(5, 7));
		
		btnNorth = new JButton("North");
		btnNorth.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnNorth, BorderLayout.NORTH);
		
		btnCenter = new JButton("Center");
		btnCenter.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnCenter, BorderLayout.CENTER);
		
		btnEast = new JButton("East");
		btnEast.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnEast, BorderLayout.EAST);
		
		btnWest = new JButton("West");
		btnWest.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnWest, BorderLayout.WEST);
		
		btnSouth = new JButton("South");
		btnSouth.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnSouth, BorderLayout.SOUTH);
	}

}
