import java.util.Scanner;

public class CalculadoraSalarioVendedor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número do vendedor: ");
        int numeroVendedor = teclado.nextInt();
        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = teclado.nextDouble();
        System.out.print("Digite o total de vendas: R$ ");
        double totalVendas = teclado.nextDouble();
        System.out.print("Digite o percentual de comissão (em %): ");
        double percentualComissao = teclado.nextDouble();

        // Cálculo da comissão e do salário total
        double valorComissao = totalVendas * (percentualComissao / 100);
        double salarioTotal = salarioFixo + valorComissao;

        // Exibição do resultado
        System.out.println("\nNúmero do vendedor: " + numeroVendedor);
        System.out.printf("Salário total: R$ %.2f\n", salarioTotal);
    }
}
