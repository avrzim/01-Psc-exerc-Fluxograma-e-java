import java.util.Scanner;

public class Atividade03{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome;
        System.out.println("Escrava seu nome: ");
        nome = input.nextLine();
        System.out.println("Seja bem vindo " + nome);
        input.close();

    }
}