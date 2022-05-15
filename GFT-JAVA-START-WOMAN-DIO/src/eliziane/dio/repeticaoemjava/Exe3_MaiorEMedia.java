package eliziane.dio.repeticaoemjava;

import java.util.Scanner;

/*Exercício Estruturas Repetição DIO GFT Start Woman
 * Faça um programa que leia 05 números
 * e informe o maior número
 * e a média desses números.
 */

public class Exe3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;
		int maior = 0;
		int soma = 0;

		int cont = 0;
		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();

			// Numero: + cont;
			soma = soma + numero;

			if (numero > maior)
				maior = numero;

			cont = cont + 1;
		} while (cont < 5);

		System.out.println("O maior número digitado é: " + maior);
		System.out.println("A soma destes números é: " + soma);
		System.out.println("A média destes números é: " + (soma / cont));

	}

}
