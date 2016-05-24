package jpu2016.dogfight.model;

public class Position {

	private double maxX;
	private double maxY;
	private double x;
	private double y;

	Position(final double x, final double y, final double maxX, final double maxY) {

	}

	Position(final Position position) {

	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	protected void setMaxX(final double maxX) {
		this.maxX = maxX;
	}

	protected void setMaxY(final double maxY) {
		this.maxY = maxY;
	}

	public void setX(final double x) {
		this.x = x;
	}

	public void setY(final double y) {
		this.y = y;
	}

}
