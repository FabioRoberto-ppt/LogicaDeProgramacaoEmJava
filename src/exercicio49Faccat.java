import java.util.Scanner;

public class exercicio49Faccat {
    public static void main (String []args) {
        System.out.println("49) Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao final do exercício [48]. Se for \n" +
                "respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o algoritmo. ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        double nota1, nota2, media;
        char simOuNao;

        System.out.println("Digite a primeira nota: ");
        nota1 = leia.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("VALOR INVALIDO ");
            System.out.println("Digite a primeira nota: ");
            nota1 = leia.nextDouble();
        }

        System.out.println("Digite a segunda nota: ");
        nota2 = leia.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.println("VALOR INVALIDO ");
            System.out.println("Digite a segunda nota: ");
            nota2 = leia.nextDouble();
        }
        media = (nota1 + nota2) / 2;
        System.out.println("a media do aluno é :" + media);
        System.out.println("");

        do {
            System.out.println("Deseja fazer outro calculo? ");
            System.out.println("S");
            System.out.println("N");

            simOuNao = leia.next().toUpperCase().charAt(0);

            if (simOuNao == 'S') {
                System.out.println("Digite a primeira nota: ");
                nota1 = leia.nextDouble();

                while (nota1 < 0 || nota1 > 10) {
                    System.out.println("VALOR INVALIDO ");
                    System.out.println("Digite a primeira nota: ");
                    nota1 = leia.nextDouble();
                }
                System.out.println("Digite a segunda nota: ");
                nota2 = leia.nextDouble();

                while (nota2 < 0 || nota2 > 10) {
                    System.out.println("VALOR INVALIDO ");
                    System.out.println("Digite a segunda nota: ");
                    nota2 = leia.nextDouble();
                }
                System.out.println("a media do aluno é :" + media);
            } else {
                System.out.println("Saindo do sistema...");
            }
        } while (simOuNao == 'S');
    }
}
