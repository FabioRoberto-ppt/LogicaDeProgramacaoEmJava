import java.util.Scanner;

public class exercicio9Faccat {
    public static void main (String []args){
        System.out.println("9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. \n" +
                "Calcular e escrever o valor do novo salário. ");

        System.out.println("");

        System.out.println("Digite o salario mensal atual do funcionário: ");
        Scanner leia = new Scanner(System.in);
        double salario = leia.nextDouble();
        System.out.println("");

        System.out.println("Digite o porcentual de reajuste do salario do funcionario");
        double reajustePorcentagem = leia.nextDouble();
        System.out.println("");

        double reajustePorcentagemFinal = 0;
        double salarioFinal = 0;

        reajustePorcentagemFinal = reajustePorcentagem / 100;
        salarioFinal = salario + reajustePorcentagemFinal * salario;

        System.out.println("O reajuste do salario do funcionario é :" + salarioFinal);
    }
}
