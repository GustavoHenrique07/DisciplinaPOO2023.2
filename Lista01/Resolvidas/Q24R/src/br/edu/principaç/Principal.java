package br.edu.principaç;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double hora, h, m, conversao;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de horas em um numero real: ");
		hora = sc.nextDouble();
		
		h = (int) hora;
		m = hora - h;
		conversao = (h * 60) + (m * 100);
		
		System.out.println("O total de minutos foi: " + conversao);
	}

}
