package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.JLabel;

public class SemesterAvg {

	private JFrame frame;
	private JTextField Gr1;
	private JTextField Gr2;
	private JTextField Gr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Gr1 = new JTextField();
		Gr1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				{
					if (Gr1.getText().equals("Enter the first grade:")) 
					{
						Gr1.setText("");
					}
				}
			}
		});
		Gr1.setText("Enter the first grade:");
		Gr1.setBounds(10, 33, 127, 34);
		panel.add(Gr1);
		Gr1.setColumns(10);
		
		JLabel display = new JLabel("");
		display.setBounds(10, 215, 240, 62);
		panel.add(display);
		
		Gr2 = new JTextField();
		Gr2.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyTyped(KeyEvent e)
			{
				{
					if (Gr2.getText().equals("Enter the second grade:")) 
					{
						Gr2.setText("");
					}
				}
				
				
			}
		});
		Gr2.setText("Enter the second grade:");
		Gr2.setColumns(10);
		Gr2.setBounds(10, 99, 127, 34);
		panel.add(Gr2);
		
		 
		
		Gr3 = new JTextField();
		Gr3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				{
					if (Gr3.getText().equals("Enter the third grade:")) 
					{
						Gr3.setText("");
					}
				}
				
				
				
			}
		});
		Gr3.setText("Enter the third grade:");
		Gr3.setColumns(10);
		Gr3.setBounds(10, 166, 127, 34);
		panel.add(Gr3);
		
		JButton btnNewButton = new JButton("Sumbit");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String g1 = Gr1.getText();
				String g2 = Gr2.getText();
				String g3 = Gr3.getText();
				
				double g11 = Double.parseDouble(g1);
			    double g22 = Double.parseDouble(g2);
			    double g33 = Double.parseDouble(g3);
			    
			    double avg = (g11 + g22 + g33)/3;
			    
			    DecimalFormat dc = new DecimalFormat("0.0");
			    
			    
			    display.setText("Average: "+ dc.format(avg));
			    
			}
		});
		btnNewButton.setBounds(286, 39, 107, 165);
		panel.add(btnNewButton);
		
		
	}
}
