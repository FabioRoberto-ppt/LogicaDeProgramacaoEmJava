import java.util.Scanner;

public class exercicio12Faccat {
    public static void main(String []args){
        System.out.println("12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor \n" +
                "correspondente em graus Celsius (baseado na fórmula abaixo): \n" +
                "C  ---------- \n" +
                "5  \n" +
                "F - 32  \n" +
                "= -----------  \n" +
                "9  \n" +
                "Observação: Para testar se a sua resposta está correta saiba que  100oC  =  212F");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura em Fahrenheit: ");
        double fahrenheit = leia.nextDouble();

        double celcius = (fahrenheit - 32) /9;
        celcius = celcius * 5;

       // c/5 = f -32/9

        System.out.println("O valor convertido em gruas celcius é " + celcius);

    }
}
