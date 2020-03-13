package model;

public abstract class Figura  {
	
	protected int posX;
	protected int posY;
	protected int tam;
	protected int dirX;
	protected int dirY;
	protected int velY;
	protected int velX;
	
	Figura(int posX, int posY, int tam){
		this.posX=posX;
		this.posY=posY;
		this.tam=tam;
		this.velX=2;
		this.velY=2;
		this.dirX=((int)(Math.random()*5)+1);;
		this.dirY=((int)(Math.random()*5)+1);;
	}
	
	
	
	
	public void mover() {

		posX+=dirX;
		
		if(posX<=0 || posX>=470) {
			dirX*= -1;
		}
		
		posY+=dirY;
		if(posY<=0 || posY>=470) {
			dirY*= -1;
			
		}
		
		
	
	}
	
	

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	
	
	
	
	
	
	
	
	
}
