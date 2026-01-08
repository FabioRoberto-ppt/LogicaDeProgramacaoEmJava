import java.util.Scanner;

public class exercicio15Faccat {
    public static void main (String []args){
        System.out.println("15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o um número para saber se é negativo ou positivo ");
        double numero = leia.nextDouble();

        if (numero >= 0) {
            System.out.println("o valor digitado é positivo " + numero);
        }
        else{
            System.out.println("o valor digita é negativo" + numero);
        }
    }
}
