package atividadeArray;

import java.util.Scanner;

public class Atividade28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ler um vetor A 10 elmentos e construir um vetor B de mesmo tipo e tamanho e
		 * com os mesmos elementos de A, sendo que estes deverão estar invertidos. ou
		 * seja, o primeiro elemento de A passa a ser o ultimo de B, o segundo elemento
		 * de A passa a ser o penultimo de B e assim por diante
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o vetor A: ");
			vetorA[i] = scan.nextInt();

			vetorB[vetorA.length - 1 - i] = vetorA[i];
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
