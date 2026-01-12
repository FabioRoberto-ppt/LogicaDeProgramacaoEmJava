import java.util.Scanner;

public class exercicio51Faccat {
    public static void main (String []args){
        System.out.println("51) Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem \n" +
                "decrescente.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int numero = 10;
        int numero2 = 10;

        do {
            System.out.println(numero);
            numero --;

        }while (numero >= 0);


        while(numero2 >= 0 ){
            System.out.println(numero2);
            numero2--;
        }

    }
}
