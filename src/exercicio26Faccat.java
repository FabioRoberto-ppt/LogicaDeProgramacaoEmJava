import java.util.Scanner;

public class exercicio26Faccat {
    public static void main (String []args){
        System.out.println("26) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e \n" +
                "quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade \n" +
                "média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual \n" +
                "a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar \n" +
                "compra'.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade atual no estoque: ");
        double quantidadeNoEstoque = leia.nextDouble();

        System.out.println("Digite a quantidade maxima em estoque: ");
        double quantidadeMaximaNoEstoque = leia.nextDouble();

        System.out.println("Digite a quantidade minica em estoque: ");
        double quantidadeMininaNoEstoque = leia.nextDouble();

        double quantidadeMedia = ((quantidadeMaximaNoEstoque + quantidadeMininaNoEstoque)/2);

        if (quantidadeNoEstoque >= quantidadeMedia){
            System.out.println("Não efetuar a compra");
        }
        else {
            System.out.println("Efetuar a compra");
        }
    }
}
