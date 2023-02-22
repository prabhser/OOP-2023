package ie.tudublin;

import processing.core.PApplet;

public class Grid extends PApplet {

	int mode = 0;
	int sizeGrid = 14;
	int sizeScreen = 800;

	public void settings() {
		size(sizeScreen, sizeScreen);
	}

	public void setup() {
		colorMode(RGB);
	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		smooth();
		strokeWeight(2);

		float lineGap = sizeScreen/(sizeGrid+1); // gap between grids of line

		for(int i = 1; i <= sizeGrid; i++){
			stroke(255);
			line(lineGap*i, lineGap, lineGap*i, sizeScreen-lineGap);
			line(lineGap, lineGap*i, sizeScreen-lineGap, lineGap*i);
		}
	}
}
