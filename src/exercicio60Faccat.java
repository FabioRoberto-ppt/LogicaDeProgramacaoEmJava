import java.util.Scanner;

public class exercicio60Faccat {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] valores = new int[10];
        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor:");
            valores[i] = leia.nextInt();

            if (valores[i] >= 10 && valores[i] <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Valores dentro do intervalo [10,20]: " + dentro);
        System.out.println("Valores fora do intervalo [10,20]: " + fora);
    }
}