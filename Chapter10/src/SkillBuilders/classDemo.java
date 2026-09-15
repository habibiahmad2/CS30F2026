package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class classDemo {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classDemo window = new classDemo();
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
	public classDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		fn = new JTextField();
		fn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				
				if(fn.getText().equals("Enter your first name"))
				{
					fn.setText("");
				}
				
			}
		});
		fn.setText("Enter your first name");
		fn.setBounds(10, 11, 123, 30);
		panel.add(fn);
		fn.setColumns(10);
		
		JLabel display = new JLabel("");
		display.setBounds(20, 142, 311, 87);
		panel.add(display);
		
		ln = new JTextField();
		ln.addKeyListener(new KeyAdapter() 
		
		
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{

				if(ln.getText().equals("Enter your last name"))
				{
					ln.setText("");
				}
				
				
			}
		});
		ln.setText("Enter your last name");
		ln.setColumns(10);
		ln.setBounds(174, 11, 123, 30);
		panel.add(ln);
		
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
		
			{
				String firstn = fn.getText();
				String lastn = ln.getText();
				
				display.setText(firstn
						+ " "+ lastn );
			}
		});
		submit.setBounds(408, 11, 152, 239);
		panel.add(submit);
		
	}
}
