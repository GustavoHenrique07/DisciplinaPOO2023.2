package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double a_degrau, a_usuario, qtd_degraus;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite em metros a altura da escada que voce deseja subir:");
		a_usuario = sc.nextDouble();
		System.out.println("Digite em metros a altura dos degraus:");
		a_degrau = sc.nextDouble();
		
		qtd_degraus = a_usuario / a_degrau;
		
		System.out.println("Você subiu o total de: " + qtd_degraus + " degraus");
		
		
	}

}
