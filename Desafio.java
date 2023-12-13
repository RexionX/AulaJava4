package Desafio01;

import java.util.Scanner;

public class Desafio {

	private static int[] vetorInteriros;

	public static void main(String[] args) {
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int posicao;
		int i =0;
		boolean localizarPosicao = false;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que deseja saber: ");
		posicao =leia.nextInt();
		
		while (i < 10 && localizarPosicao == false ) {
			if (vetorInteiros[i] == posicao) {
				localizarPosicao = true;
				
			}
			
			i++;
		}
		
		if (localizarPosicao == false) {
			System.out.println("Número " + posicao + "não achou. ");
		} else {
			System.out.println("Número " + posicao + " está na posicão " + i);
		}
	}	

}
