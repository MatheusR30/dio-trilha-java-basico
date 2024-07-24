public class ExemploForArray {

	public static void main(String[] args) {
		String alunos[] = { "Ana", "Joao", "Guilherme", "Lucas"};
		
//		for( int x = 0; x < alunos.length; x ++) {
//			System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);			
//		}

		// O uso de FOR / EACH esta fortemente relacionado ao uso de Array ou Coleção,
		for(String aluno : alunos) {
			System.out.println("O aluno é: " + aluno);
		}
	}
}