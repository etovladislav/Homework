import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InitFrame extends JFrame {

	private JLayeredPane contentPane;
	private Menu panel;
	private Game panel_1;
	public final static String MENU = "Menu";
	public final static String NEW_GAME = "Game";
	private CardLayout card;

	/**
	 * Create the frame.
	 */
	public InitFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setMinimumSize(new Dimension(700, 400));
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		card = new CardLayout(0, 0);
		contentPane.setLayout(card);
		panel = new Menu();
		panel_1 = new Game();
		contentPane.add(panel, MENU);
		contentPane.add(panel_1, NEW_GAME);
	}

	public void showMenu() {
		card.show(getParent(), MENU);
	}

	public void showGame() {
		card.show(getParent(), NEW_GAME);
	}

}
