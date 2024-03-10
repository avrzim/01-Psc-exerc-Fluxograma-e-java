import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite o número aqui: ");
        numero = input.nextInt();
        int sucessor;
        sucessor = numero + 1;
        int antecessor;
        antecessor = numero - 1;
        System.out.println("O sucessor do seu número é: "+ sucessor + "\n" + "O seu antecessor é: " + antecessor);
        input.close();
    }
}