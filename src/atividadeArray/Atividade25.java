package atividadeArray;

import java.util.Scanner;

public class Atividade25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho, obedecendo as seguintes regras de formação: a)Bi deverá
		 * receber 1 quando Ai for par; b)Bi deverá receber 0 quando for Ai for impar
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o vetor A: ");
			vetorA[i] = scan.nextInt();

			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}

		System.out.println("Vetor A ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.println("Vetor B ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		scan.close();
	}

}
