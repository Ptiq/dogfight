package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {

	private final Sky sky;

	public DogfightModel() {

		this.sky = new Sky(null);

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
