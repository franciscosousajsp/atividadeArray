package atividadeArray;

import java.util.Scanner;

public class Atividade30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ler um vetor A com 20 elementos. Construir dois vetores B e C sendo que no
		 * vetores B e C serão armazenados os valores pares e impares A respectivamente
		 */
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		int posicaoB = 0;
		int posicaoC = 0;

		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			} else {
				vetorC[posicaoC] = vetorA[i];
				posicaoC++;
			}
		}

		
		System.out.println("Vetor A");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Vetor B");
		for(int i = 0; i < posicaoB; i++) {
			System.out.print(vetorB[i]+" ");
		}
		
		System.out.println();
		System.out.println("Vetor C");
		for(int i = 0; i < posicaoC; i++) {
			System.out.print(vetorC[i]+" ");
		}
		
		scan.close();
	}

}
