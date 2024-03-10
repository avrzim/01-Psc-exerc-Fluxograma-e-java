import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float KM;
        System.out.println("Digite a distância total percorrida em KM: ");
        KM = input.nextFloat();
        float quantidade;
        System.out.println("Digite aqui a quantida total de gasolina gasta: ");
        quantidade = input.nextFloat();
        float consumo;
        consumo = KM / quantidade;
        System.out.println("O consumo médio de combústivel é de: " + consumo + " KM por litro");
        
        input.close();
    }
}