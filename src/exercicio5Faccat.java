public class exercicio5Faccat {
    public static void main (String[] args ){
        System.out.println("5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu " +
                "antecessor.");

        java.util.Scanner leia = new java.util.Scanner(System.in);

        System.out.println(" Digite um numero para saber seu antecessor ");
        int antecessor = leia.nextInt();
        antecessor = antecessor -1;

        System.out.println("o numero antecessor é :" + antecessor);
    }
}
