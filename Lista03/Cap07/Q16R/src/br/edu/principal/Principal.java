package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[][] mat = new int[7][7];
        int[] vet1 = new int[7];
        int[] vet2 = new int[7];
        int maior, menor;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Digite o valor para mat[" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 7; i++) {
            maior = mat[i][0];
            for (int j = 1; j < 7; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
            vet1[i] = maior;
        }

        for (int i = 0; i < 7; i++) {
            menor = mat[0][i];
            for (int j = 1; j < 7; j++) {
                if (mat[j][i] < menor) {
                    menor = mat[j][i];
                }
            }
            vet2[i] = menor;
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(vet1[i]);
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(vet2[i]);
        }
	}

}
