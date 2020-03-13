package model;

import processing.core.PApplet;

public class Circulo extends Figura  {

	Circulo(int posX, int posY, int tam) {
		super(posX, posY, tam);
		// TODO Auto-generated constructor stub
	}
	
	
	public void pintar(PApplet app) {
		app.fill(255,0,0);
		app.ellipse(this.posX,this.posY,this.tam,this.tam);
	}

}
