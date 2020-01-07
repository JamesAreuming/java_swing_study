package java_swing_study.chap09.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FlowLayoutEx extends JFrame {

	private JPanel contentPane;
	private JButton btnAdd;
	private JButton btnMul;
	private JButton btnSub;
	private JButton btnCalculate;
	private JButton btnDiv;

	
	public FlowLayoutEx() {
		initialize();
	}
	private void initialize() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		btnAdd = new JButton("add");
		contentPane.add(btnAdd);
		
		btnSub = new JButton("sub");
		contentPane.add(btnSub);
		
		btnMul = new JButton("mul");
		contentPane.add(btnMul);
		
		btnDiv = new JButton("div");
		contentPane.add(btnDiv);
		
		btnCalculate = new JButton("Calculate");
		contentPane.add(btnCalculate);
	}

}
