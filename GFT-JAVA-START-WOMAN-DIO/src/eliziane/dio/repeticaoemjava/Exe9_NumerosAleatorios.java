package eliziane.dio.repeticaoemjava;

import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (classe random que faz isso)
 *  (entre 0  e 100)
 * armazene-os num vetor. Ao final mostre os números e seus sucessores.
 */

public class Exe9_NumerosAleatorios {
	public static void main(String[] args) {
		Random random = new Random();
		
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print("Números Aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.print("\nAntecessores dos Números Aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero- 1) + " ");
		}
		
		
		System.out.print("\nSucessores dos Números Aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero+ 1) + " ");
		}
		
	}

}
