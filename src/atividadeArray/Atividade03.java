package atividadeArray;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//03 - criar um vetor A com 15 elementos inteiros. 
		//Construir um vetor B do mesmo tamanho, sendo que cada elemento o vetor B
	    // deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i]*A[i]
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0 ; i < vetorA.length; i++) {
			System.out.println("Entre com valor do vetor A na posição "+i);
		    vetorA[i] = scan.nextInt();    
		    vetorB[i] = vetorA[i]*vetorA[i];
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
