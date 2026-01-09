import java.util.Scanner;

public class exercicio25Faccat {
    public static void main (String []args){
        System.out.println("25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e \n" +
                "escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior \n" +
                "ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        String numeroDaConta = leia.nextLine();

        System.out.println("Digite quanto você tem de saldo :");
        double saldoNaConta = leia.nextDouble();

        System.out.println("Digite quanto você tem de débito :");
        double saldoDebito = leia.nextDouble();

        System.out.println("Digite quanto voce tem de crédito : ");
        double saldoCredito = leia.nextDouble();

        double saldoAtual =  saldoNaConta - saldoDebito + saldoCredito;

        if (saldoAtual >=0 ){
            System.out.println("O saldo atual é Positivo : " + saldoAtual);
        }
        else{
            System.out.println("O saldo atual é Negativo : " + saldoAtual);
        }
    }
}
