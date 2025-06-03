// Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
package lista03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner para entrada de dados

		System.out.print("Digite a base do retângulo: ");
		double base = scanner.nextDouble(); // Lê a base

		System.out.print("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble(); // Lê a altura

		double area = base * altura; // Calcula a área

		System.out.println("A área do retângulo é: " + area); // Exibe o resultado

		scanner.close(); // Fecha o Scanner
	}
}
