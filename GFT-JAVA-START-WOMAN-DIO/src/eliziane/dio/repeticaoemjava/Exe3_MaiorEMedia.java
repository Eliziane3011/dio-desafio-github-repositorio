package eliziane.dio.repeticaoemjava;

import java.util.Scanner;

/*Exerc�cio Estruturas Repeti��o DIO GFT Start Woman
 * Fa�a um programa que leia 05 n�meros
 * e informe o maior n�mero
 * e a m�dia desses n�meros.
 */

public class Exe3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;
		int maior = 0;
		int soma = 0;

		int cont = 0;
		do {
			System.out.println("Digite um n�mero: ");
			numero = scan.nextInt();

			// Numero: + cont;
			soma = soma + numero;

			if (numero > maior)
				maior = numero;

			cont = cont + 1;
		} while (cont < 5);

		System.out.println("O maior n�mero digitado �: " + maior);
		System.out.println("A soma destes n�meros �: " + soma);
		System.out.println("A m�dia destes n�meros �: " + (soma / cont));

	}

}
