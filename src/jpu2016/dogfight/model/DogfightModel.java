package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

import javax.imageio.ImageIO;

public class DogfightModel extends Observable implements IDogfightModel {

	public class Mobile implements IMobile {
		private final Dimension dimension;
		private final Direction direction;
		private final Image image;
		private final Position position;

		private int speed;

		public Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed,
				final String image) throws IOException {
			this.speed = speed;
			this.dimension = dimension;
			this.position = position;
			this.speed = speed;
			this.direction = direction;
			this.image = ImageIO.read(new File("images/" + image));
		}

		@Override
		public Dimension getDimension() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Direction getDirection() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getHeigh() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Image getImage() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Point getPosition() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getSpeed() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getWidth() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean hit() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isPlayer(final int player) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isWeapon() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void move() {
			// TODO Auto-generated method stub

		}

		@Override
		public void placeInArea(final IArea area) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setDirection(final Direction direction) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setDogfightModel(final DogfightModel dogfightModel) {
			// TODO Auto-generated method stub

		}
	}

	@Override
	public void addMobile(final IMobile Mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildArea(final Dimension dimension) {
		// TODO Auto-generated method stub

	}

	@Override
	public IArea getArea(final IArea iArea) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<IMobile> getMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(final int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeMobile(final IMobile Mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub

	}

}
