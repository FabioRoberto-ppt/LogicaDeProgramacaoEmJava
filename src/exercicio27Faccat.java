import java.util.Scanner;

public class exercicio27Faccat {
    public static void main (String []args){
        System.out.println("27) Ler um valor e escrever se é positivo, negativo ou zero. ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leia.nextInt();

        if(numero == 0 ){
            System.out.println("O número digitado é 0: "+ numero);
        } else if (numero > 0) {
            System.out.println("o numero digita é maior que 0: "+ numero );
        } else {
            System.out.println("o numero digitado é menor que 0: "+ numero);
        }
    }
}
