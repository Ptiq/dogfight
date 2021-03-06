package jpu2016.dogfight.view;

import java.awt.image.ImageObserver;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

public class DogfightView implements IViewSystem, Runnable{
	private final EventPerformer eventPerformer;
	private final GameFrame gameFrame;
	private final GraphicsBuilder graphicsBuilder;
	private IDogfightModel iDogfightModel;
	private IOrderPerformer iOrderPerformer;

	public DogfightView(final IOrderPerformer orderPerformer, final IDogfightModel dogfightModel, final ImageObserver  observer ){
		this.graphicsBuilder = new GraphicsBuilder(this.iDogfightModel);
		this.eventPerformer = new EventPerformer(this.iOrderPerformer);
		this.gameFrame = new GameFrame(null, this.eventPerformer, this.graphicsBuilder, null);

	}

	public void closeAll(){

	}

	public int displayMessage(final String message){
		return 1;
	}

	@Override
	public void run(){

	}
}
