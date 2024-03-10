import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temperaturaFh;
        System.out.println("Digite a temperatura em Farenheit: ");
        temperaturaFh = input.nextFloat();
        Float celcius;
        celcius = ((temperaturaFh - 32) / 9) * 5;
        System.out.println("O valor em celcius é: " + celcius);
        input.close();
    }
}