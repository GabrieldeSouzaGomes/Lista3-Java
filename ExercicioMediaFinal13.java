//13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média final é:
//mediafinal = (n1 * 2 + n2 * 3 + n3 * 5)/10

package lista03;

import java.util.Scanner;

public class ExercicioMediaFinal13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite a primeira nota (peso 2): ");
		double n1 = scanner.nextDouble();

		System.out.print("Digite a segunda nota (peso 3): ");
		double n2 = scanner.nextDouble();

		System.out.print("Digite a terceira nota (peso 5): ");
		double n3 = scanner.nextDouble();

		// Cálculo da média ponderada
		double mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

		System.out.printf("A média final do aluno é: %.2f\n", mediaFinal);

		scanner.close(); // Fecha o Scanner
	}
}
