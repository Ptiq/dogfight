package jpu2016.dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {

	public void addMobile(final IMobile Mobile);

	public void buildArea(final Dimension dimension);

	public IArea getArea(final IArea iArea);

	public ArrayList<IMobile> getMobile();

	public IMobile getMobileByPlayer(final int player);

	public void removeMobile(final IMobile Mobile);

	public void setMobilesHavesMoved();

}
