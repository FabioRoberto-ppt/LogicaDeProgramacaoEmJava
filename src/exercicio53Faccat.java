import java.util.Scanner;

public class exercicio53Faccat {
    public static void main(String[] args) {
        System.out.println("53) Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere \n" +
                "que o N será sempre maior que ZERO. ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int n;
        int numeroFinal = 1;

        int n2;
        int numeroFinal2 = 1;


        do{
            System.out.println("Digite o valor de N");
            n = leia.nextInt();
        } while(n != 0);

        do {
            System.out.println(n);
            n--;

        } while (numeroFinal <= n);

        System.out.println("");

        System.out.println("Digite o valor de N2");
        n2 = leia.nextInt();

        while(n2 <= 0) {
            System.out.println("Digite o valor de N2");
            n2 = leia.nextInt();
        }

        while(numeroFinal <= n2){
            System.out.println(n2);
            n2--;
        }
    }
}