package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int[] primos = new int[10];
        int i, qtde, num, divisores;
        num = 101;
        qtde = 1;

        while (qtde <= 10) {
            divisores = 0;
            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }
            if (divisores <= 2) {
                primos[qtde - 1] = num;
                qtde++;
            }
            num++;
        }

        for (i = 0; i < 10; i++) {
            System.out.println(primos[i]);
        }
	}
}
