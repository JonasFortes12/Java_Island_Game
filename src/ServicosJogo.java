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
	
	
	public ArrayList<int[]> sortearAlunosNoPlano() {	
		ArrayList<int[]> posicoesIniciaisAlunos = new ArrayList<int[]>();
		
		for(int i=1; i<=this.qtdAlunos; i++) {
			int[] coordenada = new int[2];
			coordenada[0] = sortearNumero(1, this.plano.tamanhoX);
			coordenada[1] = sortearNumero(1, this.plano.tamanhoY);
			
			for(int[] c : posicoesIniciaisAlunos) {
				while(coordenada[0] == c[0] && coordenada[1] == c[1]) {
					coordenada[0] = sortearNumero(1, this.plano.tamanhoX);
					coordenada[1] = sortearNumero(1, this.plano.tamanhoY);
				}
			}
			
			posicoesIniciaisAlunos.add(coordenada);
				
		}
		return posicoesIniciaisAlunos;
	}
	
	
	public static void sortearBugsNoPlano( ) {
		
		
	}
	
	
	
	public void povoarPlano() {
		
	}
	
	
	
	
	
	
	
	
	
	
}
