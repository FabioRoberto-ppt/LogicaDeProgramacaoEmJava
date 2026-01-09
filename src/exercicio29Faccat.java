import java.util.Scanner;

public class exercicio29Faccat {
    public static void main(String[] args) {
        System.out.println("29) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 \n" +
                "maiores.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leia.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = leia.nextInt();
        int soma;

        if (numero1 < numero2 && numero1 < numero3) {
            soma = numero2 + numero3;
        }
        else if (numero2 < numero1 && numero2 < numero3){
            soma = numero1 + numero3;
        }
        else{
            soma = numero1 + numero2;
        }
        System.out.println("A soma dos dois maiores é: " + soma);
    }
}
