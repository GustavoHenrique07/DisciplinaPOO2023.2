package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int x, y;
        int[][] matriz = new int[6][6];

        for (x = 0; x < 6; x++) {
            for (y = 0; y < 6; y++) {
                System.out.print("Digite um número para matriz[" + (x + 1) + "][" + (y + 1) + "]: ");
                matriz[x][y] = scanner.nextInt();
            }
        }

        int menor = menor_elemento(matriz);
        System.out.println("Menor elemento da matriz: " + menor);
    }

    public static int menor_elemento(int[][] m) {
        int me = m[0][5];
        int j = 4;

        for (int i = 1; i < 6; i++) {
            if (m[i][j] < me) {
                me = m[i][j];
            }
            j--;
        }

        return me;
    }


	}


