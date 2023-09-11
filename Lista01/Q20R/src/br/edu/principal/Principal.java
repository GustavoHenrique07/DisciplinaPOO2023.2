package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double ang, alt, escada, radiano;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite em graus a medida do angulo formado pela escada encostada na parede: ");
		ang = sc.nextDouble();
		
		System.out.println("Digite a altura da parede onde a escada esta encostada: ");
		alt = sc.nextDouble();
		
		radiano = ang * 3.14 / 180;
		escada = alt / Math.sin(radiano);
				
		System.out.println("O tamanho da escada é: " + escada);
	}

}
