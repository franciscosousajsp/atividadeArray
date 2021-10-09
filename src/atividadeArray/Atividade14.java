package atividadeArray;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
		 * define e escreva a media aritmetica simples dos elementos impares armazenados
		 * neste vetor
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int media = 0;
		int soma = 0;
		int qtdImpar = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com os valores do vetor A: ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 1 == 0) {
				soma += vetorA[i];
				qtdImpar++;
			}

		}

		System.out.println("===Vetor A====");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Média  " + (media += soma/qtdImpar));

		scan.close();
	}

}
