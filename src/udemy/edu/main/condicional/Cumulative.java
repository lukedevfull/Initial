package udemy.edu.main.condicional;

import java.util.Scanner;
import java.util.Locale;

public class Cumulative {
	// TODO: Criar um pŕograma simples para verificxar a utilização de internet e o
	// valor do plano, sendo que:
	// 1. O valor do plano, o valor da conta será de R$ 50,00.
	// 2. O valor da internet é de R$ 2,00 por minuto que utrapassar o limite de 100
	// minutos.

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de minutos utilizados: ");
		int min = sc.nextInt();
		double conta = 50.0;

		if (min > 100) {
			conta += (min - 100) * 2;
		}

		System.out.printf("Valor da conta = %.2f%n", conta);

		sc.close();
	}
}
