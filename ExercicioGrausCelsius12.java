//12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, 
//calcular e escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo): C/5 = (F-32)/9.

package lista03;

import java.util.Scanner;

public class ExercicioGrausCelsius12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite a temperatura em graus Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();

		// Cálculo da temperatura em Celsius
		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.printf("A temperatura em graus Celsius é: %.2f°C\n", celsius);

		scanner.close(); // Fecha o Scanner
	}
}
