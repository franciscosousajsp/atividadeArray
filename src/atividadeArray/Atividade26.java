package atividadeArray;

import java.util.Scanner;

public class Atividade26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
		 * vetor C do mesmo tipo e tamanho, obecendo as seguintes regras de formação :
		 * a) Ci deverá receber 1 quando Ai for maior que Bi b) Ci deverá receber 0
		 * quando Ai for igual a Bi c) Ci devera receber -1 quando Ai for menor que Bi
		 */

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o Vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o Vetor B: ");
			vetorB[i] = scan.nextInt();

			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}

		}

		System.out.println();
		System.out.println("Vetor A");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Vetor B");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		System.out.println();
		System.out.println("Vetor C");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		scan.close();
	}
	


}
