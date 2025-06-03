//6) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo.
package lista03;

import java.util.Scanner;

public class ExercicioAreaDoCirculo06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner para entrada

		System.out.print("Digite o raio do círculo: ");
		double raio = scanner.nextDouble(); // Lê o valor do raio

		double area = Math.PI * Math.pow(raio, 2); // Calcula a área: π * raio²

		System.out.println("A área do círculo é: " + area); // Exibe o resultado

		scanner.close(); // Fecha o Scanner
	}
}

