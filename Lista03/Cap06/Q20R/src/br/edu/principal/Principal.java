package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[] vet = new int[5];

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vet[i] = scanner.nextInt();
        }

        System.out.print("Digite o código (0 para sair, 1 para mostrar na ordem direta, 2 para mostrar na ordem inversa): ");
        int cod = scanner.nextInt();

        if (cod == 0) {
            System.out.println("Fim");
        } else if (cod == 1) {
            for (int i = 0; i < 5; i++) {
                System.out.println(vet[i]);
            }
        } else if (cod == 2) {
            for (int i = 4; i >= 0; i--) {
                System.out.println(vet[i]);
            }
        } else {
            System.out.println("Código inválido");
        }
	}

}
