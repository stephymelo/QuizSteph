package model;

import processing.core.PApplet;

public class Cuadrado extends Figura  {

	public Cuadrado(int posX, int posY, int tam) {
		super(posX, posY, tam);
		// TODO Auto-generated constructor stub
	}
	
	
	public void pintar(PApplet app) {
		app.fill(255,0,0);
		app.rect(this.posX,this.posY,this.tam,this.tam);
	}

}
