package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Components extends JFrame {

	private JPanel contentPane;
	private JTextField txtF1;
	private JTextField txtF2;
	private JTextField txtF3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Components frame = new Components();
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
	public Components() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setBounds(24, 21, 126, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(34, 53, 116, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(30, 81, 93, 29);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(117, 81, 93, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "일반대화상자", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(204, 81, 93, 29);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				if (answer == JOptionPane.YES_NO_OPTION) {
					System.out.println("YES 클릭...");
				}else {
					System.out.println("NO 클릭...");
				}
			}
		});
		btn4.setBounds(291, 81, 93, 29);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 컴포넌트");
		lblNewLabel_2.setBounds(34, 140, 116, 16);
		contentPane.add(lblNewLabel_2);
		
		txtF1 = new JTextField();
		txtF1.setBounds(44, 176, 130, 26);
		contentPane.add(txtF1);
		txtF1.setColumns(10);
		
		txtF2 = new JTextField();
		txtF2.setColumns(10);
		txtF2.setBounds(44, 211, 130, 26);
		contentPane.add(txtF2);
		
		txtF3 = new JTextField();
		txtF3.setColumns(10);
		txtF3.setBounds(44, 249, 130, 26);
		contentPane.add(txtF3);
		
		JLabel lblTxtf1Result = new JLabel("결과: ");
		lblTxtf1Result.setBounds(269, 181, 130, 16);
		contentPane.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과: ");
		lblTxtf2Result.setBounds(269, 216, 115, 16);
		contentPane.add(lblTxtf2Result);
		
		JLabel lblTxt3Result = new JLabel("결과: ");
		lblTxt3Result.setBounds(269, 254, 115, 16);
		contentPane.add(lblTxt3Result);
		
		JButton btnTxtf1 = new JButton("확인");
		btnTxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtF1.getText();
				lblTxtf1Result.setText("결과: " +txt);
			}
		});
		btnTxtf1.setBounds(170, 176, 98, 29);
		contentPane.add(btnTxtf1);
		
		JButton btnTxtf2 = new JButton("확인");
		btnTxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtF2.getText();
				lblTxtf2Result.setText("결과: " +txt);
			}
		});
		btnTxtf2.setBounds(170, 211, 98, 29);
		contentPane.add(btnTxtf2);
		
		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtF3.getText();
				lblTxt3Result.setText("결과: "+txt);
			}
		});
		btnTxtf3.setBounds(170, 249, 98, 29);
		contentPane.add(btnTxtf3);
		
		JLabel lblNewLabel_3 = new JLabel("취미를 고르시오");
		lblNewLabel_3.setBounds(44, 331, 106, 16);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(44, 359, 61, 23);
		contentPane.add(chk1);
		
		JLabel lblNewLabel_4 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_4.setBounds(34, 303, 116, 16);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(105, 359, 61, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(166, 359, 61, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(228, 359, 61, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(291, 359, 61, 23);
		contentPane.add(chk5);
		
		JLabel lblchkResult = new JLabel("결과: ");
		lblchkResult.setBounds(54, 394, 286, 16);
		contentPane.add(lblchkResult);
		
		JButton btnchk = new JButton("확인");
		btnchk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> list = new ArrayList<>();
				
				if(chk1.isSelected()) {
					list.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					list.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					list.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					list.add(chk5.getText());
				}
				if(chk5.isSelected()) {
					list.add(chk5.getText());
				}
				
				lblchkResult.setText("결과: "+list);
				
				
				
			}
		});
		btnchk.setBounds(364, 358, 70, 29);
		contentPane.add(btnchk);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(34, 436, 140, 16);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdb1 = new JRadioButton("Male");
		rdb1.setBounds(44, 464, 70, 23);
		contentPane.add(rdb1);
		
		JRadioButton rdb2 = new JRadioButton("Female");
		rdb2.setBounds(140, 464, 93, 23);
		contentPane.add(rdb2);
		
		JLabel rdbResult = new JLabel("결과: ");
		rdbResult.setBounds(54, 499, 286, 16);
		contentPane.add(rdbResult);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdb1);
		bg.add(rdb2);
				
				
		JButton rdbc = new JButton("확인");
		rdbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdb1.isSelected()) {
					rdbResult.setText("결과: Male");
				}else {
					rdbResult.setText("결과: Female");
				}
				
				

			}
		});
		rdbc.setBounds(245, 463, 70, 29);
		contentPane.add(rdbc);
		
		
		
		
		
	}
}
