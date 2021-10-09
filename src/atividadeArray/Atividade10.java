package atividadeArray;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho, sendo que cada elemento do Vetor B deverá ser o resto da
		 * divisão do respectivo elemento de A por 2(dois), ou seja: B[i] := A[j] % 2
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valor do vetor A: ");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i]%2;

		}
		
		System.out.println("===Vetor A====");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println("\n\n===Vetor B===");		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}

		scan.close();

	}

}
