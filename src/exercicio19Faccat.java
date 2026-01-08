import java.util.Scanner;

public class exercicio19Faccat {
    public static void main (String []args){
        System.out.println("19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = leia.nextInt();
        System.out.println("");

        System.out.println("Digite o segundo número: ");
        int segundoNumero = leia.nextInt();
        System.out.println("");

        if (primeiroNumero > segundoNumero) {
            System.out.println("O primeiro numero é maior " + primeiroNumero);
        }
        else{
            System.out.println("O Segundo numero é maior " + segundoNumero);
        }
    }
}
