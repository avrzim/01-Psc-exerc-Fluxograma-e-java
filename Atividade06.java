import java.util.Scanner;

public class Atividade06{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.println("Escreva sua idade: ");
        idade = input.nextInt();
        int meses;
        System.out.println("Escreva quantos meses se passaram desde o seu último aniversario");
        meses = input.nextInt();
        int diasdoano;
        diasdoano = 365;
        int diasdosmeses;
        diasdosmeses = 31;
        System.out.println("Sua idade em dias é: " + (idade * diasdoano + meses * diasdosmeses));
    }
}