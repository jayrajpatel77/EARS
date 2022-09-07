import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp {

	private JFrame frame;
	private JTextField Name1;
	private JTextField Name2;
	private JTextField Email1;
	private JPasswordField p2;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 679, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Setup Account here");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(245, 40, 280, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel Name = new JLabel("First Name");
		Name.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Name.setBounds(155, 161, 103, 34);
		frame.getContentPane().add(Name);
		
		Name1 = new JTextField();
		Name1.setBounds(245, 171, 175, 19);
		frame.getContentPane().add(Name1);
		Name1.setColumns(10);
		
		JLabel Email = new JLabel("Last Name");
		Email.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Email.setBounds(155, 235, 91, 21);
		frame.getContentPane().add(Email);
		
		Name2 = new JTextField();
		Name2.setBounds(245, 238, 175, 19);
		frame.getContentPane().add(Name2);
		Name2.setColumns(10);
		
		JLabel EmailId = new JLabel("Email");
		EmailId.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		EmailId.setBounds(155, 296, 75, 13);
		frame.getContentPane().add(EmailId);
		
		Email1 = new JTextField();
		Email1.setBounds(245, 290, 175, 19);
		frame.getContentPane().add(Email1);
		Email1.setColumns(10);
		
		JLabel Password1 = new JLabel("Password");
		Password1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Password1.setBounds(155, 336, 75, 13);
		frame.getContentPane().add(Password1);
		
		JLabel ConfirmedPassword = new JLabel("Confirm password");
		ConfirmedPassword.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		ConfirmedPassword.setBounds(85, 391, 161, 13);
		frame.getContentPane().add(ConfirmedPassword);
		
		JLabel Title = new JLabel("Job Title");
		Title.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Title.setBounds(91, 442, 127, 13);
		frame.getContentPane().add(Title);
		
		p2 = new JPasswordField();
		p2.setBounds(245, 390, 175, 19);
		frame.getContentPane().add(p2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(245, 335, 169, 19);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(245, 442, 175, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sucessfully Added");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(245, 538, 175, 44);
		frame.getContentPane().add(btnNewButton);
	}
}
