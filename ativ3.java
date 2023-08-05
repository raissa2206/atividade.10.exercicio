import java.util.Scanner;

public class ativ3 {
   public static void main(String[] args) {
        final int TOTAL_PESSOAS = 75;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("A pessoa " + i + " é maior de idade.");
            } else {
                System.out.println("A pessoa " + i + " é menor de idade.");
            }
        }

        scanner.close();
    } 
}
