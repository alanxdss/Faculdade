
// Fazer um algoritmo que leia dois n�meros e imprima na tela o produto (multiplica��o) dos dois n�meros.

import java.util.Scanner;

public class EX_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1, N2, produto;

		System.out.print("Digite o primeiro n�mero: ");
		N1 = entrada.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		N2 = entrada.nextInt();

		produto = (N1 * N2);

		System.out.print("O produto destes dois n�meros � igual a: " + produto);

		entrada.close();

	}

}
