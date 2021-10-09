package atividadeArray;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
		 * que defina escreva a soma de todos os elementos armazenados neste 
		 * neste vetor
		 **/
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com os valores do vetor A: ");
			vetorA[i] = scan.nextInt();

			soma += vetorA[i];
		}

		System.out.println("===Vetor A====");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Soma dos vetors pares : " + soma);

		scan.close();
		
	}

}
