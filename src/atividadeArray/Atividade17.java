package atividadeArray;

import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que 
		 * determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos
		 * */
		
		Scanner scan = new Scanner(System.in);
		int[] idade = new int[10];

		int qtdPessoa = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com a idade: ");
			idade[i] = scan.nextInt();
			if (idade[i] > 35) {

				qtdPessoa++;
			}

		}

		
		System.out.println("===Idade das Pessoas ====");
		for (int i = 0; i < idade.length; i++) {
			System.out.print(idade[i] + " ");
		}
		
		System.out.println();
		System.out.println("Quantidade idade Superior a 35: " + qtdPessoa);
		
		scan.close();
	}

}
