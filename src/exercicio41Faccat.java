import java.util.Scanner;
public class exercicio41Faccat {
    public static void main(String []args){
        System.out.println("41) Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos \n" +
                "exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo \n" +
                "e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo: ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota do aluno: ");
        int nota1 = leia.nextInt();

        System.out.println("Digite o valor da segunda nota do aluno: ");
        int nota2 = leia.nextInt();

        System.out.println("Digite o valor da terceira nota do aluno: ");
        int nota3 = leia.nextInt();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = leia.nextDouble();

         nota2 = nota2 * 2 ;
         nota3 = nota3 * 3;

        double mediaFinal = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7.0;

        if(mediaFinal >= 9 ){
            System.out.println("Sua nota é: " + mediaFinal +"A");

        } else if( mediaFinal >= 7.5 && mediaFinal < 9){
            System.out.println("Sua nota é: " + mediaFinal +"B");

        } else if (mediaFinal >= 6.0 && mediaFinal < 7.5 ) {
            System.out.println("Sua nota é: " + mediaFinal +"C");

        }else if (mediaFinal < 6){
            System.out.println("Sua nota é: " + mediaFinal +" D");
        }
    }
}
