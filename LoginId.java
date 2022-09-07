import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginId {

	private JFrame frame;
	private JTextField user1;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginId window = new LoginId();
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
	public LoginId() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 884, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Username = new JLabel("UserName");
		Username.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Username.setBounds(272, 154, 105, 32);
		frame.getContentPane().add(Username);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Faculty page of algoma University");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setBounds(244, 60, 313, 38);
		frame.getContentPane().add(lblNewLabel);
		
		user1 = new JTextField();
		user1.setBounds(364, 163, 229, 19);
		frame.getContentPane().add(user1);
		user1.setColumns(10);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Password.setBounds(272, 231, 87, 32);
		frame.getContentPane().add(Password);
		
		JButton LoginBtn = new JButton("Login");
		LoginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user2=user1.getText();
				String pass2=pass .getText();
				if(user2.equals("jayraj")&&pass2.equals("123")) {
					JOptionPane.showMessageDialog(null, "Sucessfully login");
				}else {
					JOptionPane.showMessageDialog(null, "UnSucessfully login");
				}
				
			}
		});
		
		LoginBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LoginBtn.setBounds(408, 289, 105, 32);
		frame.getContentPane().add(LoginBtn);
		
		JLabel lblNewLabel_2 = new JLabel("Dont Have account want sign in???");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(344, 345, 246, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton SignBtn = new JButton("Sign Up");
		SignBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SignBtn.setBounds(408, 387, 105, 38);
		frame.getContentPane().add(SignBtn);
		
		pass = new JPasswordField();
		pass.setBounds(364, 240, 225, 19);
		frame.getContentPane().add(pass);
		
	 
	}
}
