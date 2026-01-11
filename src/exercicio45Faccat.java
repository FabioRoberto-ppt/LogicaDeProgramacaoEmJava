import java.util.Scanner;

public class exercicio45Faccat {
    public static void main (String []args){
        System.out.println("");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int numero1 = leia.nextInt();

        int numero2 = 0;


        while(numero2 == 0){
         System.out.println("Digite o segundo valor: ");
         numero2 = leia.nextInt();
        }

        System.out.println("O Resultado é: " + numero1 / numero2);
    }
}
