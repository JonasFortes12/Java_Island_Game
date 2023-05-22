

public class Main {

	public static void main(String[] args) {
		
		Plano p = new Plano(5, 5);
		
		ServicosJogo s = new ServicosJogo(p, 7, 8);
		
		s.sortearAlunosNoPlano();
		s.sortearBugsNoPlano();
		
		

	}

}
