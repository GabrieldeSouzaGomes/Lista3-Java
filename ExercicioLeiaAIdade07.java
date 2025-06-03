//7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa
//  expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

package lista03;

import java.util.Scanner;

public class ExercicioLeiaAIdade07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Cria o Scanner para entrada de dados

		System.out.print("Digite sua idade em anos: ");
		int anos = scanner.nextInt();

		System.out.print("Digite os meses além dos anos: ");
		int meses = scanner.nextInt();

		System.out.print("Digite os dias além dos meses: ");
		int dias = scanner.nextInt();

		// Calcula o total de dias
		int idadeEmDias = (anos * 365) + (meses * 30) + dias;

		System.out.println("Sua idade em dias é: " + idadeEmDias);

		scanner.close(); // Fecha o Scanner
	}
}

