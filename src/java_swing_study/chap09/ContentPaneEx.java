package java_swing_study.chap09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); //FlowLayout 좌에서 우로 배치
		
		contentPane.add(new JButton("OK")); //추가 : OK버튼
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}