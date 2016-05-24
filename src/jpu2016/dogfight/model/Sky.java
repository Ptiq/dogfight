package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements IArea {

	Dimension dimension;
	Image image;

	public Sky(final Dimension dimension) {

	}

	@Override
	public Dimension getDimension(final Dimension dimension) {
		return this.dimension;
	}

	@Override
	public Image getImage(final Image image) {
		return this.image;

	}
}
