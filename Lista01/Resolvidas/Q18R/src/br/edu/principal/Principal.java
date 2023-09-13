package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double peso_saco, racao_gato1, racao_gato2, total_final;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso em gramas do saco de ração:");
		peso_saco = sc.nextDouble();
		
		System.out.println("Digite quantas gramas de ração foram colocadas para o primeiro gato em cada dia: ");
		racao_gato1 = sc.nextDouble();
		
		System.out.println("Digite quantas gramas de ração foram colocadas para o segundo gato em cada dia: ");
		racao_gato2 = sc.nextDouble();
		
		racao_gato1 = racao_gato1 / 1000;
		racao_gato2 = racao_gato2 / 1000;
		total_final = peso_saco - (5 * (racao_gato1 + racao_gato2));
		
		System.out.println("Restam:" + total_final + "gramas de ração.");
	}

}
