//11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas.
//Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas,
//o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

package lista03;

import java.util.Scanner;

public class ExercicioSalarioDoVendedorDeCarros11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite o salário fixo do vendedor: R$ ");
		double salarioFixo = scanner.nextDouble();

		System.out.print("Digite o número de carros vendidos: ");
		int carrosVendidos = scanner.nextInt();

		System.out.print("Digite o valor total das vendas: R$ ");
		double totalVendas = scanner.nextDouble();

		System.out.print("Digite o valor da comissão por carro vendido: R$ ");
		double comissaoPorCarro = scanner.nextDouble();

		// Cálculo do salário final
		double comissaoTotal = carrosVendidos * comissaoPorCarro;
		double bonusPorVendas = totalVendas * 0.05;
		double salarioFinal = salarioFixo + comissaoTotal + bonusPorVendas;

		System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);

		scanner.close(); // Fecha o Scanner
	}
}
