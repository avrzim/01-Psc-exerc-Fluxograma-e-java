import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float raio;
        System.out.println("Digite a medida do raio: ");
        raio = input.nextFloat();
        float resultado;
        float pi = (float) Math.PI;
        resultado = (raio * raio) * pi;
        System.out.println("A área do círculo é: " + resultado);
        input.close();
    }
}