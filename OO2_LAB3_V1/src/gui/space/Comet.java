package gui.space;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.stream.IntStream;

public class Comet extends CelestialBody {

	private static final int VERTEX_COUNT = 5;
	private static final double INNER_ANGLE = 2 * Math.PI / VERTEX_COUNT;

	private double angle = Math.random() * 2 * Math.PI;

	public Comet(int x, int y, int r) {
		super(x, y, Color.GRAY, r);
	}

	private int getVertexX(double angle) {
		return x + (int) (r * Math.cos(angle));
	}

	private int getVertexY(double angle) {
		return y - (int) (r * Math.sin(angle));
	}

	@Override
	public void paint(Graphics g) {
		Color color = g.getColor();
		g.setColor(this.color);
		g.fillPolygon(IntStream.range(0, VERTEX_COUNT)
				.mapToDouble(i -> i * INNER_ANGLE + angle)
				.collect(Polygon::new, (poly, angle) -> {
							int x = getVertexX(angle);
							int y = getVertexY(angle);
							poly.addPoint(x, y);
				},(x,y)->{}));
		g.setColor(color);
	}

}
