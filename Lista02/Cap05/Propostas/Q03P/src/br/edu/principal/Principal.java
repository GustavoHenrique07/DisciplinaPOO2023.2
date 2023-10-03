package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double idade;
        int[] faixa_etaria = new int[5];
       
        int total_de_Pessoas = 8; 

        for (int i = 0; i < total_de_Pessoas; i++) {
            System.out.print("Digite a idade da pessoa" + (i + 1) + ": ");
            idade = sc.nextDouble();

            if (idade <= 15) {
                faixa_etaria[0]++;
            } else if (idade <= 30) {
                faixa_etaria[1]++;
            } else if (idade <= 45) {
                faixa_etaria[2]++;
            } else if (idade <= 60) {
                faixa_etaria[3]++;
            } else {
                faixa_etaria[4]++;
            }
        }

       
        System.out.println("Quantidade de pessoas em cada faixa etária:");
        System.out.println("1a Faixa (Até 15 anos): " + faixa_etaria[0]);
        System.out.println("2a Faixa (16 a 30 anos): " +  faixa_etaria[1]);
        System.out.println("3a Faixa (31 a 45 anos): " +  faixa_etaria[2]);
        System.out.println("4a Faixa (46 a 60 anos): " + faixa_etaria [3]);
        System.out.println("5a Faixa (Acima de 60 anos): " +  faixa_etaria[4]);

         double pri_faixa_et =(double)faixa_etaria[0]/ total_de_Pessoas * 10;
         double ult_faixa_et =(double)faixa_etaria[4]/total_de_Pessoas * 10;

       System.out.println("Porcentagem de pessoas na primeira faixa etária em relacao ao total de pessoas: " + pri_faixa_et +"%");
        System.out.println("Porcentagem de pessoas na última faixa etária: " + pri_faixa_et +"%");
    }
}