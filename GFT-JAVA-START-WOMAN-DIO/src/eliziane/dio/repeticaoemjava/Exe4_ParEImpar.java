package eliziane.dio.repeticaoemjava;

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a N n�meros inteiros, 
 * calcule e mostre a quantidade de n�meros pares 
 * e a quantidade de n�meros �mpares.
 */

public class Exe4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		System.out.println("Quantidade de n�meros: ");
		quantNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			//se o resto da divis�o do n�mero por 2 for 0,
			if (numero % 2 == 0) quantPares++; // � igual a: quantPares + 1;
			//se n�o, o n�mero digitado � impar
			else quantImpares++;
			
			count++;
		} while (count < quantNumeros);
		
		System.out.println("Quantidade de n�meros pares: " + quantPares);
		System.out.println("Quantidade de n�meros impares: " + quantImpares);
	}

}
