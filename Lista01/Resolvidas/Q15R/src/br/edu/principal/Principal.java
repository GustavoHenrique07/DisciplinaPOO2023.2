package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double p_fab, perc_d, perc_i, vlr_d, vlr_i, p_final;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite o valor de fabricação do veículo:");
		p_fab = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite o percentual de lucro:");
		perc_d = sc2.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Digite o percentual de impostos:");
		perc_i = sc3.nextDouble();
		
		vlr_d = p_fab * perc_d / 100;
		vlr_i = p_fab * perc_i / 100;
		p_final = p_fab + vlr_d + vlr_i;
		
		sc1.close();
		sc2.close();
		sc3.close();
		
		System.out.println("O valor do percentual de lucro foi: " + vlr_d);
		System.out.println("O valor do percentual de impostos foi: " + vlr_i);
		System.out.println("O valor final é: " + p_final);
		
		
	}

}
