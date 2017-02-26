import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class CharacterMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharacterMenu window = new CharacterMenu();
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
	public CharacterMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel characterMenuWindow = new JPanel();
		frame.getContentPane().add(characterMenuWindow, "characterMenuWindow");
		characterMenuWindow.setLayout(new MigLayout("", "[25.35%:50%][][25%:50%][][][][][]", "[25%:50%,grow][][25%:50.61%][][][][][]"));
		
		JButton btnNewButton = new JButton("New button");
		characterMenuWindow.add(btnNewButton, "cell 1 1");
		
		JPanel characterInfoWindow = new JPanel();
		frame.getContentPane().add(characterInfoWindow, "characterInfoWindow");
		characterInfoWindow.setLayout(null);
		characterInfoWindow.setVisible(false);
	}
}
