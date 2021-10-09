package atividadeArray;

import java.util.Scanner;

public class Atividade27 {

	public static void main(String[] args) {

		/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
		 * mesmo tipo e tamanho, obedecendo as seguintes regras de forma��o :
		 * a) Bi dever� receber 'a' quando A for menor que 7
		 * b) Bi dever� receber 'b' quando A for igua a 7;
		 * c) Bi dever� receber 'c' quando A for maior que 7 e menor que 10
		 * d) Bi dever� receber 'd' quando A for igual a 10 
		 * e) Bi dever� receber 'e' quando A for maior que 10 
		 * Sugestao charB[10]
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);

		int vetorA[] = new int[10];
		char vetorB[] = new char[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o vetor A ");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if (vetorA[i] == 7) {
				vetorB[i] = 'b';
			} else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			} else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else if (vetorA[i] > 10) {
				vetorB[i] = 'e';
			}
		}

		System.out.println("Vetor A");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Vetor B");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		scan.close();

	}

}
