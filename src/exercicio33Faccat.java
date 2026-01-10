import java.util.Scanner;

public class exercicio32Faccat {
    public static void main (String []args){
        System.out.println("33) Ler dois valores e imprimir uma das três mensagens a seguir: \n" +
                "‘Números iguais’, caso os números sejam iguais \n" +
                "‘Primeiro é maior’, caso o primeiro seja maior que o segundo; \n" +
                "‘Segundo maior’, caso o segundo seja maior que o primeiro. ");
        System.out.println("");

        Scanner leia =new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = leia.nextInt();

        System.out.println("Digite o segundo número");
        int numero2 = leia.nextInt();

        if(numero1 == numero2){
            System.out.println("O numero é igual ");
        }else if(numero1 > numero2){
            System.out.println("o primeiro número é :"+numero1+" é maior");
        }else {
            System.out.println("o segundo número é :"+ numero2+" é maior");
        }
    }
}
