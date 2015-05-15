import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Game extends JPanel {
	Provaider a = new Provaider();
	/**
	 * Create the panel.
	 */
	public Game() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a.showMenu();
			}
		});
		btnNewButton.setBounds(172, 111, 89, 23);
		add(btnNewButton);

	}

}
