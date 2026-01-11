import java.util.Scanner;

public class exercicio38Faccat {
    public static void main (String []args){
        System.out.println("38) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja \n" +
                "diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a \n" +
                "mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se \n" +
                "esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a \n" +
                "senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.");

        System.out.println("");

        Scanner leia = new Scanner(System.in);

                System.out.print("Digite o código do usuário: ");
                int codigo = leia.nextInt();

                if (codigo != 1234) {
                    System.out.println("Usuário inválido!");
                } else {
                    System.out.print("Digite a senha: ");
                    int senha = leia.nextInt();

                    if (senha != 9999) {
                        System.out.println("Senha incorreta");
                    } else {
                        System.out.println("Acesso permitido");
                    }
                }
                leia.close();
    }
}
