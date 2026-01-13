import java.util.Scanner;

public class exercicio56Faccat {
    public static void main(String []args){
        System.out.println("56) Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor \n" +
                "lido.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int numero1 = 0;
        int contadora = 0;
        int resultado = 0;

        do{
            System.out.println("Digite valores apenas entre 1 e 10: ");
            numero1 = leia.nextInt();
        }while (numero1 < 1 || numero1 > 10);

        do{
            System.out.println(numero1+" x "+contadora+" = "+resultado );
            contadora++;
            resultado = numero1 * contadora;
        }while (contadora < 11);


    }
}
