package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {	
	
	double dep,taxa,rend,total;
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Digite o deposito: ");
	dep = sc1.nextDouble();
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Digite a porcentagem da taxa: ");
	taxa = sc2.nextDouble();
	
	rend = dep * taxa/100;
	total = dep + rend;
	
	sc1.close();
	sc2.close();
	
	System.out.println("O deposito rendeu o total de: " + rend);
	System.out.println("O valor total aopós o rendimento foi: " + total);
}
}