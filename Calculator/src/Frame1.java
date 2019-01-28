import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.lang.Math;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JRadioButton;

public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldAns;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JTable table;
	private JButton btnNewButton_21;
	private JButton btnNewButton_22;
	private JButton btnNewButton_23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 716, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(433, 120, 121, 76);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(564, 120, 121, 76);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try
				{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					ans=num1+num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}
				catch(Exception m)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton.setBounds(83, 156, 73, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try
				{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_1.setBounds(220, 120, 73, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(10, 11, 675, 98);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		btnNewButton_2 = new JButton("*");
		btnNewButton_2.setForeground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try
				{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					ans=num1*num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}
				catch(Exception m1)
				{
					JOptionPane.showMessageDialog(null,"Please enter the valid number:");
				}
			}
		});
		btnNewButton_2.setBounds(83, 120, 73, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2;
				float ans;
				try
				{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					ans=num1/num2;
					textFieldAns.setText(Float.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_3.setBounds(147, 120, 73, 40);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("^");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2;
				double ans;
				try
				{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					ans=Math.pow(num1, num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_4.setBounds(293, 156, 73, 40);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("\u221A");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.sqrt(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_5.setBounds(147, 156, 73, 40);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("x!");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans=1.0;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					for(double i=1;i<=num2;i++)
					{
						ans=ans*i;
					}
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.setBounds(220, 156, 73, 40);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("1/x");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans=1.0;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=1/num2;
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.setBounds(220, 195, 73, 40);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("lg");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.log10(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8.setBounds(83, 195, 73, 40);
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("ln");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.log(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_9.setBounds(147, 195, 73, 40);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("Sin");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.sin(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_10.setBounds(293, 195, 73, 40);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("Cos");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.cos(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_11.setBounds(83, 234, 73, 40);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("tan");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.tan(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_12.setBounds(147, 234, 73, 40);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Ac");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAns.setText("");
				textField.setText("");
				textField_1.setText("");				
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_13.setBounds(293, 120, 73, 40);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("x^2");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=num2*num2;
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_14.setBounds(220, 234, 73, 40);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("x^3");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=num2*num2*num2;
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_15.setBounds(293, 234, 73, 40);
		frame.getContentPane().add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("sin-1");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.asin(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_16.setBounds(83, 273, 73, 40);
		frame.getContentPane().add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("cos-1");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.acos(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_17.setBounds(147, 274, 73, 40);
		frame.getContentPane().add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("tan-1");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.atan(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_18.setBounds(220, 273, 73, 40);
		frame.getContentPane().add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("e^x");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.exp(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_19.setBounds(293, 273, 73, 40);
		frame.getContentPane().add(btnNewButton_19);
		
		table = new JTable();
		table.setBounds(472, 380, 109, -67);
		frame.getContentPane().add(table);
		
		JButton btnNewButton_20 = new JButton("\u03C0");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAns.setText(Double.toString(Math.PI));
			}
		});
		btnNewButton_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_20.setBounds(83, 312, 73, 40);
		frame.getContentPane().add(btnNewButton_20);
		
		btnNewButton_21 = new JButton("max");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					num1=Double.parseDouble(textField.getText());
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.max(num1,num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_21.setBounds(147, 312, 73, 40);
		frame.getContentPane().add(btnNewButton_21);
		
		btnNewButton_22 = new JButton("min");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					num1=Double.parseDouble(textField.getText());
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.min(num1,num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_22.setBounds(220, 312, 73, 40);
		frame.getContentPane().add(btnNewButton_22);
		
		btnNewButton_23 = new JButton("abs");
		btnNewButton_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2;
				num1=0;
				double ans;
				try
				{
					
					num2=Double.parseDouble(textField_1.getText());
					ans=Math.abs(num2);
					textFieldAns.setText(Double.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Please nter the valid number:");
				}
			}
		});
		btnNewButton_23.setBounds(293, 312, 73, 40);
		frame.getContentPane().add(btnNewButton_23);
	}
}
