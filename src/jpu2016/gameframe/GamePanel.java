package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public abstract class GamePanel extends JPanel implements Observer {
	private static final long serialVersionUID = 3987064896591403626L;

	public GamePanel(final IGraphicsBuilder graphicsBuilder){

	}

	@Override
	public void paintComponent(final Graphics graphics){

	}

	public int update(final Observable observable ){

		return 1;
	}
}
