import java.util.Scanner;

public class Atividade05{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float valor;
        System.out.println("Digite seu valor em Dolar:");
        valor = input.nextFloat();
        Float dolar = 4.95f;
        System.out.println("Seu valor em Reais é: " + ( valor * dolar));
        input.close();
    }
}