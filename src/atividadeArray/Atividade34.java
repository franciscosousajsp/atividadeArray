package atividadeArray;

import java.util.Scanner;

public class Atividade34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima
		 * cada elemento do vetor A e a relação de todos os pares de 0 ate respectivo
		 * elemento
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com Vetor A");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analisando o vetor a " + vetorA[i]);
			for (int j = 1; j <= vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j +" ");
				}
			}
		}

		scan.close();

	}

}
