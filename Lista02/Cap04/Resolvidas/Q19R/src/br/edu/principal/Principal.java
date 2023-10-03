package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura , peso ;
		
		System.out.println("Digite o valor da altura em cm : ");
		altura = sc.nextDouble();
		System.out.println("Digite o valor do peso em kg : ");
		peso = sc.nextDouble();
		
		if(altura < 120) {
			if(peso<=60) {
				System.out.println("classificação A.");
			} else if(peso > 60 && peso <=90) {
				System.out.println("classificação D.");
			} else if(peso>90) {
				System.out.println("classificação G.");
			}
		} else if (altura >=120 && altura <=170) {
			if(peso<=60) {
				System.out.println("classificação B.");
			} else if(peso > 60 && peso <=90) {
				System.out.println("classificação E.");
			} else if(peso>90) {
				System.out.println("classificação H.");
			}
		} else if (altura > 170) {
			if(peso<=60) {
				System.out.println("classificação C.");
			} else if(peso > 60 && peso <=90) {
				System.out.println("classificação F.");
			} else if(peso>90) {
				System.out.println("classificação I.");
			}
		}
	}


		
	}
