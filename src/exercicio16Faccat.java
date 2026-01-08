import java.util.Scanner;

public class exercicio16Faccat {
    public static void main(String []args){
        System.out.println("");
        System.out.println("16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem \n" +
                "compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e \n" +
                "escreva o custo total da compra. ");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de maças compradas: ");
        double totalMaca = leia.nextDouble();

        if(totalMaca >=12 ){
        double valorFinal = totalMaca * 1.00;
            System.out.println("O valor a ser pago pelas maças é : " + valorFinal +" R$" );
        }
        else{
         double valorFinal = totalMaca * 1.30;
         System.out.println("O valor a ser pago pelas maças é : " + valorFinal +" R$");
        }
    }
}
