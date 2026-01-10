import java.util.Scanner;

public class exercicio31Faccat {
    public static void main(String []args){
        System.out.println("31) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam \n" +
                "ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma \n" +
                "dos outros 2 lados. ");
        System.out.println("");

        Scanner leia =new Scanner(System.in);

        System.out.println("Digite o valor de A:  ");
        int a = leia.nextInt();

        System.out.println("Digite o valor do  B:  ");
        int b = leia.nextInt();

        System.out.println("Digite o valor do C: ");
        int c = leia.nextInt();

        if(b + c > a && a + c > b && a + b > c){
            System.out.println("é um triangulo ");
        }else{
            System.out.println("não é um triangulo");
        }
    }
}
