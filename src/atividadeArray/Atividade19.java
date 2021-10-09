package atividadeArray;

import java.util.Scanner;

public class Atividade19 {

	public static void main(String[] args) {

		/*
		 * Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as
		 * notas informadas em dois vetores nota1 e nota2 do tipo real. e Escreva um
		 * programa que calcule a média aritmetica simples das notas informadas
		 * armazenando o resultado em um vetor Resultado de mesmo tipo de tamanho. ao
		 * mostrar os resultados exibir a situação de cada aluno. se a media calculada
		 * for superior ou igual a 7 o aluno está aprovado caso contrario a situação do
		 * aluno será reprovado
		 */
		Scanner scan = new Scanner(System.in);

		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];
		double[] resultado = new double[nota1.length];

		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Aluno " + (i + 1));
			System.out.print("Entre com a 1º Nota: ");
			nota1[i] = scan.nextDouble();
			System.out.print("Entre com a 2º Nota: ");
			nota2[i] = scan.nextDouble();

			resultado[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		System.out.println();
		System.out.println("Nota 1: ");
		for (int i = 0; i < nota1.length; i++) {
			System.out.print(nota1[i]+" ");

		}

		System.out.println();
		System.out.println("Nota 2: ");
		for (int i = 0; i < nota1.length; i++) {
			System.out.print(nota2[i]+" ");

		}
		System.out.println();
		System.out.println("Resultado das notas: ");
		
		int totalAprovado = 0;
		int totalReprovado = 0;
		for (int i = 0; i < nota1.length; i++) {
			if (resultado[i] >= 7) {
				System.out.println("nota: " + resultado[i] + " Situação: Aprovado");
				totalAprovado++;
			} else {
				System.out.println("nota: " + resultado[i] + " Situação: Reprovado");
				totalReprovado++;
			}

		}
		
		System.out.println();
		System.out.println("Total dos APROVADOS "+totalAprovado);
		System.out.println("Total dos REPROVADOS "+totalReprovado);

		scan.close();
	}
	

}
