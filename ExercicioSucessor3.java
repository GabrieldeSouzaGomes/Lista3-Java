//2) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu sucessor.

package lista03;

import java.util.Scanner;

public class ExercicioSucessor3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner para ler do teclado

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt(); // Lê o número digitado

		int sucessor = numero + 1; // Calcula o sucessor

		System.out.println("O sucessor de " + numero + " é " + sucessor); // Exibe o resultado

		scanner.close(); // Fecha o Scanner
	}
}

