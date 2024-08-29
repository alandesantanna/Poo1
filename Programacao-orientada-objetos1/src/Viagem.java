import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantidade de tempo gastado na viagem: ");
        float tempoGasto = teclado.nextFloat();

        System.out.println("Qual foi a velocidade média durante a viagem: ");
        float velMedia = teclado.nextFloat();

        float distancia = tempoGasto * velMedia;
        float litrosUsados = distancia / 12;

        System.out.printf("Sua velocidade média foi: %.2f%n", velMedia);
        System.out.printf("Seu tempo gasto foi de %.2f horas%n", tempoGasto);
        System.out.printf("A distância percorrida foi %.2f km%n", distancia);
        System.out.printf("Você usou %.2f litros de gasolina%n", litrosUsados);
    }
}
