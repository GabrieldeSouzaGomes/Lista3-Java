//10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
//(aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo 
//para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

package lista03;

import java.util.Scanner;

public class ExercicioCustoFinalAoConsumidor10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite o custo de fábrica do carro: R$ ");
		double custoFabrica = scanner.nextDouble();

		double percentualDistribuidor = 0.28;
		double percentualImpostos = 0.45;

		// Cálculo do custo final
		double custoFinal = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * percentualImpostos);

		System.out.printf("O custo final ao consumidor é: R$ %.2f\n", custoFinal);

		scanner.close(); // Fecha o Scanner
	}
}

