package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double  pre, venda, novo_pre = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço atual: ");
		pre = sc.nextDouble();
		
		System.out.println("Digite a venda media mensal: ");
		venda = sc.nextDouble();

		if(venda < 500 || pre < 30) {
			novo_pre = pre + 10 / 100 * pre;
		}
		else if ((venda>=500 && venda<1200) || (pre>=30 && pre<80)) {
			novo_pre = pre + 15/100 * pre;
		}
		else if(venda>=1200 || pre>=80) {
			 novo_pre = pre - 20/100 * pre;
		}
		
		
		System.out.println("O novo preço será: " + novo_pre);
	}
}
