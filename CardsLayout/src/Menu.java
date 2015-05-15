import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Menu extends JPanel{
	Provaider a = new Provaider();
	/**
	 * Create the panel.
	 */
	public Menu() {
		setBackground(Color.PINK);
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a.newGame();
			}
		});
		btnNewButton.setBounds(170, 131, 89, 23);
		add(btnNewButton);

	}
}
