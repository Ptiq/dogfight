package jpu2016.dogfight.model;

public class Missile extends Mobile {

	private static int HEIGHT = 30;

	private static String Image = "missile";

	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static int SPEED = 2;

	private static int WIDTH = 100;

	public static int getHeightWithADirection(final Direction direction) {
		return this.HEIGHT;

	}

	public static int getWidthWithADirection(final Direction direction) {
		return this.WIDTH;

	}

	int distanceTraveled = 0;

	public Missile(final Direction direction, final Position position, final Dimension dimension, final int speed,
			final String image) {
		super(direction, position, dimension, speed, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isWeapon() {
		return false;

	}

	@Override
	public void move() {

	}

}
