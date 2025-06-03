//  Escreva um algoritmo para ler o número total de eleitores de um município, 
//  o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

package lista03;

import java.util.Scanner;

public class ExercicioTotalEleitores08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Objeto Scanner para entrada de dados

		System.out.print("Digite o número total de eleitores: ");
		int totalEleitores = scanner.nextInt();

		System.out.print("Digite o número de votos brancos: ");
		int votosBrancos = scanner.nextInt();

		System.out.print("Digite o número de votos nulos: ");
		int votosNulos = scanner.nextInt();

		System.out.print("Digite o número de votos válidos: ");
		int votosValidos = scanner.nextInt();

		// Verificação opcional para garantir consistência nos dados
		if (votosBrancos + votosNulos + votosValidos > totalEleitores) {
			System.out.println("Erro: A soma dos votos não pode ser maior que o total de eleitores.");
		} else {
			// Cálculo dos percentuais
			double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
			double percentualNulos = (double) votosNulos / totalEleitores * 100;
			double percentualValidos = (double) votosValidos / totalEleitores * 100;

			// Exibição dos resultados
			System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
			System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
			System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
		}

		scanner.close(); // Fecha o Scanner
	}
}
