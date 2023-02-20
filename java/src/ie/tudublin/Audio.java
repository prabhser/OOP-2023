package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio extends PApplet
{

	Minim minim;
	AudioInput ai;
	AudioPlayer ap;
	AudioBuffer ab;

	public void settings(){
	
		size(800, 800);
	}

	int fSize = 1024;

	public void setup() {
		colorMode(HSB);
		background(0);

		minim = new Minim(this);

		ai = minim.getLineIn(Minim.MONO, fSize, 44100, 16);
		ab = ai.mix;

		smooth();
		
	}

	public void draw()
	{	
		background(0);
		stroke(255);

		float half = height / 2;
		float cgap = 255 / (float)ab.size();

		for(int i = 0; i < ab.size(); i++){
			stroke(cgap*i, 255, 255);
			line(i, half, i,half+ab.get(i)*half);
		}
	}
}
