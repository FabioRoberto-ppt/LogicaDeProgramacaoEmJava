import java.util.Scanner;
public class exercicio35Faccat {
    public static void main (String []args){
        System.out.println("35) Um posto está vendendo combustíveis com a seguinte tabela de descontos: \n" +
                "Álcool \n" +
                "até 20 litros, desconto de 3% por litro \n" +
                "acima de 20 litros, desconto de 5% por litro \n" +
                "até 20 litros, desconto de 4% por litro \n" +
                "Gasolina \n" +
                "acima de 20 litros, desconto de 6% por litro \n" +
                "Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da \n" +
                "seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se \n" +
                "que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.");
        System.out.println("");

                Scanner leia = new Scanner(System.in);

                System.out.println("Digite o tipo de combustível (A para Álcool | G para Gasolina): ");
                char tipo = leia.next().toUpperCase().charAt(0);

                System.out.println("Digite a quantidade de litros vendidos: ");
                double litros = leia.nextDouble();

                double precoLitro;
                double desconto;
                double valorTotal;
                double valorFinal;

                if (tipo == 'A') {
                    precoLitro = 2.90;

                    if (litros <= 20) {
                        desconto = 0.03; // 3%
                    } else {
                        desconto = 0.05; // 5%
                    }

                } else if (tipo == 'G') {
                    precoLitro = 3.30;

                    if (litros <= 20) {
                        desconto = 0.04; // 4%
                    } else {
                        desconto = 0.06; // 6%
                    }

                } else {
                    System.out.println("Tipo de combustível inválido!");
                    return;
                }

                valorTotal = litros * precoLitro;
                valorFinal = valorTotal - (valorTotal * desconto);

                System.out.println("Valor total a pagar: R$ " + valorFinal);
            }
        }
