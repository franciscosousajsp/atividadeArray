package atividadeArray;

import java.util.Scanner;

public class Atividade29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ler dois vetores A e B com 10 elementos cada. Construir um vetor C
		 * sendo este a junção dos dois outros vetores. Os primeiros 10 elementos
		 * de C deverão receber os elementos de A e os ultimos elementos C deverão 
		 * os elementos  de B. Desta forma c deverá ter o dobro de elementos de A e B,
		 * ou seja, 20 elementos
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int [] vetorB = new int[vetorA.length];
		int [] vetorC = new int[2*vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o vetor A: ");
			vetorA[i] = scan.nextInt();
			
			vetorC[i] = vetorA[i];
			
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o vetor B: ");
			vetorB[i] = scan.nextInt();
			
			vetorC[vetorA.length+i] = vetorB[i];
			
		}
		
		System.out.println("Vetor A");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Vetor B");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.println("Vetor C");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		scan.close();
		
	}

}
