package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int ang1,ang2,ang3;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Digite a medida do primeiro angulo : ");
		 ang1 = sc1.nextInt();
		 
		System.out.println("Digite a medida do segundo angulo : ");
		 ang2 = sc1.nextInt();
		 
		 ang3 = 180 - (ang1 + ang2);
		 
		 System.out.println("A medida do terceiro angulo será : " + ang3);
	}

}
