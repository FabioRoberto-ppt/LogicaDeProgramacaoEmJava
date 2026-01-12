import java.util.Scanner;

public class exercicio47Faccat {
    public static void main (String []args){
        System.out.println("47) Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício [45] caso o segundo valor \n" +
                "informado seja ZERO. ");

        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite o primeiro numero: ");
        numero1 = leia.nextInt();

        System.out.println("Digite o primeiro numero: ");
        numero2 = leia.nextInt();

        while (numero2 == 0){
            System.out.println("Numero inválido");
            System.out.println("Digite o segundo numero: ");
            numero2 = leia.nextInt();
        }
        System.out.println("O resutado é: "+ numero1/numero2);
    }
}
