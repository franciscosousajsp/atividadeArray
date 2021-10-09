package atividadeArray;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//01 - criar um vetor A com 5 elementos inteiros. 
		//Construir um vetor B do mesmo tipo e tamanho e com os "mesmos" elementos do vetor A ou seja B[i]=A[i];
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0 ; i < vetorA.length; i++) {
			System.out.println("Entre com valor do vetor A na posição "+i);
		    vetorA[i] = scan.nextInt();    
		    vetorB[i] = vetorA[i];
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
