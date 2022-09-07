import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FacultySearch {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultySearch window = new FacultySearch();
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
	public FacultySearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 854, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Heading = new JLabel("Faculty Search");
		Heading.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		Heading.setBounds(253, 47, 210, 21);
		frame.getContentPane().add(Heading);
		
		JLabel Position = new JLabel("Position");
		Position.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Position.setBounds(82, 125, 75, 21);
		frame.getContentPane().add(Position);
		
		textField = new JTextField();
		textField.setBounds(200, 128, 236, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel StartingDate = new JLabel(" Starting Date");
		StartingDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		StartingDate.setBounds(66, 246, 118, 13);
		frame.getContentPane().add(StartingDate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 245, 149, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel EndingDate = new JLabel(" Ending Date");
		EndingDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		EndingDate.setBounds(66, 334, 118, 13);
		frame.getContentPane().add(EndingDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 333, 149, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel Description = new JLabel("Description");
		Description.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Description.setBounds(66, 409, 91, 13);
		frame.getContentPane().add(Description);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 408, 460, 105);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton ADDJOB = new JButton("Add Job");
		ADDJOB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sucessfully Upload");
			}
		});
		ADDJOB.setBounds(386, 556, 85, 21);
		frame.getContentPane().add(ADDJOB);
	}
}
