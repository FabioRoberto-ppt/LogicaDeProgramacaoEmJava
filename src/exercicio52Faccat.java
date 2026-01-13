import java.util.Scanner;

public class exercicio52Faccat {
    public static void main (String []args){
        System.out.println("52) Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int numero1 = 100;
        int numero2 = 100;


        while(numero1 <= 110){
            System.out.println(numero1);
            numero1++;
        }

        System.out.println("");

        do{
            System.out.println(numero2);
            numero2++;
        }while(numero2 <= 110);
    }
}
