package gui.space;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Space extends Canvas implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2321669575251060913L;
	private ArrayList<CelestialBody> bodies = new ArrayList<>();
	private Thread thread;

	public synchronized void paint(Graphics g) {
		bodies.forEach(body -> body.paint(g));
	}

	public Space() {
		setBackground(Color.BLACK);
	}

	public void start() {
		if (thread != null)
			return;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void finish() {
		if (thread == null) {
			return;
		}
		thread.interrupt();
		try {
			thread.join();
			thread = null;
		} catch (InterruptedException e) {
		}
	}

	public synchronized void addCelestialBody(CelestialBody body) {
		bodies.add(body);
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				synchronized (this) {
					repaint();
					bodies.removeIf(body -> body.y - body.r > getHeight());
					bodies.forEach(body -> body.moveY(5));
				}
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
		}

	}

}
