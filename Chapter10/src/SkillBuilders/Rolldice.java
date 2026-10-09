package SkillBuilders;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
public class Rolldice {
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rolldice window = new Rolldice();
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
	public Rolldice() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon die1 = new ImageIcon("../Chapter10/src/SkillBuilders/die1.gif");
		ImageIcon die2 = new ImageIcon("../Chapter10/src/SkillBuilders/die2.gif");
		ImageIcon die3 = new ImageIcon("../Chapter10/src/SkillBuilders/die3.gif");
		ImageIcon die4 = new ImageIcon("../Chapter10/src/SkillBuilders/die4.gif");
		ImageIcon die5 = new ImageIcon("../Chapter10/src/SkillBuilders/die5.gif");
		ImageIcon die6 = new ImageIcon("../Chapter10/src/SkillBuilders/die6.gif");
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 505, 352);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		
		JLabel dieface = new JLabel("");
		dieface.setBounds(122, 128, 113, 121);
		panel.add(dieface);
		
		JLabel dieface2 = new JLabel("");
		dieface2.setBounds(245, 128, 113, 121);
		panel.add(dieface2);
		
		
		JButton Roll = new JButton("Roll Die");
		Roll.setBounds(105, 0, 258, 70);
		Roll.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			
			{
				int newRoll = (int)(6 * Math.random() + 1);
				
				if (newRoll == 1)
				{
					dieface.setIcon(die1);
				}
				
				if (newRoll == 2)
				{
					dieface.setIcon(die2);
				}
				
				if (newRoll == 3)
				{
					dieface.setIcon(die3);
				}
				
				if (newRoll == 4)
				{
					dieface.setIcon(die4);
				}
				
				if (newRoll == 5)
				{
					dieface.setIcon(die5);
				}
				
				if (newRoll == 6)
				{
					dieface.setIcon(die6);
				}
				
				
				
				int newRoll2 = (int)(6 * Math.random() + 1);
				
				if (newRoll2 == 1)
				{
					dieface2.setIcon(die1);
				}
				
				if (newRoll2 == 2)
				{
					dieface2.setIcon(die2);
				}
				
				if (newRoll2 == 3)
				{
					dieface2.setIcon(die3);
				}
				
				if (newRoll2 == 4)
				{
					dieface2.setIcon(die4);
				}
				
				if (newRoll2 == 5)
				{
					dieface2.setIcon(die5);
				}
				
				if (newRoll2 == 6)
				{
					dieface2.setIcon(die6);
				}
				
				
				
				
				
				
			}
		});
		panel.setLayout(null);
		panel.add(Roll);
		
		
	}
}

