import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Entradas: Um numero
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        // Processamento:Não tem
        // Saidas: Numero informado foi (numero)
        System.out.println("O numero informado foi " + numero);
    }
}
