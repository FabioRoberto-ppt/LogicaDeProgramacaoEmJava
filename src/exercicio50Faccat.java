import java.util.Scanner;

public class exercicio50Faccat {
    public static void main (String []args){
        System.out.println("50) Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem \n" +
                "crescente. ");

        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int numero = 1;

        while(numero <= 10){
            System.out.println(numero);
            numero++;
        }
    }
}
