package atividadeArray;

import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos
		 * pares e impares respectivamente, armazenados neste vetor
		 * */
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int qtdPar = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com os valores do vetor A: ");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				qtdPar++;
			}

		}

		int qtdImpar = vetorA.length - qtdPar;

		double perPar = qtdImpar * 100 / vetorA.length;
		double percImpar = 100 - perPar;

		System.out.println("===Vetor A====");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("percentual par  " + perPar);
		System.out.println("percentual par  " + percImpar);

		scan.close();
	}

}
