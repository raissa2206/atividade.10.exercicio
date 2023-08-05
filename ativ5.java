import java.util.Scanner;

public class ativ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("O número é maior que 10.");
        } else {
            System.out.println("O número não é maior que 10.");
        }

        scanner.close();
    } 
}
