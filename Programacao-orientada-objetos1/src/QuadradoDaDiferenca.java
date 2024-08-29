import java.util.Scanner;

public class QuadradoDaDiferenca {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        double n1 = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = teclado.nextDouble();
        
        double dif = n1 - n2;
        
        double quad = Math.pow(dif, 2);
        
        System.out.printf("O quadrado da diferença do primeiro número pelo segundo: %.2f\n", quad);
        
       double quadUm = Math.pow(n1,2);
       double quadDois = Math.pow(n2, 2);
       
       double difQuad = quadUm - quadDois;
       
        System.out.printf("Diferença dos quadrados dos números: %.2f\n", difQuad);
    }
}