package model;

import processing.core.PApplet;

public class Logic  {
	
	Figura fig;
	Cuadrado [] cuadrado;
	Circulo [] circulo;
	String [] info;
	Figura [] textInfo; 
	private int posX,posY,posXC,posYC,tam;
	
	public Logic(PApplet app){
		
		
		cuadrado= new Cuadrado[4];
		circulo= new Circulo[3];
		info=app.loadStrings("1.txt");
		posX=30;
		posY=30;
		posXC=100;
		posYC=100;
		
		for(int i=0;i<info.length;i++) {
//			
//			if(info[i].contains("Cuadrado")) {
//				String [] infoCuad = info[i].split(" ");
//				System.out.println(Integer.parseInt(infoCuad[0]));
//		}
//		
//		}
	
				
//				textInfo[i] = new Figura (info[i],posX,posY,tam);
			
	}
	}
	
	
	public void cargarArchivo() {
		

	}
	
	public void choque(PApplet app) {
		

		for (int i = 0; i < cuadrado.length; i++) {
	       for (int j = 0; j < circulo.length; j++) {
		        
		        	if(app.dist(cuadrado[i].getPosX(),cuadrado[i].getPosY(),circulo[i].getPosX(),circulo[i].getPosY())<100) {
		        		cuadrado[i].setDirX(-1);
		        		circulo[i].setDirX(-1);
		        		
		        		
		        	}
				}
				
			
			
		}
		
		
		
	}
	

	
	public void pintarFigura(PApplet app) {
		
		for (int i = 0; i < cuadrado.length; i++) {
			cuadrado[i] = new Cuadrado (posX, posY, tam);
			Cuadrado c= cuadrado[i];
			c.pintar(app);
			fig.mover();
			
			
		}
		
        for (int i = 0; i < circulo.length; i++) {
        	circulo[i] = new Circulo (posXC, posYC, tam);
        	Circulo c= circulo[i];
			c.pintar(app);
        	fig.mover();
			
		}
		
		
		
		
	}
	
	
	
	
	

}
