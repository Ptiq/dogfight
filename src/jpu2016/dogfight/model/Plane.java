package jpu2016.dogfight.model;

public class Plane extends Mobile {

	private static int HEIGHT = 30;
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private int player;

	public Plane(final int player, final Dimension dimension, final Direction direction, final Position position,
			final String image) {

		super(direction, position, dimension, player, image);
	}

	@Override
	public boolean hit() {
		return this.hit();

	}

	@Override
	public boolean isPlayer(final int player) {
		return this.isPlayer(player);

	}

}
