package java_swing_study.chap09.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LayoutMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnFlowlayout;
	private JButton btnlborderayout;

	public LayoutMain() {
		initialize();
	}
	private void initialize() {
		setTitle("배치레이아웃해제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnFlowlayout = new JButton("Flowlayout");
		btnFlowlayout.addActionListener(this);
		contentPane.add(btnFlowlayout);
		
		btnlborderayout = new JButton("borderlayout");
		btnlborderayout.addActionListener(this);
		contentPane.add(btnlborderayout);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnlborderayout) {
			btnlborderayoutActionPerformed(e);
		}
		if (e.getSource() == btnFlowlayout) {
			btnFlowlayoutActionPerformed(e);
		}
	}
	protected void btnFlowlayoutActionPerformed(ActionEvent e) {
		FlowLayoutEx frame = new FlowLayoutEx();
		frame.setVisible(true);
	}
	protected void btnlborderayoutActionPerformed(ActionEvent e) {
		BorderLayoutEx frame = new BorderLayoutEx();
		frame.setVisible(true);
	}
}
