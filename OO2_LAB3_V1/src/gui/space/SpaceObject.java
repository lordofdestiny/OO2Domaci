package gui.space;

import java.awt.Color;
import java.awt.Graphics;

public abstract class SpaceObject {
	protected int x;
	protected int y;
	protected Color color;

	SpaceObject(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void moveX(int by) {
		this.x += by;
	}

	public void moveY(int by) {
		this.y += by;
	}

	public abstract void paint(Graphics g);
}
