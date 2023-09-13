package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double custo, convite, qtd;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o custo para a realização do evento: ");
		custo = sc.nextDouble();
		
		System.out.println("Digite o valor do convite do evento: ");
		convite = sc.nextDouble();
		
		qtd = custo / convite;
		
		System.out.println("Para cobrir o valor do evento será necessaria a venda de: " + qtd + " convites.");
	}

}
