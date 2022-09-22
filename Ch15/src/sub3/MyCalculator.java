package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textDisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
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
	public MyCalculator() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("MyCalculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textDisp = new JTextField();
		textDisp.setEditable(false);
		textDisp.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		textDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisp.setText("0");
		textDisp.setBounds(20, 20, 272, 60);
		contentPane.add(textDisp);
		textDisp.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(15, 96, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(87, 96, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(159, 96, 60, 60);
		contentPane.add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(231, 96, 60, 60);
		contentPane.add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(16, 168, 60, 60);
		contentPane.add(btn4);
		
		JButton btn6 = new JButton("5");
		btn6.setBounds(88, 168, 60, 60);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("6");
		btn5.setBounds(160, 168, 60, 60);
		contentPane.add(btn5);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setBounds(232, 168, 60, 60);
		contentPane.add(btnMulti);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setBounds(16, 240, 60, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(88, 240, 60, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(160, 240, 60, 60);
		contentPane.add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(232, 240, 60, 60);
		contentPane.add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(16, 312, 60, 60);
		contentPane.add(btn0);
		
		JButton btnCancel = new JButton("C");
		btnCancel.setBounds(88, 312, 60, 60);
		contentPane.add(btnCancel);
		
		JButton btnEq = new JButton("=");
		btnEq.setBounds(160, 312, 60, 60);
		contentPane.add(btnEq);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(232, 312, 60, 60);
		contentPane.add(btnPlus);
	}

}
