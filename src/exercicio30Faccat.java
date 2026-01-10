import java.util.Scanner;

public class exercicio30Faccat {
    public static void main (String []args){
        System.out.println("30) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem \n" +
                "crescente.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leia.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = leia.nextInt();

        if (numero1 > numero2 && numero2 > numero3){
            System.out.println("A ordem dos números é: " + numero3 + ", " + numero2 + ", " + numero1);
        } else if (numero3 > numero2 && numero2 > numero1) {
            System.out.println("A ordem dos números é: " + numero1 + ", " + numero2 + ", " + numero3);
        } else if(numero3 > numero1 && numero1 > numero2){
            System.out.println("A ordem dos números é: " + numero2 + ", " + numero1 + ", " + numero3);
        } else if (numero2 > numero3 && numero3 > numero1) {
            System.out.println("A ordem dos números é: " + numero1 + ", " + numero3 + ", " + numero2);
        } else if(numero1 > numero3 && numero3 > numero2){
            System.out.println("A ordem dos números é: " + numero2 + ", " + numero3 + ", " + numero1);
        } else if (numero2 > numero1 && numero1 >numero3) {
            System.out.println("A ordem dos números é: " + numero3 + ", " + numero1 + ", " + numero2);
        }
    }
}
