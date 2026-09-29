
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        
        Scanner leitor = new
            Scanner(System.in);
        
        int numero1, numero2, resultado;
        
        System.out.println("Digite um numero: ");
        numero1 = leitor.nextInt();
        
        System.out.println("Digite um numero: ");
        numero2 = leitor.nextInt();
        
        resultado = (numero1 + numero2);
        
        if (resultado > 10) {
            System.out.println("Resultado: " + resultado);
        }
        
        leitor.close();
        }
        
    }
