import java.util.Scanner;

public class exercicio14Faccat {
    public static void main(String []args){
        System.out.println("14) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso \n" +
                "contrário escrever NÃO É MAIOR QUE 10!");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = leia.nextDouble();

        if (numero >= 10){
            System.out.println("o valor é maior que 10 ");
        }
        else{
            System.out.println("o valor é menor que 10 ");
        }
    }
}
