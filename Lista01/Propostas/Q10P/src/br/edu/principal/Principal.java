package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		double lado1,area;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado do quadrado : ");
		 lado1 = sc1.nextDouble();
		 
		 area = lado1*lado1;
		 
		 System.out.println("A area desse quadrado é : " + area);
	}

}
