import java.util.Scanner;

public class exercicio10Faccat {
    public static void main(String[] args) {
        System.out.println("10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do \n" +
                "distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor \n" +
                "seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, \n" +
                "calcular e escrever o custo final ao consumidor. ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

    //    custodefabrica + distribuidor28% + imposto45% = carronovo

        System.out.println("Digite o custo de fábrica do carro : ");
        double custoDeFabrica = leia.nextDouble();

        double distribuidor = 28.0/100;
        double imposto = 45.0/100;

        double custoDistribuidor = custoDeFabrica * distribuidor;
        double custoImposto = custoDeFabrica * imposto;
        double valorFinal = custoImposto + custoDeFabrica + custoDistribuidor;

        System.out.println("o valor final do carro ao consumidor é de :"+ valorFinal + " R$");

    }
}
