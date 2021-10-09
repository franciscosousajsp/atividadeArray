package atividadeArray;

import java.util.Scanner;

public class Atividade35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Criar um vetor A com 10 elementos inteiros. Escreva um programa
		 * que imprima cada elemento do vetor A e a relação de todos os divisores
		 * do ser respectivo.
		 * */
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com elemento A ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analisando os divisores " + vetorA[i]);
			for (int j = 1; j <= vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j + " ");
				}
			}
			System.out.println();
		}

		scan.close();
	}

}
