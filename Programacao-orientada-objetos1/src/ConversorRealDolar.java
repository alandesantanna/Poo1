import java.util.Scanner;

public class ConversorRealDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço em reais: R$ ");
        double precoEmReais = scanner.nextDouble();

        System.out.print("Digite a cotação do dólar: US$ ");
        double cotacaoDolar = scanner.nextDouble();

        // Cálculo da conversão
        double precoEmDolares = precoEmReais / cotacaoDolar;

        // Exibição do resultado
        System.out.printf("O valor em dólares é: US$ %.2f\n", precoEmDolares);
    }
}
