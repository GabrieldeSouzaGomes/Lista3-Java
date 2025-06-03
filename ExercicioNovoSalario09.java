//9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
// Calcular e escrever o valor do novo salário.
package lista03;

import java.util.Scanner;

public class ExercicioNovoSalario09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite o salário atual do funcionário: R$ ");
		double salarioAtual = scanner.nextDouble();

		System.out.print("Digite o percentual de reajuste (%): ");
		double percentualReajuste = scanner.nextDouble();

		double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100); // Calcula o novo salário

		System.out.printf("O novo salário é: R$ %.2f\n", novoSalario); // Exibe o novo salário

		scanner.close(); // Fecha o Scanner
	}
}

