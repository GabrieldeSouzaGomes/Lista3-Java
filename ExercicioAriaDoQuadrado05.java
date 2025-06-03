//5) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado.

package lista03;

import java.util.Scanner;

public class ExercicioAriaDoQuadrado05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner para entrada de dados

		System.out.print("Digite o valor do lado do quadrado: ");
		double lado = scanner.nextDouble(); // Lê o lado do quadrado

		double area = lado * lado; // Calcula a área do quadrado

		System.out.println("A área do quadrado é: " + area); // Exibe o resultado

		scanner.close(); // Fecha o Scanner
	}
}
