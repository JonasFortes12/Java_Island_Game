
public class Celula {

	public int posicaoX;
	public int posicaoY;
	public int id;
	public ElementoDeJogo elemento;//quem está ocupando 
	
	public Celula(int id, int x , int y) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.id = id;
		elemento = null;
	}
	
	public void ocuparCom(ElementoDeJogo elemento) {
		this.elemento = elemento;
	}
	
	public String infos() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
}
