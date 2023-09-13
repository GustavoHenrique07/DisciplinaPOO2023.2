package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double lado1,lado2,area,potencia;
		
		 Scanner sc1 = new Scanner(System.in);
		
		 System.out.println("Digite a medida de um lado do comodo : ");
		 lado1 = sc1.nextDouble();
		 
		 System.out.println("Digite a medida do outro lado do comodo : ");
		 lado2 = sc1.nextDouble();
		 
		 area = lado1*lado2;
		 potencia = area*18;
		 
		 System.out.println("Para a area do comodo equivalente a : " + area + " Será necessaria a potencia de: " + potencia + "W" + " para iluminar corretamente o comodo");
	}

}
