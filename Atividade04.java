import java.util.Scanner;

public class Atividade04{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome;
        System.out.println("Escreva seu Nome: ");
        nome = input.nextLine();
        String endereco;
        System.out.println("Escreva seu Endereço: ");
        endereco = input.nextLine();
        String numero;
        System.out.println("Escreva seu Numero de Telefone: ");
        numero = input.nextLine();
        System.out.println("Seu nome é: " + nome + "\n" + "Seu endereço é: " + endereco + "\n" + "Seu telefone é: " + numero );
        input.close();
    }
}