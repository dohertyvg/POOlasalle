import java.util.Scanner;

/* Vitor Gomes Doherty - Mat: 0050014453 
crie um programa para ler um n�mero inteiro e dizer se o n�mero � par ou �mpar
*/

public class Ex2VitorD {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero inteiro:");
		numero = input.nextInt();
		
		if(numero%2 == 0)
		{
			System.out.println("O numero e par");
		}
		else 
		{
			System.out.println("O numero e impar");
		}

		
	}

}
