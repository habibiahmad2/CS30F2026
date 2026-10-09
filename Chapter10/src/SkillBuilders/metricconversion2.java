package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class metricconversion2 {

	private JFrame frame;
	private JTextField number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metricconversion2 window = new metricconversion2();
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
	public metricconversion2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel title = new JLabel("Metric Conversion");
		title.setBounds(150, 20, 150, 25);
		panel.add(title);

		JLabel label = new JLabel("Enter number:");
		label.setBounds(10, 70, 100, 25);
		panel.add(label);

		number = new JTextField();
		number.setBounds(110, 70, 100, 25);
		panel.add(number);
		number.setColumns(10);

		String[] conversions = {
				"Inches to Centimeters",
				"Feet to Meters",
				"Gallons to Liters",
				"Pounds to Kilograms"
		};

		JComboBox comboBox = new JComboBox(conversions);
		comboBox.setBounds(10, 120, 200, 30);
		panel.add(comboBox);

		JLabel result = new JLabel("Result:");
		result.setBounds(10, 180, 300, 25);
		panel.add(result);

		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(250, 120, 100, 60);
		panel.add(btnConvert);

		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double num = Double.parseDouble(number.getText());

				String conversion = comboBox.getSelectedItem().toString();

				double answer = 0;

				if (conversion.equals("Inches to Centimeters")) {
					answer = num * 2.54;
				}

				if (conversion.equals("Feet to Meters")) {
					answer = num * 0.3048;
				}

				if (conversion.equals("Gallons to Liters")) {
					answer = num * 4.5461;
				}

				if (conversion.equals("Pounds to Kilograms")) {
					answer = num * 0.4536;
				}

				result.setText("Result: " + answer);
			}
		});
	}
}