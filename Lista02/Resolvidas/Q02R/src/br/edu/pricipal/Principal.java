package br.edu.pricipal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media, nota_exame;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota:");
		nota1 = sc.nextDouble() ;
		
		System.out.println("Insira a segunda nota:");
		nota2 = sc.nextDouble() ;
		
		System.out.println("Insira a terceira nota:");
		nota3 = sc.nextDouble() ;
		
		media = (nota1 + nota2 + nota3)/3;
		System.out.println("Media Aritimetica:" + media);
		
		if (media >= 0 && media < 3) {
			System.out.println("Reprovado");
			
		}
		else if (media >= 3 && media < 7) {
			System.out.println("Exame Final:");
			nota_exame = 12 - media;
			System.out.println("Deve tirar nota: " + nota_exame + " para ser aprovado");
					
		}
		else if(media >= 7 && media <= 10) {
			System.out.println("Aprovado!!");
		}
	}

}
