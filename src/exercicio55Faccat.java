import java.util.Scanner;

public class exercicio55Faccat {
    public static void main (String []args){
        System.out.println("55) Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10). ");
        System.out.println("");

        Scanner leia = new Scanner(System.in);

        int tabuada = 0;
        int tabuada1 = 0;

        do {
            System.out.println("8 x "+tabuada);
            tabuada++;
        }while (tabuada <= 10);


        while (tabuada1 <= 10 ){
            System.out.println("8 x"+ tabuada1);
            tabuada1++;
        }

    }
}
