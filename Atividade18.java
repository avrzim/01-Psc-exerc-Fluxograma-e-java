import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float AlturaDoDegrau;
        System.out.println("Digite a altura do degrau em metros: ");
        AlturaDoDegrau = input.nextFloat();
        float AlturaDaEscada;
        System.out.println("Digite a altura total da escada: ");
        AlturaDaEscada = input.nextFloat();
        float quantidadeDegrau;
        quantidadeDegrau = (int) (AlturaDaEscada / AlturaDoDegrau);
        System.out.println("A quantidade de degraus para subir a escada é: " + quantidadeDegrau);

        input.close();
    }
}