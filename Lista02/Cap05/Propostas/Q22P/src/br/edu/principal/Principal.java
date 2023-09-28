package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double idade,alt,soma_alt = 0,cont = 0,media_alt;
		
		Scanner sc = new Scanner(System.in);
		
		do {
            System.out.print("Digite a Idade: ");
            idade = sc.nextDouble();
            
            if (idade > 0) {
                System.out.print("Digite a Altura: ");
                alt = sc.nextDouble();
                
                if (idade > 50) {
                    soma_alt += alt;
                    cont++;
                }
            }
            
        } while (idade > 0); 
	
		if (cont > 0) {
			media_alt = soma_alt / cont;
			System.out.println("A media das alturas das pessoas com mais de 50 anos é: " + media_alt);
		}
		else {
			System.out.println("Não houve pessoas com mais de 50 anos");
		}
	
	}

}
