package input.screen;

public class InputScreen {
	public static void main (String[] args) throws InterruptedException {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame frame = new MainFrame();
			}
		});
	}
}
