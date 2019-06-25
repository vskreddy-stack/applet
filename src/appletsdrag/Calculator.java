package appletsdrag;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField display;
    Double firstnum;
    Double secondnum;
    Double result;
	String operations;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String enternumber=display.getText()+num1.getText();
			display.setText(enternumber);
			}
		});
		num1.setBounds(0, 215, 97, 25);
		frame.getContentPane().add(num1);
		
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternumber=display.getText()+num2.getText();
				display.setText(enternumber);
			}
		});
		num2.setBounds(98, 215, 97, 25);
		frame.getContentPane().add(num2);
		
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternumber=display.getText()+num3.getText();
				display.setText(enternumber);
			}
		});
		num3.setBounds(196, 215, 97, 25);
		frame.getContentPane().add(num3);
		
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternumber=display.getText()+num4.getText();
				display.setText(enternumber);
			}
			
		});
		num4.setBounds(0, 188, 97, 25);
		frame.getContentPane().add(num4);
		
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternumber=display.getText()+num5.getText();
				display.setText(enternumber);
			}
		});
		num5.setBounds(98, 188, 97, 25);
		frame.getContentPane().add(num5);
		
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternumber=display.getText()+num6.getText();
				display.setText(enternumber);
			}
		});
		num6.setBounds(196, 188, 97, 25);
		frame.getContentPane().add(num6);
		
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternumber=display.getText()+num7.getText();
				display.setText(enternumber);
			}
		});
		num7.setBounds(0, 163, 97, 25);
		frame.getContentPane().add(num7);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(98, 177, 41, -22);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternumber=display.getText()+num8.getText();
				display.setText(enternumber);
			}
		});
		num8.setBounds(98, 163, 97, 25);
		frame.getContentPane().add(num8);
		
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternumber=display.getText()+num9.getText();
				display.setText(enternumber);
			}
		});
		num9.setBounds(196, 163, 97, 25);
		frame.getContentPane().add(num9);
		
		JButton num0 = new JButton("0");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enternumber=display.getText()+num0.getText();
				display.setText(enternumber);
			}
		});
		num0.setBounds(98, 139, 97, 25);
		frame.getContentPane().add(num0);
		
		JButton but1 = new JButton("+");
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(display.getText());
				display.setText(firstnum +"+");
				operations="+";
				
				
			}
		});
		but1.setBounds(323, 215, 97, 25);
		frame.getContentPane().add(but1);
		
		JButton but2 = new JButton("-");
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(display.getText());
				display.setText("");
				operations="-";
			}
		});
		but2.setBounds(323, 188, 97, 25);
		frame.getContentPane().add(but2);
		
		JButton but3 = new JButton("*");
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(display.getText());
				display.setText("");
				operations="*";
			}
		});
		but3.setBounds(323, 163, 97, 25);
		frame.getContentPane().add(but3);
		
		JButton but4 = new JButton("/");
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(display.getText());
				display.setText("");
				operations="/";
			}
		});
		but4.setBounds(323, 139, 97, 25);
		frame.getContentPane().add(but4);
		
		display = new JTextField();
		display.setBounds(50, 28, 305, 41);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				secondnum=Double.parseDouble(display.getText());
				if(operations=="+")
				{ 
					result=firstnum+secondnum;
					answer=String.format("%.0f",result);
					display.setText(answer);
				}
				else if(operations=="-")
				{ 
					result=firstnum-secondnum;
					answer=String.format("%.0f",result);
					display.setText(answer);
				}
				else if(operations=="*")
				{ 
					result=firstnum*secondnum;
					answer=String.format("%.0f",result);
					display.setText(answer);
				}
				else if(operations=="/")
				{ 
					result=firstnum/secondnum;
					answer=String.format("%.0f",result);
					display.setText(answer);
				}
			}
		});
		equals.setFont(new Font("Tahoma", Font.BOLD, 20));
		equals.setBounds(323, 108, 97, 25);
		frame.getContentPane().add(equals);
		
		JButton clear = new JButton("c");
		clear.setFont(new Font("Tahoma", Font.BOLD, 19));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");
			}
		});
		clear.setBounds(0, 82, 97, 35);
		frame.getContentPane().add(clear);
	}

}
