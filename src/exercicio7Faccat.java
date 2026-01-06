import java.util.Scanner;

public class exercicio7Faccat {
    public static void main (String []args){

        System.out.println("Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade\n" +
                "dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias");

        Scanner leia = new Scanner(System.in);

        System.out.println("");
        System.out.println("Digite quantos anos você tem : ");
        int anos = leia.nextInt();

        anos = anos * 365;

        System.out.println("");
        System.out.println("Digite quantos meses você viveu até agora ");
        int meses = leia.nextInt();

        meses = meses * 12;

        System.out.println("");
        System.out.println("Digite quantos dias você tem desde o ultimo aniversario");
        int diasTemporario =leia.nextInt();

        diasTemporario = diasTemporario * 30;

        int diasFinal = meses + diasTemporario + anos;

        System.out.println("Você tem o total de " + diasFinal + " vividos");






    }
}
