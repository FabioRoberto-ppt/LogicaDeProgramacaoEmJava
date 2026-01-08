import java.util.Scanner;

public class exercicio18Faccat {
    public static void main (String []args){
        System.out.println("18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela \n" +
                "poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite qual ano você nasceu : ");
        int anos = leia.nextInt();

        int anosFinal = 2026 - anos;

        if(anos >= 18){
            System.out.println("Você tem " + anosFinal + " e pode votar");
        }
        else {
            System.out.println("Você tem " + anosFinal + " e não pode votar até ter 18 anos");
        }
    }
}
