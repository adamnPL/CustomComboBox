import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox jComboBox = new JComboBox(new TableTypeList().getCurrencyTabList());
		jComboBox.setBounds(20, 76, 394, 40);
		frame.getContentPane().add(jComboBox);
		
		JLabel lblComboBox = new JLabel("ComboBox");
		lblComboBox.setBounds(20, 56, 394, 14);
		frame.getContentPane().add(lblComboBox);
	}

}
