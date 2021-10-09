package atividadeArray;

import java.util.Scanner;

public class ArrayPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com elemento do vetor A ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			int qtdDivisor = 0;
			for (int j = 1; j <= vetorA[i]; j++) {
				if(vetorA[i] % j == 0) {
					qtdDivisor++;
				}
			}
			
			if(qtdDivisor == 2) {
				System.out.println(vetorA[i]+" é primo");
			}else {
				System.out.println(vetorA[i]+" Não é primo");
			}
		}

		scan.close();
	}

}
