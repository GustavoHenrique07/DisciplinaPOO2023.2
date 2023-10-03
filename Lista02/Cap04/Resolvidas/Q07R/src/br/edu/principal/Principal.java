package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A , B , C , I;

		System.out.println("Digite o valor de A : ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B : ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C : ");
		C = sc.nextDouble();
		System.out.println("Digite o valor de I (1,2 ou 3) : ");
		I = sc.nextDouble();

		if (I == 1) {
		if(A < B && A < C) {
		if(B < C) {
		System.out.print("A ordem crescente dos números é: " + A + " - " + B + " - " + C);
		}else {
		System.out.print("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
		}
		}
		if(B < A && B < C) {
		if(A < C) {
		System.out.print("A ordem crescente dos números é: " + B + " - " + A + " - " + C);
		}else {
		System.out.print("A ordem crescente dos números é: " + B + " - " + C + " - " + A);
		}
		}
		if(C < A && C < B) {
		if(A < B) {
		System.out.print("A ordem crescente dos números é: " + C + " - " + B + " - " + A);
		}else {
		System.out.print("A ordem crescente dos números é: " + C + " - " + A + " - " + B);
		}
		}
		}
		else if (I == 2) {
		if(A > B && A > C) {
		if(B > C) {
		System.out.print("A ordem decrescente dos números é: " + A + " - " + B + " - " + C);
		}else {
		System.out.print("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
		}
		}
		if(B > A && B > C) {
		if(A > C) {
		System.out.print("A ordem decrescente dos números é: " + B + " - " + A + " - " + C);
		}else {
		System.out.print("A ordem decrescente dos números é: " + B + " - " + C + " - " + A);
		}
		}
		if(C > A && C > B) {
		if(A > B) {
		System.out.print("A ordem decrescente dos números é: " + C + " - " + B + " - " + A);
		}else {
		System.out.print("A ordem decrescente dos números é: " + C + " - " + A + " - " + B);
		}
		}
		}
		else if (I == 3) {
		if(A > B && A > C) {
		System.out.print("A ordem desejada dos números é: " + A + " - " + B + " - " + C);
		}
		if(B > A && B > C) {
		System.out.print("A ordem desejada dos números é: " + B + " - " + A + " - " + C);
		}
		if(C > A && C > B) {
		System.out.print("A ordem desejada dos números é: " + C + " - " + B + " - " + A);

		}
		}
		else {
		System.out.println("Digite uma opção válida: ");
		System.out.print("Digite um valor para I (1, 2 ou 3): ");
		I = sc.nextDouble();
		}

		}



		


	}


