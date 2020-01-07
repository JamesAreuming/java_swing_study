package java_swing_study02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ContentPaneEx extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnOK;
	private JButton btnCancel;
	private JButton btnIgnore;



	/**
	 * Create the frame.
	 */
	public ContentPaneEx() {
		initialize();
	}
	private void initialize() {
		setTitle("contentPane과 JFrame");
		setBackground(new Color(255, 175, 175));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 104); // (x좌표,y좌표,whidth,height)
		contentPane = new JPanel(); 
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane); // JFrame안에 넣어라
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(this);
		btnOK.setBackground(Color.YELLOW);
		contentPane.add(btnOK);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		btnCancel.setBackground(Color.RED);
		contentPane.add(btnCancel);
		
		btnIgnore = new JButton("Ignore");
		btnIgnore.addActionListener(this);
		btnIgnore.setBackground(Color.MAGENTA);
		contentPane.add(btnIgnore);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		JOptionPane.showMessageDialog(null, e.getActionCommand());
		if (e.getSource() == btnIgnore) {
			btnIgnoreActionPerformed(e);
		}
		if (e.getSource() == btnOK) {
			btnOKActionPerformed(e);
		}
		if (e.getSource() == btnCancel) {
			btnCancelActionPerformed(e);
		}
	}

	protected void btnCancelActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand());
	}
	protected void btnOKActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand());
	}
	protected void btnIgnoreActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand());
	}
}
