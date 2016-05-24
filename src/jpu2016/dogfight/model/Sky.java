package jpu2016.dogfight.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky implements IArea {

	Dimension dimension;
	Image image;

	public Sky(final Dimension dimension) throws IOException {
		this.dimension = dimension;
		this.image = ImageIO.read(new File("images/" + this.image));
	}

	@Override
	public Dimension getDimension(final Dimension dimension) {
		return this.dimension;
	}

	@Override
	public Image getImage(final Image image) {
		return null;

	}

}
