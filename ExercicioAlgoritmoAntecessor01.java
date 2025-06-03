//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor
package lista03;

import java.util.Scanner;

public class ExercicioAlgoritmoAntecessor01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o objeto para leitura

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt(); // Lê o número digitado

        int antecessor = numero - 1; // Calcula o antecessor

        System.out.println("O antecessor de " + numero + " é " + antecessor); // Exibe o resultado

        scanner.close(); // Fecha o scanner
    }
}
