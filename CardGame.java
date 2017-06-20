import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;


class CardGame {

	public static void main(String[] args) {

		JFrame gui = new JFrame();
		CardGame game = new CardGame();

		// program ends when frame closes
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		gui.setTitle("Card Game");
		gui.setSize(300,300);

		// center frame
		gui.setLocationRelativeTo(null);

		final Container pane = gui.getContentPane();

		ImageIcon img0 = new ImageIcon("./img/0.png");
		final JLabel card = new JLabel(img0);
		pane.add(card);

		// buttons
		JButton shuffle = new JButton("Shuffle");
		JButton draw = new JButton("Draw Card");

		shuffle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO: shuffle button clicked
			}
		});

		draw.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO: draw button clicked
			}
		});

		draw.setEnabled(false);
		JPanel buttons = new JPanel();
		buttons.add(shuffle);
		buttons.add(draw);
		pane.add(buttons, BorderLayout.PAGE_END);

		// show frame
		gui.setVisible(true);
	}
}
