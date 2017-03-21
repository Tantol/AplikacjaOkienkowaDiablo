import java.awt.EventQueue;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CharacterMenu {

	private JFrame frame;
	private JPanel characterInfoWindow, characterMenuWindow;
	private User usr;
	private JLabel lblNewLabel;

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
		////
		//Declarations
		////
		ChampionList champion = new ChampionList();
		usr = new User();
		////
		//JFrame Setup
		////
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(800,400));	
		frame.setBounds(100, 100, 950, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		////
		//Character Menu Setup
		////
		characterMenuWindow = new JPanel();
		frame.getContentPane().add(characterMenuWindow, "characterMenuWindow");
		characterMenuWindow.setLayout(new MigLayout("", "[1%:50%][][][][][][][][1%:50%]", "[25%:50%][30%][25%:50%][]"));
		////
		//Character Info Setup
		////
		characterInfoWindow = new JPanel();
		frame.getContentPane().add(characterInfoWindow, "characterInfoWindow");
		characterInfoWindow.setLayout(new MigLayout("", "[][][][][][]", "[][]"));
		characterInfoWindow.setVisible(false);
		lblNewLabel = new JLabel("test");
		characterInfoWindow.add(lblNewLabel, "cell 5 1");
		characterMenuWindow.setLayout(new MigLayout("", "[1px]", "[1px]"));
		////
		//Character Buttons
		////
		JButton btnClass1 = new JButton(champion.Amazon.getName());
		characterMenuWindow.add(btnClass1, "cell 0 0,grow");
		JButton btnClass2 = new JButton(champion.Assasin.getName());
		characterMenuWindow.add(btnClass2, "cell 0 0,grow");
		JButton btnClass3 = new JButton(champion.Necromancer.getName());
		characterMenuWindow.add(btnClass3, "cell 0 0,grow");
		JButton btnClass4 = new JButton(champion.Barbarian.getName());
		characterMenuWindow.add(btnClass4, "cell 0 0,grow");
		JButton btnClass5 = new JButton(champion.Paladin.getName());
		characterMenuWindow.add(btnClass5, "cell 0 0,grow");
		JButton btnClass6 = new JButton(champion.Sorceress.getName());
		characterMenuWindow.add(btnClass6, "cell 0 0,grow");
		JButton btnClass7 = new JButton(champion.Druid.getName());
		characterMenuWindow.add(btnClass7, "cell 0 0,grow");
		
		JButton btnExit = new JButton("Exit");
		characterMenuWindow.add(btnExit, "cell 0 0,grow");
		////
		// Listeners For Character Menu
		////
		//Class Button 1
		btnClass1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				goToName(btnClass1.getText());
				
			}
		});
		//Class Button 2
		btnClass2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				goToName(btnClass2.getText());
			}
		});
		//Class Button 3
		btnClass3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				goToName(btnClass3.getText());
			}
		});
		//Class Button 4
		btnClass4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				goToName(btnClass4.getText());
			}
		});
		//Class Button 5
		btnClass5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				goToName(btnClass5.getText());
			}
		});
		//Class Button 6
		btnClass6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				goToName(btnClass6.getText());
			}
		});
		//Class Button 7
		btnClass7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				goToName(btnClass7.getText());
			}
		});
		//Exit Button
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
				return;
			}
		});
		

	}
	private void goToName(String name){
		characterInfoWindow.setVisible(true);
		characterMenuWindow.setVisible(false);
		usr.setChampion(name);
		lblNewLabel.setText(usr.getChampion());
	}
}
