package eliziane.dio.repeticaoemjava;

import java.util.Scanner;

/*Exerc�cio Estruturas Repeti��o DIO GFT Start Woman
 * Fa�a um programa que pe�a a nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inv�lido, fora das condi��es,
 * e continue pedindo
 * at� que o usu�rio informe um valor v�lido
 */

public class Exe2_Nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Insira a nota: ");
		nota = scan.nextInt();
		
		//se a condi��o for true pede para digitar novamente, se n�o encerra-se o programa
		while (nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida, digite novamente:!");
			nota = scan.nextInt();
		}
		System.out.println("O la�o encerrou-se!");
		
	}

}
