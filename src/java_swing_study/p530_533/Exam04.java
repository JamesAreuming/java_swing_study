package java_swing_study.p530_533;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exam04 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnRed;
	private JButton btnOrange;
	private JButton btnYellow;
	private JButton btnGreen;
	private JButton btnCyan;
	private JButton btnBlue;
	private JButton btnMagenta;
	private JButton btnGray;
	private JButton btnPink;
	private JButton btnLightGray;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exam04 frame = new Exam04();
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
	public Exam04() {
		initialize();
	}
	private void initialize() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnRed = new JButton("0");
		btnRed.setBackground(Color.RED);
		btnRed.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnRed);
		
		btnOrange = new JButton("1");
		btnOrange.setBackground(Color.ORANGE);
		btnOrange.addActionListener(this);
		btnOrange.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnOrange);
		
		btnYellow = new JButton("2");
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnYellow);
		
		btnGreen = new JButton("3");
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnGreen);
		
		btnCyan = new JButton("4");
		btnCyan.setBackground(Color.CYAN);
		btnCyan.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnCyan);
		
		btnBlue = new JButton("5");
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnBlue);
		
		btnMagenta = new JButton("6");
		btnMagenta.setBackground(Color.MAGENTA);
		btnMagenta.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnMagenta);
		
		btnGray = new JButton("7");
		btnGray.setBackground(Color.GRAY);
		btnGray.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnGray);
		
		btnPink = new JButton("8");
		btnPink.setBackground(Color.PINK);
		btnPink.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnPink);
		
		btnLightGray = new JButton("9");
		btnLightGray.setBackground(Color.LIGHT_GRAY);
		btnLightGray.setFont(new Font("굴림", Font.BOLD, 12));
		contentPane.add(btnLightGray);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOrange) {
			btnOrangeActionPerformed(e);
		}
	}
	protected void btnOrangeActionPerformed(ActionEvent e) {
	}
}
