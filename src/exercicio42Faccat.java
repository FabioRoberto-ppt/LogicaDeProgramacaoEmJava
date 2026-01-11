import java.util.Scanner;

public class exercicio42Faccat {
    public static void main (String []args){
        System.out.println(") Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para \n" +
                "estar em condições, um dos\n" +
                " seguintes requisitos deve ser satisfeito: - Ter no mínimo 65 anos de idade. - Ter trabalhado no mínimo 30 anos. - Ter no mínimo 60 anos  e\n" +
                " ter trabalhado no mínimo 25 anos. \n" +
                "Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano \n" +
                "de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo \n" +
                "de trabalho do empregado e a mensagem 'Requerer aposentadoria'  ou  'Não requerer'.");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu numero de empregado: ");
        String numeroEmpregado = leia.nextLine();

        System.out.println ("Digite o seu ano de nascimento :");
        int anoDeNascimento = leia.nextInt();

        System.out.println ("Digite o ano que você entrou na empresa: ");
        int anoEntrouNaEmpresa = leia.nextInt();

        int idadeDoFuncionario = 2026 - anoDeNascimento;
        int anosTrabalhados = 2026 - anoEntrouNaEmpresa;

        if(idadeDoFuncionario >= 65 || anosTrabalhados >= 30 || idadeDoFuncionario >= 60 && anosTrabalhados >= 25 ) {
            System.out.println("Funcionário do código: "+ numeroEmpregado);
            System.out.println("idade do empregado é : " + idadeDoFuncionario);
            System.out.println("Funcionário tem "+ anosTrabalhados+" anos trabalhados ");
            System.out.println("Requer aposentadoria ");
        }else{
            System.out.println("Não requer aposentadoria: ");
        }
    }
}
