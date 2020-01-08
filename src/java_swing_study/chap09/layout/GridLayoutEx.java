package java_swing_study.chap09.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class GridLayoutEx extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblname;
	private JTextField textField_1;
	private JLabel lbldept;
	private JTextField textField_2;
	private JLabel lblsubj;
	private JTextField textField_3;

	public GridLayoutEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setSize(329, 224);
		//setLocation(100, 100);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 20, 5));
		
		lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblname = new JLabel("학번");
		lblname.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblname);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		lbldept = new JLabel("학과");
		lbldept.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbldept);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		lblsubj = new JLabel("과목");
		lblsubj.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblsubj);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3);
	}

}
