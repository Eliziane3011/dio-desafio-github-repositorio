package eliziane.dio.repeticaoemjava;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros, 
 * calcule e mostre a quantidade de números pares 
 * e a quantidade de números ímpares.
 */

public class Exe4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		System.out.println("Quantidade de números: ");
		quantNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			//se o resto da divisão do número por 2 for 0,
			if (numero % 2 == 0) quantPares++; // é igual a: quantPares + 1;
			//se não, o número digitado é impar
			else quantImpares++;
			
			count++;
		} while (count < quantNumeros);
		
		System.out.println("Quantidade de números pares: " + quantPares);
		System.out.println("Quantidade de números impares: " + quantImpares);
	}

}
