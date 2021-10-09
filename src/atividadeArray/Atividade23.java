package atividadeArray;

import java.util.Scanner;

public class Atividade23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que
		 * verifique se "Todos" os elementos do A sao pares. Se pelo menos um elemento
		 * do vetor não for par o processo de repetição para percorrer os elementos do
		 * vetor deve ser encerrado, como sugestão. Utilize uma variavel do tipo flag
		 * para atingir este proposito.
		 */

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com vetor A: ");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 == 1) {
				break;
			}
		}

		scan.close();

	}

}
