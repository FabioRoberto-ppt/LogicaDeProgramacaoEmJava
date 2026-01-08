import java.util.Scanner;

public class exercicio21Faccat {
    public static void main (String []args){
        System.out.println("21) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os \n" +
                "minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é \n" +
                "de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a hora que começou a partida de xadrez: ");
        int comecoDaPartida = leia.nextInt();

        System.out.println("Digite a hora que acabou o jogo de xadrez: ");
        int finalDaPartida = leia.nextInt();


        if (finalDaPartida >= comecoDaPartida) {
            int valorFinal = finalDaPartida - comecoDaPartida ;
            System.out.println("O jogo durou " + valorFinal + " horas");
        }
        else {
            int valorFinal = (24 - comecoDaPartida) + finalDaPartida;
            System.out.println("o jogo durou " + valorFinal + " horas");
        }
    }
}
