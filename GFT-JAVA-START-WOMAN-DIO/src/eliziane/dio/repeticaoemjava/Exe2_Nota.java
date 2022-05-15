package eliziane.dio.repeticaoemjava;

import java.util.Scanner;

/*Exercício Estruturas Repetição DIO GFT Start Woman
 * Faça um programa que peça a nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido, fora das condições,
 * e continue pedindo
 * até que o usuário informe um valor válido
 */

public class Exe2_Nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Insira a nota: ");
		nota = scan.nextInt();
		
		//se a condição for true pede para digitar novamente, se não encerra-se o programa
		while (nota < 0 || nota > 10) {
			System.out.println("Nota inválida, digite novamente:!");
			nota = scan.nextInt();
		}
		System.out.println("O laço encerrou-se!");
		
	}

}
