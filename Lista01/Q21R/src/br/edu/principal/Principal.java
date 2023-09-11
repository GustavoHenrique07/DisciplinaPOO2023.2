package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double x,y,z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da escada: ");
		z = sc.nextDouble();
		
		System.out.println("Digite a altura que se deseja pregar o quadro: ");
		x = sc.nextDouble();
		
		y = Math.pow(z, 2) - Math.pow(x, 2);
		y = Math. sqrt(y);
		
		System.out.println("A distancia que a escada deve estar da parede é: " + y);
		
	}
	

}
