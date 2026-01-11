import java.util.Scanner;

public class exercicio46Faccat {
    public static void main (String []args){
        System.out.println("46) Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício [44] caso o segundo valor \n" +
                "informado seja ZERO.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int segundoNumero;
        int primeiroNumero;

        do{
        System.out.println("Digite o primeiro valor: ");
        primeiroNumero = leia.nextInt();


        System.out.println("Digite o segundo valor: ");
        segundoNumero = leia.nextInt();

        if(segundoNumero==0){
            System.out.println("valor invalido");
        }

        }while(segundoNumero == 0);

        System.out.println("o valor da conta é: "+ primeiroNumero / segundoNumero );

    }
}
