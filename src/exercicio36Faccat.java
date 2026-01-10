import java.util.Scanner;

public class exercicio36Faccat {
    public static void main (String []args) {
        System.out.println("6) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades \n" +
                "dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma \n" +
                "das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais \n" +
                "novo com a mulher mais velha. ");
        System.out.println("");
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro homem : ");
        int primeiroHomem = leia.nextInt();

        System.out.println("Digite a idade do segundo homem : ");
        int segundoHomem = leia.nextInt();

        System.out.println("Digite a idade da primeira mulher: ");
        int primeiraMulher = leia.nextInt();

        System.out.println("Digite a idade da segunda mulher :");
        int segundaMulher = leia.nextInt();

        if (primeiroHomem > segundoHomem) {
            if (primeiraMulher < segundaMulher) {
                int melherMaisNova = primeiroHomem + primeiraMulher;
                int melherMaisVelha = segundoHomem * segundaMulher;
                System.out.println("A soma do homem mais velho com a mulher mais nova é: " + melherMaisNova);
                System.out.println("A soma do homem mais novo com a mulher mais velha é: " + melherMaisVelha);

            } else if (segundoHomem > primeiroHomem && primeiraMulher < segundaMulher) {
                int melherMaisNova = segundoHomem + segundaMulher;
                int melherMaisVelha = primeiroHomem * primeiraMulher;
                System.out.println("A soma do homem mais velho com a mulher mais nova é: " + melherMaisNova);
                System.out.println("A soma do homem mais novo com a mulher mais velha é: " + melherMaisVelha);

            } else if (segundoHomem > primeiroHomem && primeiraMulher < segundaMulher) {
                int melherMaisNova = segundoHomem + primeiraMulher;
                int melherMaisVelha = primeiroHomem * segundaMulher;
                System.out.println("A soma do homem mais velho com a mulher mais nova é: " + melherMaisNova);
                System.out.println("A soma do homem mais novo com a mulher mais velha é: " + melherMaisVelha);

            }else if (primeiroHomem > segundoHomem && segundaMulher < primeiraMulher){
                int melherMaisNova = primeiroHomem + segundaMulher;
                int melherMaisVelha = segundoHomem * primeiraMulher;
                System.out.println("A soma do homem mais velho com a mulher mais nova é: " + melherMaisNova);
                System.out.println("A soma do homem mais novo com a mulher mais velha é: " + melherMaisVelha);
            }
        }
    }
}
