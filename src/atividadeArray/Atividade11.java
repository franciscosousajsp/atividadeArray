package atividadeArray;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
		 * define e escreve a quantidade de elementos armazenados neste vetor que são
		 * pares
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int qtPar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com os valores do vetor A: ");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 == 0) {
				qtPar++;
			}
		}

		System.out.println("===Vetor A====");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Quantidade de numeros Par: " + qtPar);

		scan.close();
	}

}
