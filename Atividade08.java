import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float metros;
        System.out.println("Digite quantos metros: ");
        metros = input.nextFloat();
        double centimetros;
        centimetros = metros * 100;
        System.out.println("Os centimetros são: " + centimetros);
        input.close();
    }
}