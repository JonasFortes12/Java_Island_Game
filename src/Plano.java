import java.util.ArrayList;

public class Plano {

	public ArrayList<Celula> listaCelulas;
	int tamanhoX;
	int tamanhoY;

	public Plano(int tamanhoX, int tamanhoY) {
		
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
		montarPlano();
		
	}

	
	private void montarPlano() {
		this.listaCelulas = new ArrayList<Celula>();

		int contador = 1;
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula celula = new Celula(contador, i, j);
				this.listaCelulas.add(celula);
				contador++;
			}
		}
	}
	
	
	public Celula retornarCelula(int x, int y) {

		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).posicao.coordenadaX == x && listaCelulas.get(i).posicao.coordenadaY == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}

	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			System.out.println(listaCelulas.get(i).infos());
		}
	}

}
