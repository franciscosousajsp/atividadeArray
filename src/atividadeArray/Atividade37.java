package atividadeArray;

import java.util.Scanner;

public class Atividade37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
		 * tamanho, sendo que cada elemento do vetor B seja fatorial do elemento
		 * corresponde em A
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com elemento do vetor A");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = 1;

			for (int j = 1; j <= vetorA[i]; j++) {
				vetorB[i] *= j;
			}

		}
		
		System.out.println("Vetor A");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println();
		System.out.println("Vetor B");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}

		scan.close();
	}

}
