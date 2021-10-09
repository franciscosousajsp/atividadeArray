package atividadeArray;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: 
		 * a) a soma de elementos armazenados neste vetor que são inferiores a 15
		 * b) a quantidade de elementos armazenados no vetor que são igual a 15
		 * c) a média dos elementos armazenados no vetor que são superior a 15
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int somaMenor = 0;
		int qtdIgual = 0;
		int somaMaior = 0;
		int qtdMedia = 0;
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o vetor A ");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] < 15) {
				somaMenor += vetorA[i];
			}else if(vetorA[i] == 15) {
				qtdIgual++;
			}else {
				somaMaior+=vetorA[i];
				qtdMedia++;
			}
		}
		
		System.out.println("===Vetor A====");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("a soma a inferiores a 15:  " + somaMenor);
		System.out.println("a quantidade de elementos  igual a 15:  " + qtdIgual);
		System.out.println("a média  superior a 15  " + (somaMaior/qtdMedia ));
		
		scan.close();
	}

}
