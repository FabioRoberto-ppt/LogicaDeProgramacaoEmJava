import java.util.Scanner;

public class exercicio37Faccat {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de kg de morango que foram comprados: ");
        int kilosMorango = leia.nextInt();

        System.out.println("Digite a quantidade de kg de maça que foram comprados: ");
        int kilosMaca = leia.nextInt();

        double valorMorango;
        double valorMaca;
        double valorFinal;

        // Preço por kg
        if (kilosMaca + kilosMorango > 5) {
            valorMorango = kilosMorango * 2.20;
            valorMaca = kilosMaca * 1.50;
        } else {
            valorMorango = kilosMorango * 2.50;
            valorMaca = kilosMaca * 1.80;
        }

        // Soma total
        valorFinal = valorMorango + valorMaca;

        // Aplica desconto de 10% se ultrapassar 8 kg ou R$ 25
        if (kilosMaca + kilosMorango >= 8 || valorFinal > 25.0) {
            valorFinal = valorFinal * 0.9;
        }

        System.out.printf("O valor a ser pago é: R$ %.2f\n", valorFinal);
    }
}