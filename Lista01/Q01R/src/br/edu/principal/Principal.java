package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double n1,n2,n3,n4,soma;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		n1 = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite a segunda nota:");
		n2 = sc2.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Digite a terceira nota:");
		n3 = sc3.nextDouble();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Digite a quarta nota:");
		n4 = sc4.nextDouble();
		
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();

		soma = n1 + n2 + n3 + n4;
		
		System.out.println("A soma das notas foi: " + soma );
	}

}
