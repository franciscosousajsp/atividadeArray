package atividadeArray;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	04 - criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do
       //   vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja b[i] = sqrt(A[i]);
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i =0 ; i < vetorA.length; i++) {
			System.out.println("Entre com valor do vetor A na posição "+i);
		    vetorA[i] = scan.nextInt();    
		    vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.println("===Vetor A====");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println("\n\n===Vetor B===");		
		DecimalFormat df = new DecimalFormat("###.##");
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i])+" ");
		}
		
		scan.close();
	}

}
