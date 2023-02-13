package gui.space;

import java.util.Random;

public class Generator extends Thread {
	private Space space;
	private static Random rng = new Random();

	private static int nextIntInclusive(int low, int high) {
		return low + rng.nextInt(high - low + 1);
	}

	public Generator(Space space) {
		this.space = space;
	}

	public synchronized void finish() {
		if (!isAlive()) {
			return;
		}
		interrupt();
		try {
			this.join();
		} catch (InterruptedException e) {
		}
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				int r = nextIntInclusive(10, 30);
				int x = nextIntInclusive(0, 199);
				space.addCelestialBody(new Comet(x, 0, r));
				Thread.sleep(900);
			}
		} catch (InterruptedException e) {
		}
	}
}
