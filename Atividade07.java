import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario;
        System.out.println("Qual o valor do seu salário?");
        salario = input.nextFloat();
        float reajuste;
        reajuste = salario / 100;
        System.out.println("O reajuste do seu salario é: " + (salario + reajuste * 7));
        
        input.close();
    }
}