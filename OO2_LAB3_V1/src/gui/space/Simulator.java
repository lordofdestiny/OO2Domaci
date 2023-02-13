package gui.space;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Simulator extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5788385417903937528L;
	private Space space = new Space();
	private Generator generator = new Generator(space);
	private Panel pnlCommands = new Panel();

	private void populateWindow() {
		add(space);

		Button btnStart = new Button("Pokreni");
		btnStart.addActionListener((ae) -> {
			space.start();
			generator.start();
			btnStart.setEnabled(false);
		});
		pnlCommands.add(btnStart);

		add(pnlCommands, BorderLayout.SOUTH);
	}

	public Simulator() {
		setSize(200, 400);
		setResizable(false);
		setLocationByPlatform(true);

		populateWindow();

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				generator.finish();
				space.finish();
				dispose();
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Simulator();
	}

}
