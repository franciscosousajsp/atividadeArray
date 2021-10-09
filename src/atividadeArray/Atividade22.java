package atividadeArray;

import java.util.Scanner;

public class Atividade22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Gerar aleatoriamente um vetor A com 10 elementos inteiros e igual a
		 * 1 e 0, sugestão: A[i] = (int)Math.round(Math.random()*1); pde-se
		 * para implementar um program que determine o percentual de numero 0' 
		 * e 1' existentes no vetor A
		 * */
		
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int qtdZero = 0;
		int qtdUm = 0;

		for (int i = 0; i < vetorA.length; i++) {
			//vetorA[i] = (int) (Math.random() * 2);

			vetorA[i] = (int)( Math.round(Math.random()*1));
			
			if (vetorA[i] == 0) {
				qtdZero++;
			} else {
				qtdUm++;
			}
		}

		int perZero = qtdZero * 100 / vetorA.length;
		int perUm = qtdUm * 100 / vetorA.length;

		System.out.println("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Percentual com Zero: "+perZero);
		System.out.println("Percentual com Um: "+perUm);
		
		scan.close();
	}

}
