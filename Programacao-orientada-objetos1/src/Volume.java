import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o raio da lata (em cm): ");
        double raio = teclado.nextDouble();
        
        System.out.println("Digite a altura da lata (em cm): ");
        double altura = teclado.nextDouble();
        
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        
        System.out.printf("O volume da lata é: %.2f cm³\n4,", volume);
    }
}
