package gui.space;

import java.awt.Color;

public abstract class CelestialBody extends SpaceObject {

	protected int r;

	public CelestialBody(int x, int y, Color color, int r) {
		super(x, y, color);
		this.r = r;
	}
}
