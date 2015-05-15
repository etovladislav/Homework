public class Provaider {
	private static InitFrame frame = new InitFrame();

	public void showMenu() {
		frame.showGame();
	}

	public void newGame() {
		frame.showMenu();
	}

	public void initGame() {
		frame.setVisible(true);
	}

}
