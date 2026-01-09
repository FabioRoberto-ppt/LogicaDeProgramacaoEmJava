import java.util.Scanner;

public class exercicio24Faccat {
    public static void main (String []args){
        System.out.println("24) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que \n" +
                "ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que \n" +
                "ultrapassar este valor, calcular e escrever o seu salário total.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do salário fixo do vendedor :");
        double salarioFixo = leia.nextDouble();

        System.out.println("Digite o valor das vendas feita pelo vendedor :");
        double valorDasVendas = leia.nextDouble();

        // 3% ate 1500
        // 5% ate 1501

        double tresPorcento = 3.0/100;
        double cincoPorcento = 5.0/100;

        if(valorDasVendas > 1500 ){
            double comissao = (1500 * tresPorcento) + ((valorDasVendas -1500)* cincoPorcento);
            double salarioFinal = comissao + salarioFixo;

            System.out.println("O valor do salário total do vendedor é: " + salarioFinal);
        }else{
            double salarioFinal = salarioFixo + valorDasVendas * tresPorcento;
            System.out.println("O valor do salário total do vendedor é: "+ salarioFinal);
        }
    }
}
