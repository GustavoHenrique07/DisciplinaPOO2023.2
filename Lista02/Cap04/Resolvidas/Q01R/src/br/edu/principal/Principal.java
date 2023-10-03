package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota_trab , aval_Sem ,exame_Fin = 0 , media;

		

		System.out.print("Digite a nota do trabalho de laboratório: ");

		nota_trab = sc.nextDouble();

		System.out.print("Digite a nota da prova semestral: ");

		aval_Sem = sc.nextDouble();

		System.out.print("Digite a nota do exame final: ");

		int exameFin1 = (int) sc.nextDouble();



		System.out.println(" ");

		media = ((nota_trab * 2) + (aval_Sem * 3) + (exame_Fin * 5)) / 10;

		System.out.println("Media ponderada: " + media);

		if(media >= 8 && media <= 10) {

			System.out.println("Obteve Conceito A");

		}

		else if(media >= 7 && media < 8) {

			System.out.println("Obteve Conceito B");

		}

		else if(media >= 6 && media < 7) {

			System.out.println("Obteve Conceito C");

		}

		else if(media >= 5 && media < 6) {

			System.out.println("Obteve Conceito D");

		}

		else {

			System.out.println("Obteve Conceito E");

		}

	}







	





	}


