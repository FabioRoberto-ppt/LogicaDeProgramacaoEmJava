import java.util.Scanner;

public class exercicio11Faccat {
    public static void main(String []args){
        System.out.println("11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, \n" +
                "mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele \n" +
                "efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas \n" +
                "vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do \n" +
                "vendedor.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade total de carros vendidos pelo vendedor : ");
        int quantidadeDeCarroVendido = leia.nextInt();

        System.out.println("Digite o valor total das vendas das feitas pelo vendedor ");
        double valorDasVendasDoVendedor = leia.nextDouble();

        System.out.println("Digite o valor do salário fixo do vendedor no mês : ");
        double salarioFixo = leia.nextDouble();

        System.out.println("Digite o valor da comissão por carro do vendedor");
        double comissaoFixa = leia.nextDouble();

        double valorFinalVendas = valorDasVendasDoVendedor * (5.0/100);
        double salarioFinal = valorFinalVendas + salarioFixo + (quantidadeDeCarroVendido * (comissaoFixa));

        //numeroDeCarrosVendidos + valorTotalDeVendaas + salarioFixo + ValorRecebidoPorCarroVendido;

        System.out.println("O salário final do vendor é " +  salarioFinal);
    }
}
