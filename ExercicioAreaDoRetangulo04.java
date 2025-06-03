// 4) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo.
package lista03;

import java.util.Scanner;

public class ExercicioAreaDoRetangulo04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner para leitura

		System.out.print("Digite a base do triângulo: ");
		double base = scanner.nextDouble(); // Lê a base

		System.out.print("Digite a altura do triângulo: ");
		double altura = scanner.nextDouble(); // Lê a altura

		double area = (base * altura) / 2; // Calcula a área do triângulo

		System.out.println("A área do triângulo é: " + area); // Exibe o resultado

		scanner.close(); // Fecha o Scanner
	}
}
