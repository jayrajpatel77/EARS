import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditAccount {

	private JFrame frame;
	private JTextField Name1;
	private JTextField EmailId;
	private JTextField Title1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditAccount window = new EditAccount();
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
	public EditAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 872, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel AccountSetting = new JLabel("Account Setting");
		AccountSetting.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		AccountSetting.setBounds(310, 53, 184, 46);
		frame.getContentPane().add(AccountSetting);
		
		JLabel Name = new JLabel("Name");
		Name.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Name.setBounds(185, 168, 95, 27);
		frame.getContentPane().add(Name);
		
		JLabel Email = new JLabel("Email");
		Email.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Email.setBounds(185, 238, 45, 13);
		frame.getContentPane().add(Email);
		
		JLabel Title = new JLabel("Title");
		Title.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Title.setBounds(185, 304, 45, 13);
		frame.getContentPane().add(Title);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Password.setBounds(185, 380, 95, 13);
		frame.getContentPane().add(Password);
		
		Name1 = new JTextField();
		Name1.setBounds(310, 174, 168, 19);
		frame.getContentPane().add(Name1);
		Name1.setColumns(10);
		
		EmailId = new JTextField();
		EmailId.setBounds(310, 237, 168, 19);
		frame.getContentPane().add(EmailId);
		EmailId.setColumns(10);
		
		Title1 = new JTextField();
		Title1.setBounds(310, 303, 168, 19);
		frame.getContentPane().add(Title1);
		Title1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(310, 379, 168, 19);
		frame.getContentPane().add(passwordField);
		
		JButton Edit = new JButton("Edit");
		Edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sucessfully Added");
			}
		});
		Edit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Edit.setBounds(305, 467, 115, 21);
		frame.getContentPane().add(Edit);
	}

}
