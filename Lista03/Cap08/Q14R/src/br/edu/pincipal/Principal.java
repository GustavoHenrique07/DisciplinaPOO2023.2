package br.edu.pincipal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
        int[] vet1 = new int[10];
        int[] vet2= new int[20];
        int[] vet3 = new int[30];
        int cont;
        for (x = 0; x < 10; x++) {
            do {
                System.out.print("Digite um valor para vet1[" + x + "]: ");
                vet1[x] = sc.nextInt();
            } while (vet1[x] < 0);
        }

        for (x = 0; x < 10; x++) {
            do {
                System.out.print("Digite um valor para vet2[" + x + "]: ");
                vet2[x] = sc.nextInt();
            } while (vet2[x] < 0);
        }

        cont = uniao(vet1, vet2, vet3);
        x=1;

        for (x = 0; x < cont; x++) {
            System.out.println(vet3[x]);
        }
      
    }

    public static int uniao(int[] a, int[] b, int[] u) {
        int i, j, k, cont;
        k = 1;

        for (i = 1; i < 10; i++) {
            cont = 1;

            while (cont < k && a[i] != u[cont]) {
                cont++;
            }

            if (cont == k) {
                u[k] = a[i];
                k++;
            }
        }

        for (i = 1; i < 10; i++) {
            cont = 1;

            while (cont < k && b[i] != u[cont]) {
                cont++;
            }

            if (cont == k) {
                u[k] = b[i];
                k++;
            }
        }

        return k;
    }

    }

