import java.util.ArrayList;
import java.util.Random;

public class ServicosJogo {
	
	public Plano plano;
	public int qtdAlunos;
	public int qtdBugs;
	
	
	
	public ServicosJogo(Plano plano, int qtdAlunos, int qtdBugs) {
		this.plano = plano;
		this.qtdAlunos = qtdAlunos;
		this.qtdBugs = qtdBugs;
	}

	
	private int sortearNumero(int min, int max) {
		Random random = new Random();
		
		return random.nextInt((max - min) + 1) + min;
	}
	
	
	public void sortearAlunosNoPlano() {	
		
		
		for(int i=1; i<=this.qtdAlunos; i++) {
			int celulaSorteada = sortearNumero(1, this.plano.listaCelulas.size());
			
			while(this.plano.listaCelulas.get(celulaSorteada).elemento != null) {
				celulaSorteada++;
				System.out.println("Celula Ocupada - Prox posicao para Aluno");
			}
			
			this.plano.listaCelulas.get(celulaSorteada).elemento = new Aluno();
		}
		
		
		
		
	}

	public void sortearBugsNoPlano() {	
		
		for(int i=1; i<=this.qtdAlunos; i++) {
			int celulaSorteada = sortearNumero(1, this.plano.listaCelulas.size());
			
			while(this.plano.listaCelulas.get(celulaSorteada).elemento != null) {
				celulaSorteada++;
				System.out.println("Celula Ocupada - Prox posicao para Bug");
			}
			
			this.plano.listaCelulas.get(celulaSorteada).elemento = new Bug();
		}
		
	}
	
	
	
	
	public void povoarPlano() {
		
	}
	
	
	
	
	
	
	
	
	
	
}
