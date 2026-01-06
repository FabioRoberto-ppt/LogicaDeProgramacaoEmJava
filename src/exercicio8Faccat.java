import java.util.Scanner;

public class exercicio8Faccat {
    public static void main (String []args){
        System.out.println("8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos\n" +
                "brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total\n" +
                "de eleitores");
        System.out.println("");
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o total de eleitores : ");
        double totalEleitores = leia.nextDouble();

        System.out.println("Digite o total de votos brancos :");
        double totalBrancos = leia.nextDouble();

        System.out.println("Digite o total de votos nulos :");
        double totalNulos = leia.nextDouble();

        System.out.println("Digite o total de votos válidos");
        double totalValidos = leia.nextDouble();

        double PorcetualBranco = totalBrancos * 100 /totalEleitores;
        double PorcetualNulos = totalNulos * 100 / totalEleitores;
        double PorcentualValidos = totalValidos * 100 /totalEleitores;

        System.out.println("O porcentual de votos BRANCO foram " + PorcetualBranco);
        System.out.println("O porcentual de votos NULOS fora " + PorcetualNulos);
        System.out.println("O porcentual de votos VALIDOS foram" + PorcentualValidos);


    }
}
