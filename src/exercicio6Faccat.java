import java.util.Scanner;

public class exercicio6Faccat {
    public static void main (String [] args ){
        System.out.println("6) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a\n" +
                "área do retângulo. ");

        System.out.println("Digite a base do retângulo");

        Scanner leia = new Scanner(System.in);
        int base = leia.nextInt();

        System.out.println("Digite a altura do retângulo");
        int altura = leia.nextInt();

        base *= altura;

        System.out.println ("a base do retângulo é : " + base );

    }
}
