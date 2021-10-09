package atividadeArray;

import java.util.Scanner;

public class ArrayFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Fatorial de "+vetorA[i]);
			vetorB[i] = 1;
			for(int j = 1; j <= vetorA[i]; j++) {
				vetorB[i] *= j;
				
				System.out.print(vetorB[i] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
