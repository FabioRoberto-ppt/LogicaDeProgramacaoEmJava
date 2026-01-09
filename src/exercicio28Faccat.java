import java.util.Scanner;

public class exercicio28Faccat {
    public static void main (String []args){
        System.out.println("28) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leia.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = leia.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O "+ numero1 +" é o maior");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O "+ numero2 +" é o maior");
        }else {
            System.out.println("O " + numero3 + "é o maior");
        }
    }
}
