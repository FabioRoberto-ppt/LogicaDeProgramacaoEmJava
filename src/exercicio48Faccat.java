import java.util.Scanner;

public class exercicio48Faccat {
    public static void main(String []args) {
        System.out.println("Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a \n" +
                "média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada \n" +
                "nota.");

        System.out.println("");

        Scanner leia = new Scanner(System.in);

        double numero1, numero2, media;

        do{
            System.out.println("Digite a primeira nota : ");
            numero1 = leia.nextDouble();

            System.out.println("Digite a segunda nota : ");
            numero2 = leia.nextDouble();

            if(numero1 < 0 || numero1 > 10 && numero2 < 0 || numero2 > 10 ){
                System.out.println("Digite um numero válido de 10 a 0");
            }

        }while(numero1 < 0 || numero1 > 10 && numero2 < 0 || numero2 > 10);
        media = (numero1 + numero2)/2;

        System.out.println("A média final do aluno foi : " + media);
    }
}
