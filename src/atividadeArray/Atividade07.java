package atividadeArray;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criar dois vetores A e B cada um com 10 elementos interiros. Contruir um Vetor C, onde elemento
		//de C é a soma dos respectivos elementos em A e B, ou seja C[i] = A[i]+B[i];
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		

		for(int i =0 ; i < vetorA.length; i++) {
			System.out.println("Entre com valor do vetor A na posição "+i);
		    vetorA[i] = scan.nextInt();    
		    
		}
		
		for(int i =0 ; i < vetorB.length; i++) {
			System.out.println("Entre com valor do vetor B na posição "+i);
		    vetorB[i] = scan.nextInt();    
		    vetorC[i] = vetorA[i]-vetorB[i];
		}
		
		System.out.println("===Vetor A====");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println("\n\n===Vetor B===");		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		
		System.out.println("\n\n===Vetor C===");	
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i]+" ");
		}
		
		scan.close();
	}

}
