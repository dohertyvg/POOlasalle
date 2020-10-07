/* Vitor Gomes Doherty - Mat: 0050014453
Crie um programa em Java que imprima a tabuada de multiplicação de um número 
de 0-9 lido do teclado */

import java.util.Scanner;

public class Ex1VitorD {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int numero;
		int mult;
		
		System.out.println("Digite um numero inteiro de 0 a 9:");
		numero = input.nextInt();
		
		if(numero < 0 || numero > 9)
		{
			System.out.println("Numero invalido");
			System.exit(1);
		}
		
		
		for(int i=1; i <= 10; i++)
		{
			mult = numero * i;
			System.out.println(mult);
		}

	}

}
