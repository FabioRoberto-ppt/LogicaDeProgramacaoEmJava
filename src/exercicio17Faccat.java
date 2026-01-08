import java.util.Scanner;

public class exercicio17Faccat {
    public static void main (String []args){
        System.out.println("17) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever \n" +
                "uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o \n" +
                "aluno é aprovado). Escrever também a média calculada.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno : ");
        double primeiraNota = leia.nextDouble();

        System.out.println("Digite a segunda nota do aluno : ");
        double segundaNota = leia.nextDouble();

        double mediaFinal = (primeiraNota + segundaNota)/2;

        if (mediaFinal >= 6){
            System.out.println("O aluno foi aprovado sua nota final foi : " + mediaFinal );
        }
        else{
            System.out.println("O aluno foi reprovado sua nota final foi : " + mediaFinal);
        }
    }
}
