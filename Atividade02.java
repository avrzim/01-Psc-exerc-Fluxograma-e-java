import java.util.Scanner;

public class Atividade02{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Float n1;
        System.out.println("Escreva o primeiro numero: ");
        n1 = input.nextFloat();
        Float n2;
        System.out.println("Escreva o segundo numero: ");
        n2 = input.nextFloat();
        System.out.println("O resultado foi: "+ (n1 / n2));
        input.close();
    }

}
