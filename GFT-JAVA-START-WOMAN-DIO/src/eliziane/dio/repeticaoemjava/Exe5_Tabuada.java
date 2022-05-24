package eliziane.dio.repeticaoemjava;
/*
 * Desenvolva um gerador de tabuada, capaz de gerar
 * a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 */

import java.util.Scanner;

public class Exe5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número que quer a Tabuada: ");
		int tabuada = scan.nextInt();
		
		System.out.println("Tabuada de: " + tabuada);
		for( int i = 1; i <= 10; i++) {
			System.out.println( tabuada + " X " + i + " = " + (tabuada*i));
		
		}
	}
}
