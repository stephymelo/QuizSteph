package view;

import controller.Controller;
import processing.core.PApplet;

public class Screen {
	
	private Controller controller;
	
	
	public Screen(PApplet app){
		
		controller=new Controller(app);
		
	
		
	}
	
	
	
	public void drawScreen(PApplet app) {
		controller.pintar(app);
		
		
	}
	
	

}
