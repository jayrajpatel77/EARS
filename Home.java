import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 862, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Home = new JLabel("Home Page Of Algoma Carrers for Faculty");
		Home.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Home.setBounds(193, 40, 472, 72);
		frame.getContentPane().add(Home);
		
		JButton btnNewButton = new JButton("Add Faculty serach");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(51, 152, 175, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton ReviewFaculty = new JButton("Review faculty");
		ReviewFaculty.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		ReviewFaculty.setBounds(51, 208, 175, 21);
		frame.getContentPane().add(ReviewFaculty);
		
		JButton EditAccount = new JButton("Edit Account");
		EditAccount.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		EditAccount.setBounds(51, 281, 175, 21);
		frame.getContentPane().add(EditAccount);
	}

}
