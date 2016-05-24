package jpu2016.dogfight.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Mobile extends Image implements IMobile {

	Dimension dimension;
	Direction direction;
	Position position;
	private int Speed;

	public Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed,
			final String image) {

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

	public IDogfightModel getDogfightModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHeigh() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight(final ImageObserver observer) {
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
	public Object getProperty(final String name, final ImageObserver observer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageProducer getSource() {
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
	public int getWidth(final ImageObserver observer) {
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

	public void moveDown() {

	}

	public void moveLeft() {

	}

	public void moveRight() {

	}

	public void moveUp() {

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
