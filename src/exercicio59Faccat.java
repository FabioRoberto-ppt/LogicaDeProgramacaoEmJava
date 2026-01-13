import java.util.Scanner;

public class exercicio59Faccat {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int contador = 1;
        int valor;
        int negativos = 0;

        while (contador <= 10) {
            System.out.println("Digite o " + contador + "º valor:");
            valor = leia.nextInt();

            if (valor < 0) {
                negativos++;
            }

            contador++;
        }

        System.out.println("Quantidade de valores negativos: " + negativos);
    }
}