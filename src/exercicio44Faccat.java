import java.util.Scanner;

public class exercicio44Faccat {
    public static void main (String []args){
        System.out.println("44) Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido \n" +
                "um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado \n" +
                "da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA). ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int numero1 = leia.nextInt();

        int numero2;

        do {
            System.out.println("Digite um segundo valor que não seja 0: ");
            numero2 = leia.nextInt();
        } while( numero2 == 0);

        double divisao = numero1 / numero2;
        System.out.println("O resultado da divisao é :" + divisao);
    }
}
