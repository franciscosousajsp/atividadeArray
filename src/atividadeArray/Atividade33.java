package atividadeArray;

import java.util.Scanner;

public class Atividade33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima
		 * cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é
		 * um numero primo ou não
		 */

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com vetor A ");
			vetorA[i] = scan.nextInt();
		}

		boolean primo;
		String msn;
		for (int i = 0; i < vetorA.length; i++) {
			primo = true;
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}
			
			if(primo) {
				msn = " Primo";
			}else {
				msn = "Não é primo";
			}
			
			System.out.println(vetorA[i]+" é "+ msn);
		}

		scan.close();
	}

}
