package java_swing_study02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ContentPaneEx extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public ContentPaneEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300); // (x좌표,y좌표,whidth,height)
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); //비워있는 보더(상하좌우, 패딩)
		contentPane.setLayout(new BorderLayout(0, 0)); // BorderLayout : 총 5영역이 있다, 0,0 갭
		setContentPane(contentPane); // JFrame안에 넣어라
	}

}
