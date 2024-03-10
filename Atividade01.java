import java.util.Scanner;

public class Atividade01{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float n1;
            System.out.println("Digite o primeiro número: ");
            n1 = input.nextFloat();
            float n2;
            System.out.println("Digite o segundo número: ");
            n2 = input.nextFloat();
            System.out.println("O resultado foi :"  + (n1 + n2));
            input.close();
        }
}