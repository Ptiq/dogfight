package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {

	public Dimension getDimension();

	public Direction getDirection();

	public int getHeigh();

	public Image getImage();

	public Point getPosition();

	public int getSpeed();

	public int getWidth();

	public boolean hit();

	public boolean isPlayer(final int player);

	public boolean isWeapon();

	public void move();

	public void placeInArea(final IArea area);

	public void setDirection(final Direction direction);

	public void setDogfightModel(final DogfightModel dogfightModel);

}
