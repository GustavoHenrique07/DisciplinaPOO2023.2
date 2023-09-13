package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double real,dolar,marco,libra;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Digite o valor que vai ser levado para a viagem em reais : ");
		 real = sc1.nextInt();
		 
		 dolar = real * 1.80;
		 marco = real * 2;
		 libra = real * 3.57;
		 
		 System.out.println("Digite o valor que vai ser levado para a viagem em dolares será : " + dolar);
		 System.out.println("Digite o valor que vai ser levado para a viagem em marcos alemães será : " + marco);
		 System.out.println("Digite o valor que vai ser levado para a viagem em libras será : " + libra);
	}

}
