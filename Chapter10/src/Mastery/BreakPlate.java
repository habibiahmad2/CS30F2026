package Mastery;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

public class BreakPlate implements ActionListener {
	
	ImageIcon platesImage  = new ImageIcon("../Chapter10/src/Mastery/plates.gif");
	ImageIcon allBrokenImage = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif");
	ImageIcon twoBrokenImage = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif");
	ImageIcon tigerImage = new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif");
	ImageIcon stickerImage = new ImageIcon("../Chapter10/src/Mastery/sticker.gif");
	ImageIcon placeholderImage = new ImageIcon("../Chapter10/src/Mastery/placeholder.gif");

	private static final String FIRST_PRIZE = "tiger plush";
	private static final String CONSOLATION_PRIZE = "sticker";

	private JFrame frame;
	private JPanel contentPane;
	private JButton play;
	private JLabel plates, prizeWon;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakPlate window = new BreakPlate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BreakPlate() {

		

		frame = new JFrame();
		frame.setTitle("Break A Plate");
		frame.setBounds(100, 100, 350, 268);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		play = new JButton("Play");
		play.setBounds(117, 101, 89, 23);
		play.addActionListener(this);
		contentPane.add(play);

		plates = new JLabel();
		plates.setBounds(26, 11, 281, 86);
		plates.setIcon(platesImage);
		contentPane.add(plates);

		prizeWon = new JLabel();
		prizeWon.setBounds(112, 124, 125, 94);
		prizeWon.setIcon(placeholderImage);
		contentPane.add(prizeWon);
	}

	public void actionPerformed(ActionEvent event) {

		String eventName = event.getActionCommand();

		if (eventName.equals("Play")) {

			String prize = start();

			if (prize.equals(FIRST_PRIZE)) {
				plates.setIcon(allBrokenImage);
				prizeWon.setIcon(tigerImage);
			} else {
				plates.setIcon(twoBrokenImage);
				prizeWon.setIcon(stickerImage);
			}

			play.setText("Play Again");
			play.setActionCommand("Play Again");

		} else if (eventName.equals("Play Again")) {

			plates.setIcon(platesImage);
			prizeWon.setIcon(placeholderImage);

			play.setText("Play");
			play.setActionCommand("Play");
		}
	}

	private static String start(){

		Random random = new Random();

		int result = random.nextInt(2);

		if (result == 0) {
			return FIRST_PRIZE;
		} else {
			return CONSOLATION_PRIZE;
		}
	}
}

