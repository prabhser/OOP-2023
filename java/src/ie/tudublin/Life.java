package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet
{

	LifeBoard board;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		board = new LifeBoard(100, this);
		board.randomise();
	}

	
	
	public void draw()
	{	
		background(0);

		board.render();
	}
}
