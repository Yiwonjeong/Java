package sub1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.DimensionUIResource;

/*
 * 날짜 : 2022/09/22
 * 이름 : 이원정
 * 내용 : 자바 Swing 실습하기
 */
public class HelloSwing {
	public static void main(String[] args) {
		
		// 창 만들기 (기본 코드)
		JFrame frame = new JFrame ("Hello Swing");
		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setVisible(true);
		
		// 라벨 컴포넌트
		Container pane = frame.getContentPane();
		JLabel label = new JLabel("Hello Java Swing!");
		pane.add(label);
		
		// 버튼 컴포넌트
		JButton button = new JButton("확인");
		button.setPreferredSize(new DimensionUIResource(60, 20));
		pane.add(button); 
		
	}
}
