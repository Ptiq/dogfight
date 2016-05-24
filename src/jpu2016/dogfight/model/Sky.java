package jpu2016.dogfight.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Sky extends Image implements IArea {

	Dimension dimension;

	public Sky(final Dimension dimension) {

	}

	@Override
	public Dimension getDimension(final Dimension dimension) {
		return this.dimension;
	}

	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHeight(final ImageObserver observer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage(final Image image) {
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
	public int getWidth(final ImageObserver observer) {
		// TODO Auto-generated method stub
		return 0;
	}
}
