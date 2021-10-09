package atividadeArray;

import java.util.Scanner;

public class Atividade18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/* Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que 
		 * determine e escreva a menor e a maior idades de suas respectivas posições
		 * */
		
		Scanner scan = new Scanner(System.in);
		int[] idade = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Entre com a idade: ");
			idade[i] = scan.nextInt();
			
		}

		int maior = idade[0];
		int indexMaior = 0;
		int menor = idade[0];
		int indexMenor = 0;
		
		for (int i = 0; i < idade.length; i++) {
			if(idade[i] > maior) {
				maior = idade[i];
				indexMaior = i;		
			}else if(idade[i] < menor) {
				menor = idade[i];
				indexMenor = i;
			}
		}
		
		System.out.println("===Idade das Pessoas ====");
		for (int i = 0; i < idade.length; i++) {
			System.out.print(idade[i] + " ");
		}
		
		System.out.println();
		System.out.println("Maiores Idade : " + maior);
		System.out.println("posicao : " + indexMaior);
		System.out.println("Menores Idade : " + menor);
		System.out.println("posicao : " + indexMenor);
		
		scan.close();
	}

}
