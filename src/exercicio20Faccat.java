import java.util.Scanner;

public class exercicio20Faccat {
    public static void main(String []args){
        System.out.println("20) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro numero :");
        int primeiroNumero = leia.nextInt();

        System.out.println("Digite o segund numero");
        int segundoNumero = leia.nextInt();

        if (primeiroNumero < segundoNumero ){
            System.out.println("A ordem crescente dos números digitados são: "+ primeiroNumero +", "+ segundoNumero);
        }
        else {
            System.out.println("A ordem crescente dos números digitados são: "+ segundoNumero + ", "+ primeiroNumero);
        }
    }
}
