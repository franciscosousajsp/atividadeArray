package atividadeArray;

import java.util.Scanner;

public class Atividade31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ler um vetor A com 20 elementos. Separar os elementos pares e impares de A
		 * utilizando apenas um vetor extra B. Sugestão : no inicio do vetor B armazene
		 * os elementos pares de A e nas posições restantes do vetor B armazene os
		 * elementos de A que sao impares
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];

		int posicaoB = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com vetor A");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 == 0) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			}
		}
		
	
		System.out.println("Vetor A");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Vetor B");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}


		scan.close();
	}

}
