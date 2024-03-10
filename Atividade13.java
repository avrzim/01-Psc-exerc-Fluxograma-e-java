import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas;
        System.out.println("Digite suas horas de trabalho mensal: ");
        horas = input.nextInt();
        float valorPorHoras;
        System .out.println("Digite o valor que você recebe por hora trabalhada: ");
        valorPorHoras = input.nextFloat();
        float INSS;
        System.out.println("Digite o valor de desconto do INSS: ");
        INSS = input.nextFloat();
        float salarioBruto;
        salarioBruto = horas * valorPorHoras;
        float salarioLiquido;
        salarioLiquido = salarioBruto - (INSS / 100 * salarioBruto);
        System.out.println("Seu salario liquido é: " + salarioLiquido);     
        input.close();
        
    }
}