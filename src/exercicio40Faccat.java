import java.util.Scanner;
public class exercicio40Faccat {
    public static void main (String []args){
        System.out.println("40) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço \n" +
                "unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total \n" +
                "a pagar (total a pagar = total - desconto), sabendo-se que: - Se quantidade  <= 5  o desconto será de 2% - Se quantidade  > 5  e\n" +
                "  quantidade  <=10  o desconto será de 3% - Se quantidade  >  10 o desconto será de 5% ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = leia.nextLine();

        System.out.println("Digite quantos produtos foram comprados: ");
        double produtosComprados = leia.nextInt();

        System.out.println("Digite o valor por unidade do produto: ");
        double valorProduto = leia.nextDouble();

        double totalFinal = 0.0;
        double totalDesconto;

        if (produtosComprados <= 5.0){
             totalFinal =(produtosComprados * valorProduto);
             totalDesconto = totalFinal * 2/100;

        } else if (produtosComprados > 5.0 && produtosComprados < 10.0) {
             totalFinal =(produtosComprados * valorProduto) - 3.0/100;

        }else {
             totalFinal =(produtosComprados * valorProduto) - 5.0/100;
        }

        System.out.println("O valor final do "+ nomeProduto+" é "+ totalFinal);
    }
}
