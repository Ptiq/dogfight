package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

	public static void applyModelToGraphic(final Graphics graphics,final ImageObserver observer){
	}

	public static int getGlobalHeight(){
		return 1;
	}
	public static int getGlobalWidth(){
		return 1;
	}
}
