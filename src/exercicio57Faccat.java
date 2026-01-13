import java.util.Scanner;

public class exercicio57Faccat {
    public static void main (String []args){
        System.out.println("58) Reescreva o exercício 51 utilizando a estrutura ENQUANTO e um CONTADOR.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int valorLido = 0;
        int contador = 0;
        int resutado = 0;

        System.out.println("Digite um valor que seja de 1 a 10:");
        valorLido = leia.nextInt();

        while (1 > valorLido || 10 < valorLido){
            System.out.println("Digite um valor que seja de 1 a 10:");
            valorLido = leia.nextInt();
        }

        while (contador <= 10){
            System.out.println(valorLido + " X "+ contador + " = "+ resutado);
            contador++;
            resutado =valorLido * contador;
        }

    }
}
