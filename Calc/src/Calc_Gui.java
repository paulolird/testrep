import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calc_Gui {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc_Gui window = new Calc_Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc_Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 264, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 230, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_backspace = new JButton("\u2190");
		btn_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				
				if(textField.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length() - 1);
				backspace = strB.toString();
				textField.setText(backspace);
				}
			}
			});
		btn_backspace.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_backspace.setBounds(10, 76, 50, 50);
		frame.getContentPane().add(btn_backspace);
		
		JButton btn_ce = new JButton("C");
		btn_ce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
			}
		});
		btn_ce.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_ce.setBounds(70, 76, 50, 50);
		frame.getContentPane().add(btn_ce);
		
		JButton btn_percent = new JButton("%");
		btn_percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btn_percent.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_percent.setBounds(130, 76, 50, 50);
		frame.getContentPane().add(btn_percent);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btn_plus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_plus.setBounds(190, 76, 50, 50);
		frame.getContentPane().add(btn_plus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber );
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 198, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber );
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 198, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber );
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(130, 198, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn_mult = new JButton("*");
		btn_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btn_mult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_mult.setBounds(190, 198, 50, 50);
		frame.getContentPane().add(btn_mult);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber );
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 259, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber );
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 259, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber );
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 259, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_div.setBounds(190, 259, 50, 50);
		frame.getContentPane().add(btn_div);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber );
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 320, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_dot.setBounds(70, 320, 50, 50);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_plusminus = new JButton("\u00B1");
		btn_plusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops =ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btn_plusminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_plusminus.setBounds(130, 320, 50, 50);
		frame.getContentPane().add(btn_plusminus);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstnum +secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "*")
				{
				result = firstnum * secondnum;
				answer = String.format("%.2f",result);
				textField.setText(answer);
				}
				else if(operations == "/")
				{
				result = firstnum / secondnum;
				answer = String.format("%.2f",result);
				textField.setText(answer);
				}
				else if(operations == "%")
				{
				result = firstnum % secondnum;
				answer = String.format("%.2f",result);
				textField.setText(answer);
				}
				
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_equal.setBounds(190, 320, 50, 50);
		frame.getContentPane().add(btn_equal);
		
		JButton btn7 = new JButton("7");
		btn7.setHorizontalAlignment(SwingConstants.RIGHT);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber );
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 137, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber );
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 137, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 137, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
						
			}
		});
		btn_minus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_minus.setBounds(190, 137, 50, 50);
		frame.getContentPane().add(btn_minus);
	}
}
