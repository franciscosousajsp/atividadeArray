package atividadeArray;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//02 - criar um vetor A com 8 elementos inteiros. 
		//Construir um vetor B do mesmo tipo e tamanho e com os "mesmos" elementos do vetor A multiplicados por 2 ou seja: B[i]=A[i]*2;
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i =0 ; i < vetorA.length; i++) {
			System.out.println("Entre com valor do vetor A na posi��o "+i);
		    vetorA[i] = scan.nextInt();    
		    vetorB[i] = vetorA[i]*2;
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
