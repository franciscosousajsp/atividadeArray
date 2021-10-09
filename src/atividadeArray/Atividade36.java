package atividadeArray;

import java.util.Scanner;

public class Atividade36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
		 * cada elemento do vetor A é formado pela a potencia de base 2 elevado
		 * ao expoente igual a posicao do respectivo element, ou seja: 
		 * A[i] = 2i, sugestão int A[11];
		 * */
		
		Scanner scan = new Scanner(System.in);
		Double[] vetorA = new Double[11];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Math.pow(2, i);
			System.out.print(vetorA[i]+" ");
		}

		scan.close();
	}

}
