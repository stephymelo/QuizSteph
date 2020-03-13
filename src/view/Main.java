package view;


import processing.core.PApplet;

public class Main extends PApplet {
	
	public Screen screen;
	
	

	public static void main(String[] args) {
		PApplet.main("view.Main");
		
	}
	
	public void settings() {
		size(500,500);

	}

	public void setup() {
		screen=new Screen(this);
		
		
	}
	
	public void draw() {
		background(255);
	
	screen.drawScreen(this);
		
		
	}
	
	public void mouseClicked() {
		
		
	}

}
