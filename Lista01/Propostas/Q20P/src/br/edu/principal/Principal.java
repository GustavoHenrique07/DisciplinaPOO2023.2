package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double ang,dist,rad,escada;
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        ang = scanner.nextDouble();
        
        System.out.print("Digite a distancia em que a escad esta da parede: ");
        dist = scanner.nextDouble();
        
        rad = Math.toRadians(ang);
        
        escada = dist/ Math.cos(rad);
        
        System.out.print("o comprimento da escada é:" + escada );
        
	}

}
