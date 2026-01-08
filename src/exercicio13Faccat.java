import java.util.Scanner;

public class exercicio13Faccat {
    public static void main (String []args){
        System.out.println("13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. \n" +
                "Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média \n" +
                "final é: \n" +
                "n1 * 2 + n2 * 3 + n3 * 5  \n" +
                "mediafinal = -----------------------------------  \n" +
                "10 ");
        System.out.println("");
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota do aluno :");
        double primeirNota = leia.nextDouble();
        System.out.println("");

        System.out.println("Digite o valor da segunda nota do aluno :");
        double segundaNota = leia.nextDouble();
        System.out.println("");

        System.out.print("Digite o valor da terceira nota do aluno :");
        double terceiraNota = leia.nextDouble();

        double mediaFinal = ((primeirNota * 2) + (segundaNota * 3) + (terceiraNota * 5)) /10;

        System.out.println("A nota final média do aluno foi : " + mediaFinal);
    }
}
