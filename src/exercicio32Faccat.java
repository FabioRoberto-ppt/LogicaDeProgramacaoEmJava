import java.util.Scanner;

public class exercicio32Faccat {
    public static void main (String []args){
        System.out.println("32) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome \n" +
                "do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro time :");
        String time1 = leia.nextLine();

        System.out.println("Digite o total de gols marcados por ele");
        int gols1 = leia.nextInt();
        leia.nextLine();

        System.out.println("Digite o nome do segundo time: ");
        String time2 = leia.nextLine();

        System.out.println("Digite o total de gols marcado por ele");
        int gols2 = leia.nextInt();



        if (gols1 > gols2){
            System.out.println("o time " + time1 + " GANHOU a partida com " + gols1 +" gols feitos");
        } else if (gols1 == gols2) {
            System.out.println("o jogo terminou EMPATADO");
        }else{
            System.out.println("o time " +time2 +" GANHOU a partida com " + gols2 +" gols feitos");
        }

    }
}
