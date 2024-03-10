import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A;
        System.out.println("Escreva o valor A:");
        A = input.nextLine();
        String B;
        System.out.println("Escreva o valor B: ");
        B = input.nextLine();
        String AmudarparaB;
        AmudarparaB = B;
        String BmudarparaA;
        BmudarparaA = A;
        System.out.println("O valor trocado de A é: " + AmudarparaB + "\n" + "O valor trocado de B é: " + BmudarparaA);      
        input.close();
    }
}