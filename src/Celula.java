
public class Celula {

	public int id;
	public Posicao posicao;
	public ElementoDeJogo elemento;//quem está ocupando 
	
	public Celula(int id, int x , int y) {
		this.posicao.coordenadaX = x;
		this.posicao.coordenadaY = y;
		this.id = id;
		elemento = null;
	}
	
	public void ocuparCom(ElementoDeJogo elemento) {
		this.elemento = elemento;
	}
	
	public String infos() {
		return "Celula:  " + id + " x: " + posicao.coordenadaX + " y: " + posicao.coordenadaY;
	}
}
