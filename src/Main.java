import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Plano p = new Plano(6, 6);
		
		ServicosJogo s = new ServicosJogo(p, 10, 10);
		
		ArrayList<int[]> posicoesAlunos = s.sortearAlunosNoPlano();
		
		for(int[] posicao : posicoesAlunos) {
			System.out.println(posicao[0]);
			System.out.println(posicao[1]);
			System.out.println("---------------");
		}
		

	}

}
