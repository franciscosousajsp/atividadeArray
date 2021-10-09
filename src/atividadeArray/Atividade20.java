package atividadeArray;

import java.util.Scanner;

public class Atividade20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * implementar um programa que obtenha a cotacao do dolar em relacao ao real  
		 * e a seguir armazenar em vetor a com 20 elementos as seguintes conversoes 
		 * A[i] = cotação do dolar * i, para todo i variaveis de 1 ate 20
		 * */
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		
		System.out.print("Entre com a cotação do Dolar: ");
		double cotacao = scan.nextDouble();
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao*(i+1);
		}
		System.out.println();
		System.out.println("Listagem da cotação de 1 até 20");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(String.format("R$ %.2f",  vetorA[i]) + " ");
		}
		
		scan.close();
		
	}

}
