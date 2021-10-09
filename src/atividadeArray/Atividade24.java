package atividadeArray;

import java.util.Scanner;

public class Atividade24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Números palindromos são aqueles que escritos da direita para esquerda tem o
		 * mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987;
		 * 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A
		 * de 10 elementos inteiros é um palindrom, ou seja, se o primeiro elemento do
		 * vetor é igual ao último, se o segundo elemento do vetor é igual ao penultimo
		 * e assim por diante ate verificar todos os elementos ou chegar a conclusão que
		 * o vetor não é palindromo
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores do vetor A: ");
			vetorA[i] = scan.nextInt();
		}

		boolean palindromos = true;

		for (int i = 0; i < (vetorA.length/2); i++) {
			
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromos = false;
				break;
			}
		}

		System.out.println("Vetor A");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		if (palindromos) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Não é palindromo");
		}
		scan.close();

	}

}
