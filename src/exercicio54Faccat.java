import java.util.Scanner;

public class exercicio54Faccat {
    public static void main (String []args){
        System.out.println("54) Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor \n" +
                "informado (para N) não seja maior que 0, deverá ser lido um novo valor para N. ");

        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int n;
        int valor1 = 1;

        do{
            System.out.println("Digite um numero que não seja 0 :");
            n = leia.nextInt();
        } while (n < 1);

        do{
            System.out.println(n);
            n--;
        }while(n >= valor1 );



    }
}
