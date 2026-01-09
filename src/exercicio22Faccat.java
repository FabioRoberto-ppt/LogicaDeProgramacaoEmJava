import java.util.Scanner;

public class exercicio22Faccat {
    public static void main(String []args){
        System.out.println("22) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais \n" +
                "de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. \n" +
                "Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva \n" +
                "o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas \n" +
                "(considere que o mês possua 4 semanas exatas).");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite quantas horas o funcionário trabalhou no mês :");
        double horasTrabalhadas = leia.nextDouble();

        System.out.println("Digite o valor da hora do funcionário :");
        double valorHora = leia.nextDouble();

        if(horasTrabalhadas > 160 ){
            double valorHoraExtra = horasTrabalhadas *  (valorHora * 50/100);
            System.out.println("O funcionario fez horas extra seu salário é :" + valorHoraExtra);
        }
        else {
            double valorSemHoraExtra = horasTrabalhadas * valorHora;
            System.out.println("O funcionario não fez hora extra seu salário é : " + valorSemHoraExtra);
        }
    }
}
