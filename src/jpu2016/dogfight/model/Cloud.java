package jpu2016.dogfight.model;

public class Cloud extends Mobile {

	private final int HEIGHT = 150;
	private final String IMAGE = "cloud";
	private final int SPEED = 1;
	private final int WIDTH = 300;

	public Cloud(final Direction direction, final Position position, final Dimension dimension, final int speed,
			final String image) {
		super(direction, position, dimension, speed, image);
		// TODO Auto-generated constructor stub
	}

}
