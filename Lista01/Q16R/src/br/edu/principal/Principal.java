package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bru, imp, vlr_sal_liq;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o numero de horas trabalhadas: ");
		horas_t = sc.nextDouble();
		
		System.out.println("Digite o valor do salario minimo: ");
		vlr_sal_min = sc.nextDouble();
		
		vlr_hora_t = vlr_sal_min / 2;
		vlr_sal_bru = vlr_hora_t * horas_t;
		imp = vlr_sal_bru * 3 / 100;
		vlr_sal_liq = vlr_sal_bru - imp;
		
		System.out.println("O valor do recebimento final é: " + vlr_sal_liq);
		
		
	}

}
